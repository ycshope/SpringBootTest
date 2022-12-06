package org.example.boot.bean;

import lombok.Data;

//这是个数据
@Data
public class Account {
    private Long id;
    private String userId;
    private Integer money;
}
