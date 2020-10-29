package com.ju.shiro02.config;

import com.ju.shiro02.pojo.User;
import com.ju.shiro02.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权啦！！！===================");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //simpleAuthorizationInfo.addRole("user");
        //simpleAuthorizationInfo.addStringPermission("user:add");

        Subject subject = SecurityUtils.getSubject();
        User principal = (User) subject.getPrincipal();
        System.out.println(principal.getPerms());
        simpleAuthorizationInfo.addStringPermission(principal.getPerms());

        return simpleAuthorizationInfo;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken =(UsernamePasswordToken) token;
        User userByName = userService.getUserByName(usernamePasswordToken.getUsername());

        if (userByName == null) {
            return null;
        }
        //校验并给予user对象
        return new SimpleAuthenticationInfo(userByName, userByName.getPwd(), "");
    }
}
