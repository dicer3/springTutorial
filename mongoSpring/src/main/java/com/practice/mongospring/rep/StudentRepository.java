package com.practice.mongospring.rep;

import com.practice.mongospring.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {


}
