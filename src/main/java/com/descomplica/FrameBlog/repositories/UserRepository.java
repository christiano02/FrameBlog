package com.descomplica.FrameBlog.repositories;

import com.descomplica.FrameBlog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // avisa que está mexendo com dados
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String login);
}
