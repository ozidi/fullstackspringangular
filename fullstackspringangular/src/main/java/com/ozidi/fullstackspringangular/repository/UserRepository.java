package com.ozidi.fullstackspringangular.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ozidi.fullstackspringangular.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
