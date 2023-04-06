package com.example.UserRestTemplate.Service;

import com.example.UserRestTemplate.Entity.ResponseDto;
import com.example.UserRestTemplate.Entity.User;

import java.util.List;

public interface IUserService {

	 User saveUser(User user);

	 ResponseDto getUser(int userId);

	List<User> getAllUsers();
}
