package com.user_manager.usermanagement.controllers;

import com.user_manager.usermanagement.entities.User1.UsersEntity;
import com.user_manager.usermanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users/")
public class usersController {

    @Qualifier("userService")
    @Autowired
    UserService service;
    @GetMapping("/hello")
    public List<UsersEntity> getUser(){
       return  service.getAllUsers();
    }

    @PostMapping("/add")
    public void AddUser(@RequestBody UsersEntity user){
        service.saveUser(user);
    }
@GetMapping("/delete/{id}")
public String deleteUser(@PathVariable("id") int id){
        service.deleteUser(id);
        return "Succe";
}
    @GetMapping("/gett/{id}")
    public Optional<UsersEntity> getUserByid(@PathVariable("id") int id){
        return service.getById(id);

    }
    @PostMapping("/login/{mail}/{passwprd}")
    public UsersEntity Logim(@PathVariable("mail") String mail , @PathVariable("passwprd") String passwprd ){

        UsersEntity user= service.existe(mail , passwprd);
        if (user==null)System.out.println("check ur mail or password please");
        return  user;
    }



}
