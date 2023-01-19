package com.user_manager.usermanagement.repository;

import com.user_manager.usermanagement.entities.User1.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<UsersEntity, Integer> {
    UsersEntity findByEmailAndPassword(String email,String password);
}
