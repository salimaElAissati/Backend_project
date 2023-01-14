package com.user_manager.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRespository userRespository;
    public int registerNewUserSerciseMeth(String fname,String lname,String email,String password){
        return userRespository.registerNewUser(fname,lname,email,password);
    }
    public List<String> checkUserEmail(String email){
        return userRespository.checkUserEmail(email);
    }
    public List<String> checkUserPassword(String password){
        return userRespository.checkUserPassword(password);
    }
    public String checkUserPaasswordByEmail(String email){
        return userRespository.checkUserPasswordByEmail(email);
    }
    public User getUserDetailByEmail(String email){
        return userRespository.getUserDetailByEmail(email);
    }
}
