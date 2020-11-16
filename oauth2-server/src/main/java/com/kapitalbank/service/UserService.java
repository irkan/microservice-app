package com.kapitalbank.service;

import com.kapitalbank.model.User;

public interface UserService {
    User retrieveUserByUsername(String username);
}