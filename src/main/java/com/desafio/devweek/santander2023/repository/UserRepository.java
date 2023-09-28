package com.desafio.devweek.santander2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.devweek.santander2023.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
