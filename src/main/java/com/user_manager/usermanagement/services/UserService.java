package com.user_manager.usermanagement.services;

import com.user_manager.usermanagement.entities.User1.UsersEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public void saveUser(UsersEntity user);
    public void deleteUser(int id);
    public List<UsersEntity> getAllUsers();
    public Optional<UsersEntity> getById(int id);

    public void updateUserId(int id , UsersEntity updated);
    public UsersEntity existe(String mail , String password);



}
