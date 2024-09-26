package com.springcore.di;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service//业务层的组件
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        log.info("1111111111111111111");
    }
}
