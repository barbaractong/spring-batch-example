package com.example.springbatch.springbatcheample.repository;

import com.example.springbatch.springbatcheample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
