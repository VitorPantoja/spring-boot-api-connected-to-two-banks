package com.leaddell.emotionreportapi.repository.user;

import com.leaddell.emotionreportapi.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> { }
