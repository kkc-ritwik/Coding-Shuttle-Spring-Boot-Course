package com.homework.week1homework;

import org.springframework.stereotype.Component;

@Component("chocolateFrosting")
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}