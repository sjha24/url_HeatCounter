package com.saurav.url_heat_counter.service;

import com.saurav.url_heat_counter.model.User;
import com.saurav.url_heat_counter.repo.UrlHeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHeatService {
    @Autowired
    UrlHeatRepo urlHeatRepo;
    public User getCount() {
        return urlHeatRepo.getCounter();
    }

    public User getUrlHeatCounterByUserName(String userName) {
        return urlHeatRepo.getUrlHeatCountByUserName(userName);
    }
}
