package com.user_manager.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LoginApiController {
    @Autowired
    UserService userService;
    @PostMapping("/user/login")
public ResponseEntity authenticateUser(@RequestBody Login login){
        List<String> userEmail=userService.checkUserEmail(login.getEmail());
        List<String> userPassword=userService.checkUserPassword(login.getPassword());
        if(userEmail.isEmpty() || userEmail==null){
            return new ResponseEntity("Email does not exist", HttpStatus.NOT_FOUND);
        }
        if(userPassword.isEmpty() || userPassword==null){
            return new ResponseEntity("Password does not exist", HttpStatus.NOT_FOUND);
        }
        String hashed_password=userService.checkUserPaasswordByEmail(login.getEmail());

      if(login.getPassword().equals(userPassword)){
          return new ResponseEntity("Incorrect email or password",HttpStatus.BAD_REQUEST);
      }
       User user=userService.getUserDetailByEmail(login.getEmail());

        return new ResponseEntity(user,HttpStatus.OK);
    }
}
