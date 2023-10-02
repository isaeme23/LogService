package com.eci.ls.repository;
import com.eci.ls.model.Word;
import com.eci.ls.repository.mongo.LogRepositoryMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class LogRepository implements LogRepositoryInterface{

    @Autowired
    private final LogRepositoryMongoDB mongoDB;

    public LogRepository(LogRepositoryMongoDB mongoDB){
        this.mongoDB = mongoDB;
    }
    @Override
    public List saveAndShow(String cadena){
        mongoDB.save(new Word(cadena, LocalDate.now()));
        return mongoDB.findAll();
    }

}
