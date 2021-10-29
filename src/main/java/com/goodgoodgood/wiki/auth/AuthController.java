package com.goodgoodgood.wiki.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AuthController {

    @GetMapping
    public String home(HttpSession session) {
        return session.getId();
    }

}
