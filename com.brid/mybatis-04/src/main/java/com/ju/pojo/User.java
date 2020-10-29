package com.ju.pojo;

import lombok.*;

@Data                 // get set
@AllArgsConstructor   // 有参构造器
@NoArgsConstructor    // 无参构造器
@EqualsAndHashCode    // equals和hashcode
@ToString             // toString
public class User {
    private int id;
    private String name;
    private String password;
}
