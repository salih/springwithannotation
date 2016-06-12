package com.gg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by salih on 10.06.2016.
 */
@Configuration
public class AppConfig {
@Bean
@Scope("prototype")
    public BeanA myBean(){

    return new BeanA();
}
@Bean
@Scope("prototype")
    public BeanB BeanB(){
    return new BeanB();
}
}
