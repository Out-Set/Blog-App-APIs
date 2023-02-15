package com.project.blogappapis.Repository;

import com.project.blogappapis.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
