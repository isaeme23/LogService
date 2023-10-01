package com.eci.ls.service;

import com.eci.ls.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public LogService(LogRepository logRepository){
        this.logRepository = logRepository;
    }

    public ConcurrentHashMap saveAndShow(String cadena){
        return logRepository.saveAndShow(cadena);
    }

}
