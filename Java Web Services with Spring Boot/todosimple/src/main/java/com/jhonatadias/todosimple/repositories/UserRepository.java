package com.jhonatadias.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhonatadias.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    List<User> findAll();

}
