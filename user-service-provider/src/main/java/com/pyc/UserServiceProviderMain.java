package com.pyc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class UserServiceProviderMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
