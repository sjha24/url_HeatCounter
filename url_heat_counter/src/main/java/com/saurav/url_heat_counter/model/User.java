package com.saurav.url_heat_counter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
       private String userName;
       private int urlHitCounter;
}
