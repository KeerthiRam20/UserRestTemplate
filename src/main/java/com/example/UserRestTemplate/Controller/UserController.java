package com.example.UserRestTemplate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.UserRestTemplate.Entity.ResponseDto;
import com.example.UserRestTemplate.Entity.User;
import com.example.UserRestTemplate.Service.IUserService;

import java.util.List;

@Controller
@RequestMapping("api/users")
public class UserController {
	
	@Autowired
	private IUserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") int userid ){
        ResponseDto responseDto = userService.getUser(userid );
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping(value = "/allusers")
    public ResponseEntity<List<User>> getAllDepartments()
    {
        List<User> allDepartments = userService.getAllUsers();
        return new ResponseEntity<List<User>>(allDepartments,HttpStatus.OK);
    }

}
