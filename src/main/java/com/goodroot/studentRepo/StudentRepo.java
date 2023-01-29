package com.goodroot.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goodroot.model.StudentDetails;

@Repository
public interface StudentRepo extends JpaRepository<StudentDetails, Integer>{

}
