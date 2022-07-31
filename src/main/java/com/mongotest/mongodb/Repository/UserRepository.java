package com.mongotest.mongodb.Repository;

import com.mongotest.mongodb.collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    //public User findUserByName(@PathParam('name') String name)
}
