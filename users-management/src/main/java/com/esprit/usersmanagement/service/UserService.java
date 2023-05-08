package com.esprit.usersmanagement.service;

import com.esprit.usersmanagement.dto.UserDTO;

public interface UserService {

    UserDTO getUserByUsername(String username);

    boolean isUserExist(String email, String username);

    int createUser(String userName, String password, String email, String name);

    void sendVerificationEmail(String email);

    int updatePassword(String username, String password);

    void deleteUser(String id);

}
