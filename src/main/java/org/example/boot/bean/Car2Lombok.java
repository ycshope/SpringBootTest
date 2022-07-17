package org.example.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@AllArgsConstructor //自动实现全参构造
@NoArgsConstructor  //自动实现无参构造
@ToString   //自动实现toString
@Data //自动实现get和set
@ConfigurationProperties(prefix = "mycar2")
@Component
public class Car2Lombok {
    private String brand;
    private Integer price;
}
