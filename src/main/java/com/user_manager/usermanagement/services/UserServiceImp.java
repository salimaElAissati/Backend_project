package com.user_manager.usermanagement.services;

import com.user_manager.usermanagement.entities.User1.UsersEntity;
import com.user_manager.usermanagement.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImp implements   UserService{
    @Autowired
    UserRespository userRespository;

    @Override
    public void saveUser(UsersEntity user) {
        userRespository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRespository.deleteById(id);
    }

    @Override
    public List<UsersEntity> getAllUsers() {
        return (List<UsersEntity>) userRespository.findAll();
    }

    @Override
    public Optional<UsersEntity> getById(int id) {
        return userRespository.findById(id);
    }

    @Override
    public void updateUserId(int id, UsersEntity updated) {

    }

    @Override
    public UsersEntity existe(String mail , String password) {
       UsersEntity user= userRespository.findByEmailAndPassword(mail , password);
       return  user;
    }
}
