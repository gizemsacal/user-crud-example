package com.example.usercrudexample.Controller;

import com.example.usercrudexample.model.User;
import com.example.usercrudexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

   public User createUser(User user){
       return userRepository.save(user);

   }
   public User getUser(Integer id){
       return userRepository.findById(id).get();
    }
    public User updateUser(User user, Integer id){
       user.setId(id);
       return userRepository.save(user);

    }

    public void deleteUser(Integer id){
       userRepository.deleteById(id);

    }
    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User getUserByAge(int age){
        return userRepository.findByAge(age);
    }
    public List<User> getAllUsers(){
       return userRepository.findAll();
    }
}
