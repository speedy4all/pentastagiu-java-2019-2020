package com.pentalog.pentastagiu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myStore")
public class Store {

    //@Autowired
    @Resource
    private Address address;

    /*public Store(Address address) {
        this.address = address;
    }*/
}
