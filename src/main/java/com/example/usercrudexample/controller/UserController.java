package com.example.usercrudexample.Controller;

import com.example.usercrudexample.Service.UserService;
import com.example.usercrudexample.Service.UserServiceImpl;
import com.example.usercrudexample.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    final UserService userServiceImpl;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/user")
    User creatUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/id/{id}")
    public User getUser(@PathVariable Integer id) {
        return userServiceImpl.getUser(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/age/{age}")
    public User getUserByAge(@PathVariable int age) {
        return userServiceImpl.getUserByAge(age);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/name/{name}")
    public User getUserByName(@PathVariable String name) {
        return userServiceImpl.getUserByName(name);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userServiceImpl.updateUser(user, id);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userServiceImpl.deleteUser(id);
    }
    @GetMapping("users")
    public List<User> getAllUsers(){
       return userServiceImpl.getAllUsers();
    }
}
