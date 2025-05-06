package com.descomplica.FrameBlog.services;

import com.descomplica.FrameBlog.models.User;

import java.util.List;

public interface UserService {
    //metodo de salvar o usuario
    User save(User user);

    List<User> getAll();

    User get(long id);

    User update(long id, User user);

    void delete(long id);
}
