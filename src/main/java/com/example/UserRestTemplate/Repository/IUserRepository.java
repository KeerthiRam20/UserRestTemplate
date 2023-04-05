package com.example.UserRestTemplate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UserRestTemplate.Entity.User;

@Repository
public interface IUserRepository  extends JpaRepository<User, Integer> { 

}
