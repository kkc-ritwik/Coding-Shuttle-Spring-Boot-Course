package com.homework.week1homework;

import org.springframework.stereotype.Component;

@Component("strawberryFrosting")
public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}