package org.example.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

//不是组件
@ConfigurationProperties(prefix = "mycar1") //将properties.mycar绑定;注意配置的名称要和类的变量名一致;
public class Car1 {
    private String brand;
    private Integer price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
