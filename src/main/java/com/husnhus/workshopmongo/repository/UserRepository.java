package com.husnhus.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.husnhus.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{	

}
