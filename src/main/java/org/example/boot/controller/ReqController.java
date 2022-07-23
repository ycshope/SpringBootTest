package org.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ReqController {
    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest req) {
        req.setAttribute("msg", "success...");
        req.setAttribute("code", 200);
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg, @RequestAttribute("code") Integer code, HttpServletRequest req) {
        //相当于 msg = req.getAttribute("msg");
        HashMap<Object, Object> map = new HashMap<>();
        map.put("msg", msg);
        map.put("code", code);
        return map;
    }
}
