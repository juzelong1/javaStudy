package com.ju.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

    private int book_id;
    private String book_name;
    private int book_counts;
    private String detail;
}
