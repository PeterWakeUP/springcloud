package com.example.demo.fallback;

import com.example.demo.clients.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by 苏文辉 on 2018/3/26.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
