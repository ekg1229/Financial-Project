package com.project.financial.controller;

import com.project.financial.dto.SignUpDto;
import com.project.financial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping(value = "/new")
    public String memberForm(Model model){
        model.addAttribute("SignUpDto", new SignUpDto());
        return "users/SignUpForm";
    }
}
