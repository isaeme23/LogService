package com.eci.ls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    @GetMapping("/hello")
    public String hello() {
        return "Hola desde el Servidor";
    }
}