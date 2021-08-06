package com.example.usercrudexample.Controller;

import com.example.usercrudexample.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/user")
    User creatUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/id/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/age/{age}")
    public User getUserByAge(@PathVariable int age) {
        return userService.getUserByAge(age);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/name/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userService.updateUser(user, id);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
    @GetMapping("users")
    public List<User> getAllUsers(){
       return userService.getAllUsers();
    }
}
