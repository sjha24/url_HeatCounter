package com.saurav.url_heat_counter.controller;

import com.saurav.url_heat_counter.model.User;
import com.saurav.url_heat_counter.service.UrlHeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/visitor-count-app")
public class UrlHeatCounter {
    @Autowired
    UrlHeatService urlHeatService;
    @GetMapping(value = "count")
    public User getUrlHeatCounter(){
        return urlHeatService.getCount();
    }
    @GetMapping(value = "userName/{userName}/count")
    public User getUrlHeatCounterByUserName(@PathVariable String userName){
        return urlHeatService.getUrlHeatCounterByUserName(userName);
    }
}
