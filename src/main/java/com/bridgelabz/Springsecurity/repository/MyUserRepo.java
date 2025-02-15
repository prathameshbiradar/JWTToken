package com.bridgelabz.Springsecurity.repository;

import com.bridgelabz.Springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepo extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);
}
