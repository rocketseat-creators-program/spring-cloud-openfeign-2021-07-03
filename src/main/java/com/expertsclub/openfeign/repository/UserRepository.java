package com.expertsclub.openfeign.repository;

import com.expertsclub.openfeign.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
