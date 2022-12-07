package ru.vladislav_smirnov.spring_boot_security.dao;

import ru.vladislav_smirnov.spring_boot_security.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUsers(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

    User findByEmail(String email);
}
