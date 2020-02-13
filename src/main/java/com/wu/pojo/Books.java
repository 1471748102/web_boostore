package com.wu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
