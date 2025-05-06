package com.descomplica.FrameBlog.services.impl;

import com.descomplica.FrameBlog.models.User;
import com.descomplica.FrameBlog.repositories.UserRepository;
import com.descomplica.FrameBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        User existingUser = userRepository.findByUsername(user.getName());
        if(Objects.nonNull(existingUser)){
            throw new RuntimeException("Existing User");
        }
        User entity = new User(user.getName(), user.getRole(), user.getEmail(), user.getPassword(), user.getUserId());
        User newUser = userRepository.save(entity);
        return new User(newUser.getName(), newUser.getRole(), newUser.getEmail(), newUser.getPassword(), newUser.getUserId());
    }

    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public User update(long id, User user) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
