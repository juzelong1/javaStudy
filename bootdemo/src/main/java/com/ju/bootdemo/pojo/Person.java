package com.ju.bootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Validated
@ConfigurationProperties("person")
public class Person {
    @Email(message = "邮件不正确")
    private String name;
    private int age;
    private Date birthday;
    private List<Integer> m;
    private Map<String, String> map;
    private Dog dog;
}
