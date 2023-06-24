package com.saurav.url_heat_counter.service;

import com.saurav.url_heat_counter.model.User;
import com.saurav.url_heat_counter.repo.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    @Autowired
    UrlHitRepo urlHitRepo;
    public User getCount() {
        return urlHitRepo.getCounter();
    }

    public User getUrlHeatCounterByUserName(String userName) {
        return urlHitRepo.getUrlHitCountByUserName(userName);
    }
}
