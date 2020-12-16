package com.datarynx.spring.data.user.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datarynx.spring.data.user.api.model.UserRequest;

@Repository
public interface UserRepository extends JpaRepository<UserRequest, Integer> {

}
