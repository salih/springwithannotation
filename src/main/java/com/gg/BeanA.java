package com.gg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by salih on 11.06.2016.
 */
@Component
public class BeanA {
@Autowired
    private BeanB myBeanB;

    public BeanA() {
    }

    public BeanB getMyBeanB() {
        return myBeanB;
    }

    public void setMyBeanB(BeanB myBeanB) {
        this.myBeanB = myBeanB;
    }
}
