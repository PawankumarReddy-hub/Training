package com.org.md2.SpringbootApiMongoDbApplication2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.md2.SpringbootApiMongoDbApplication2.model.User;

public interface UserRepo extends MongoRepository<User,Integer> {

}
