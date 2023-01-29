package com.goodroot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.goodroot.model.StudentDetails;
import com.goodroot.studentRepo.StudentRepo;

@Service
@ComponentScan("com.goodroot.model")
public class StudentServices {

	@Autowired
	StudentRepo repo;

	public List<StudentDetails> getAllStudent() {
		List<StudentDetails> student = new ArrayList<StudentDetails>();

		Iterable<StudentDetails> it = repo.findAll();
		Iterator<StudentDetails> itr = it.iterator();

		while (itr.hasNext()) {
			StudentDetails s = itr.next();
			student.add(s);
		}

		return student;

	}

	public void addStudent(StudentDetails s) {
		repo.save(s);
	}

	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

	public void updateStudent(StudentDetails s, int id) {
		Optional opt = repo.findById(id);
		StudentDetails student = (StudentDetails) opt.get();

		student = s;

		repo.save(student);

	}

	public StudentDetails getSingleStudent(int id) {

		Optional<StudentDetails> s = repo.findById(id);

		return s.get();
	}

}
