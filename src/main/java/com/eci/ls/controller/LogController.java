package com.eci.ls.controller;

import com.eci.ls.repository.LogRepository;
import com.eci.ls.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// dbpassword
@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @PutMapping("/hello")
    public ResponseEntity<?> cadenas(@RequestBody String cadena) {
        try{
            List cadenas = logService.saveAndShow(cadena);
            return ResponseEntity.ok(cadenas);
        } catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}