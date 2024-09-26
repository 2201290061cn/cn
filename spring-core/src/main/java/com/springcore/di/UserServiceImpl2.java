package com.springcore.di;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
    @Override
    public void login() {
        System.out.println("6666666666");
    }
}
