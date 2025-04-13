package com.codingshuttle.ritwik.week1Introduction.introductiontospringboot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//@Repository
//@Service
//@Component
public class Apple {

    void eatApple(){
        System.out.println("I am eating an apple");

    }
@PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroying the Apple bean");
    }
}
