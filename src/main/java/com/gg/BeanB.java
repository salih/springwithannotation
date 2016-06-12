package com.gg;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by salih on 11.06.2016.
 */
@Component
public class BeanB {
    private String name = String.valueOf(new Random().nextInt(100));

    public String getName() {
        return name;
    }


}
