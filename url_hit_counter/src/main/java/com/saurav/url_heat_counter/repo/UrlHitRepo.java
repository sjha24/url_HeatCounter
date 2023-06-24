package com.saurav.url_heat_counter.repo;

import com.saurav.url_heat_counter.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UrlHitRepo {
    HashMap<String,User>map = new HashMap<>();
    public User getCounter() {
        if(!map.containsKey("visit")){
            User oneUser = new User("visit",1);
            map.put("visit",oneUser);
        }else {
            User oneUser = map.get("visit");
            int count = oneUser.getUrlHitCounter();
            oneUser.setUrlHitCounter(count+1);
        }
        return map.get("visit");
    }

    public User getUrlHitCountByUserName(String userName) {
        if(!map.containsKey(userName)){
            User userByUserName = new User(userName,1);
            map.put(userName,userByUserName);
        }else {
            User userByUserName = map.get(userName);
            int count = userByUserName.getUrlHitCounter();
            userByUserName.setUrlHitCounter(count+1);
        }
        return map.get(userName);
    }
}
