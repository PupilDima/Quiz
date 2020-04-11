package com.qucat.quiz.controllers;

import com.qucat.quiz.repositories.entities.Role;
import com.qucat.quiz.repositories.entities.User;
import com.qucat.quiz.services.ServiceAddUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

       @Autowired
       ServiceAddUser serviceAddUser;

       @GetMapping("/")
       public String home2(Model model){
              serviceAddUser.addUser(new User("name", "sname", "login", "blagij00@gmail.com", "pass", Role.USER));
              return "forward:/index.html";
       }

       @GetMapping("/login")
       public String home(Model model) {
              serviceAddUser.addUser(new User("name", "sname", "login", "blagij00@gmail.com", "pass", Role.USER));
              return "forward:/index.html";
       }
}
