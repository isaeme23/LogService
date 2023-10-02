package com.eci.ls.repository.mongo;

import com.eci.ls.model.Word;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface LogRepositoryMongoDB extends MongoRepository<Word, Date> {
}
