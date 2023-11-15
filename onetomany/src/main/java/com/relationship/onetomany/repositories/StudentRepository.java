package com.relationship.onetomany.repositories;

import com.relationship.onetomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface StudentRepository  extends JpaRepository<Student,Integer> {


}
