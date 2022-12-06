package org.example.boot.controller;

import com.mysql.cj.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.example.boot.bean.Account;
import org.example.boot.bean.City;
import org.example.boot.service.AccountService;
import org.example.boot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class TestMyBatisController {
    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;

    //调用service,返回json
    @ResponseBody
    @GetMapping("/acct")
    public Account getById(@RequestParam("id") Long id) {
        return accountService.getAccById(id);
    }

    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id) {
        return cityService.getCityById(id);
    }

    @ResponseBody
    @PostMapping("/city")
    public City addCity(City city) {
        cityService.insertCity(city);
        return city;
    }
}
