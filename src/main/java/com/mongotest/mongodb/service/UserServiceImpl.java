package com.mongotest.mongodb.service;

import com.mongotest.mongodb.Repository.UserRepository;
import com.mongotest.mongodb.collection.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override

    public String save(User user)
    {
        return userRepository.save(user).getUserId();
    }


}
