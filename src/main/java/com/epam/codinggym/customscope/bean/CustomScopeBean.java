package com.epam.codinggym.customscope.bean;

import java.util.concurrent.ThreadLocalRandom;

public class CustomScopeBean {
    private final int id;

    public CustomScopeBean() {
        this.id = ThreadLocalRandom.current().nextInt();
    }

    public void speak() {
        System.out.printf("I'm bean generated with %d \n", id);
    }
}
