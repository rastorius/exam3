package com.xpfarm.exam3.service;

import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {
    @Override
    public String hello() {
        return "Hello World!";
    }
}
