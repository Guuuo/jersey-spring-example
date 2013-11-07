package com.niko.example.jersey.service.impl;

import com.niko.example.jersey.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author nikog
 */
@Service
public class UserServiceImpl implements UserService {

    public String load(String userName) {
        return String.format("Hi, %s. It's Jersey + Spring example.", userName);
    }
}
