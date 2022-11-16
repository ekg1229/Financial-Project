package com.project.financial.controller;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

@RestController
@RequestMapping("/api/server")
public class Controller {
    @GetMapping("/hello")
    public String hello(){
        return("hello");
    }

    @GetMapping("/hello/2")
    public String hello2() {
//        String url = "http://127.0.0.1:5000/tospring";
//        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));

        String result = "hello2";
        System.out.println("result: " + result);
        return "hello2";
    }
}