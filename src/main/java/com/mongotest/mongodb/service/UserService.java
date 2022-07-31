package com.mongotest.mongodb.service;

import com.mongotest.mongodb.Repository.UserRepository;
import com.mongotest.mongodb.collection.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {
    String save(User user);
}

