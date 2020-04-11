package com.qucat.quiz.services;

import com.qucat.quiz.repositories.entities.Lang;
import com.qucat.quiz.repositories.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;


@Service
public class ServiceAddUser {

    @Autowired
    private EmailSender emailSender;

    public void addUser(User user) {
        int id = 5;//todo DAO add user
        String token = UUID.randomUUID().toString();
        //todo add token in DB
        emailSender.sendRegistrationMessage(user.getMail(), user.getLogin(), "http://localhost:8080/registration/"+token, Lang.UK);//todo get Lang, set url
    }

}

