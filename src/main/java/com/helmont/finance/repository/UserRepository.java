package com.helmont.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helmont.finance.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
