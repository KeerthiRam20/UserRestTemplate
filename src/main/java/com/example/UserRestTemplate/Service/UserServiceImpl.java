package com.example.UserRestTemplate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.UserRestTemplate.Entity.DepartmentDto;
import com.example.UserRestTemplate.Entity.ResponseDto;
import com.example.UserRestTemplate.Entity.User;
import com.example.UserRestTemplate.Entity.UserDto;
import com.example.UserRestTemplate.Repository.IUserRepository;

import java.util.List;

@Service
public class UserServiceImpl  implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;
	@Autowired
    private RestTemplate restTemplate;


    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public ResponseDto getUser(int userid ) {

        ResponseDto responseDto = new ResponseDto();
        User user = userRepository.findById(userid ).get();
        UserDto userDto = mapToUser(user);

        //Using RestTemplate to make a REST API call to department-service
        ResponseEntity<DepartmentDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8082/api/departments/" + user.getUserid(),
                DepartmentDto.class);

        DepartmentDto departmentDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());
        //setting the user and department from the response entity
        responseDto.setUser(userDto);
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    //Mapping the user entity to userdto
    private UserDto mapToUser(User user){
        UserDto userDto = new UserDto();
        userDto.setUserid(user.getUserid());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}