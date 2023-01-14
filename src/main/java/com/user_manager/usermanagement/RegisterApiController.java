package com.user_manager.usermanagement;

import org.aspectj.weaver.BCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RegisterApiController {
    @Autowired
    UserService userService;
    @PostMapping("/user/register")
    public ResponseEntity registerNewUser(@RequestParam("first_name") String first_name,
                                          @RequestParam("last_name") String last_name,
                                          @RequestParam("email") String email,
                                          @RequestParam("password") String password){
      //  String hashed_password= BCrypt.hashpw(password,BCrypt.gensalt());

        if(first_name.isEmpty() || last_name.isEmpty() || email.isEmpty() || password.isEmpty()){
            return new ResponseEntity<>("Please Complete all Fields", HttpStatus.BAD_REQUEST);
        }
        int result=userService.registerNewUserSerciseMeth(first_name,last_name,email,password);
        if(result!=1){
            return new ResponseEntity<>("Failed to Register User",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("User Registared Successfully",HttpStatus.OK);
    }

}
