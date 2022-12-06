package org.example.boot.service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.example.boot.bean.City;
import org.example.boot.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getCityById(long id) {
        return cityMapper.getById(id);
    }

    /**
     * 对应的xml
     *  <insert id="insert" useGeneratedKeys="true" keyProperty="id"> 将结果的id返回
     *     insert into city(`name`,`state`,`country`) values(#{name},#{state},#{country})
     *     </insert>
     */

    @Insert("insert into city(`name`,`state`,`country`) values(#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true , keyProperty = "id")
    public City insertCity(City city) {
        cityMapper.insert(city);
        return city;
    }
}
