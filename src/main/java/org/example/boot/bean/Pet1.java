package org.example.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Pet1 {
    private String name;
    private Double weight;
}
