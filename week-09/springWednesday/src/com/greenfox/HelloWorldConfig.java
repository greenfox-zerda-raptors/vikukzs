package com.greenfox;

/**
 * Created by Zsuzska on 2016. 12. 21..
 */
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}