package com.husnhus.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.husnhus.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{	

}
