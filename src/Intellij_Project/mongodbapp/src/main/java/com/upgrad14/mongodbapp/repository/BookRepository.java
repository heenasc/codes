package com.upgrad14.mongodbapp.repository;

import com.upgrad14.mongodbapp.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
