package com.qucat.quiz;

import com.qucat.quiz.repositories.entities.Role;
import com.qucat.quiz.repositories.entities.User;
import com.qucat.quiz.services.ServiceAddUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class QuizApplication {

    @Autowired
    ServiceAddUser serviceAddUser;

    public static void main(String[] args) {

        SpringApplication.run(QuizApplication.class, args);
        QuizApplication quizApplication=new QuizApplication();
        quizApplication.serviceAddUser.addUser(new User("name", "sname", "login", "blagij00@gmail.com", "pass", Role.USER));
    }

}
