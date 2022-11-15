package com.project.financial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncController {

    @GetMapping("/api/hello")
    public String hello() {
        return "안녕하세요 리액트와 스프링부트를 Proxy설정을 통해 연결하고 있습니다";
    }
}