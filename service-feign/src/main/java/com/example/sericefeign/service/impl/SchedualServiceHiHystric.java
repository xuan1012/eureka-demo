package com.example.sericefeign.service.impl;

import com.example.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @program: eureka-demo
 * @author: xuan
 * @create: 2019-08-09 15:38
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
