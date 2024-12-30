package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User createNewUser(User user);
    User getUserById(Long userId);
    List<User> getAllusers();
    User updateUser(User user);
    void deleteUser(Long userId);
}
