package dev.reid.controllers;

import dev.reid.dtos.LoginCredentials;
import dev.reid.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody LoginCredentials loginCredentials)
    {

        return loginService.authenticateUser(loginCredentials);
    }
}
