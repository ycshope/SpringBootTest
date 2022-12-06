package org.example.boot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.boot.bean.City;

@Mapper
public interface CityMapper {

    //纯注解方式,一般只用于非纯简单的sql
    @Select("select * from city where id=#{id}")
    public City getById(Long id);

    public void insert(City city);
}
