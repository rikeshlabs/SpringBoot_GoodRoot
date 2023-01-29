package com.goodroot.studentController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goodroot.model.StudentDetails;
import com.goodroot.service.StudentServices;

@Controller
public class StudentController {

	private StudentServices studentServices;

	public StudentController(StudentServices studentServices) {
		super();
		this.studentServices = studentServices;
	}

	@RequestMapping("/Student")
	public String Student(Model model) {
		model.addAllAttributes(studentServices.getAllStudent());
		return "Student";
	}

	@GetMapping("/students/new")
	public String createStudentForm(Model model) {

		// create student object to hold student form data
		StudentDetails student = new StudentDetails();
		model.addAttribute("student", student);
		return "create_student";

	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") StudentDetails student) {
		studentServices.addStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable int id, Model model, StudentDetails s) {
		studentServices.updateStudent(s, id);
		model.addAttribute("student");
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable int id, @ModelAttribute("student") StudentDetails student, Model model) {

		// get student from database by id
		StudentDetails existingStudent = studentServices.getSingleStudent(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmailId(student.getEmailId());
		existingStudent.setPassword(student.getPassword());

		// save updated student object
		studentServices.updateStudent(existingStudent, id);
		return "redirect:/students";
	}

	// handler method to handle delete student request

	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentServices.deleteStudent(id);
		return "redirect:/students";
	}

	@GetMapping("/student/{id}")
	public String SignleStudent(@PathVariable int id) {
		studentServices.getSingleStudent(id);
		return "SingleStudent";
	}

}
