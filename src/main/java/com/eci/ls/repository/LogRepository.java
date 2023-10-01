package com.eci.ls.repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class LogRepository {
    private ConcurrentHashMap<String, LocalDate>  cadenas = new ConcurrentHashMap<>();

    public ConcurrentHashMap saveAndShow(String cadena){
        LocalDate date = LocalDate.now();
        cadenas.put(cadena, date);
        return cadenas;
    }

}
