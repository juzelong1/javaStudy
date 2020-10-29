package com.ju.shiro02.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        //anon  无需认证
        //authc 需要登陆
        //user  需要记住我
        //perms 需要要有权限
        //role  需要有角色
        Map<String, String> filterMap = new LinkedHashMap<>();

        filterMap.put("/usr/add", "perms[user:add]");

        filterMap.put("/usr/*", "authc");
        bean.setFilterChainDefinitionMap(filterMap);

        //设置登陆请求
        bean.setLoginUrl("/toLogin");

        //设置未授权的页面
        bean.setUnauthorizedUrl("/noauth");


        return bean;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

        securityManager.setRealm(userRealm);
        return securityManager;
    }

    @Bean
    public UserRealm userRealm() {
        return new UserRealm();
    }

}
