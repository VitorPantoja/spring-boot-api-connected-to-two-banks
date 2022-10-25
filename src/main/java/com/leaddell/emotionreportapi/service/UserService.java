package com.leaddell.emotionreportapi.service;

import com.leaddell.emotionreportapi.model.user.User;
import com.leaddell.emotionreportapi.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository personRepo;

    public List getAllPersons() {
        return (List) personRepo.findAll();
    }

    public User savePerson(User person) {
        return personRepo.save(person);
    }
}
