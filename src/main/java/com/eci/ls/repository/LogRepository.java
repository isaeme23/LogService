package com.eci.ls.repository;
import com.eci.ls.model.Word;
import com.eci.ls.repository.mongo.LogRepositoryMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
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
        List<Word> registers = mongoDB.findAll();
        List<Word> newregisters = new ArrayList<>();
        if (registers.size() <= 10){
            return registers;
        } else{
            for (int i = 1; i < 11; i++){
                newregisters.add(registers.get(registers.size() - i));
            }
            return newregisters;
        }
    }

}
