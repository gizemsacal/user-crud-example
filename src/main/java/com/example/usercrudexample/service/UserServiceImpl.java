package com.example.usercrudexample.Service;

import com.example.usercrudexample.model.User;
import com.example.usercrudexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);

    }

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user, Integer id) {
        user.setId(id);
        return userRepository.save(user);

    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);

    }

    @Override
    public User getUserByName(String name) {
        return userRepository.findByName(name);

    }

    @Override
    public User getUserByAge(int age) {
        return userRepository.findByAge(age);

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
