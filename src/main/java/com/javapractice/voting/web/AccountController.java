package com.javapractice.voting.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/account")
public class AccountController {

    public Object get(@AuthenticationPrincipal Object authUser) {
        return authUser;
    }
}
