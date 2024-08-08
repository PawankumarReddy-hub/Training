package com.org.md.SpringbootApiMongoDbApplication;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book,Integer> {

}
