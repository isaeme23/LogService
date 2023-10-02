package com.eci.ls.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("Word")
public class Word {

    String word;
    LocalDate date;

    public Word(){}

    public Word(String word, LocalDate date){
        this.word = word;
        this.date = date;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
