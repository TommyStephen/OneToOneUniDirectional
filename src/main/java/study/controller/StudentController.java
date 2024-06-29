package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import study.dto.StudentDTO;
import study.model.Student;
import study.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("student/create")
	public ResponseEntity<StudentDTO> createStudent(@RequestBody Student s){
		
		StudentDTO studentDto = studentService.createStudent(s);		
		return new ResponseEntity<>(studentDto, HttpStatus.OK);
	}
	
	@GetMapping("student/findNameAndCity/{city}")
	public List<Object[]> findNameAndCityByCity(@PathVariable String city){
		List<Object[]> arr = studentService.findNameAndCityByCity(city);
		return arr;
	}
	@DeleteMapping("student/delete/{id}")
	public void deleteById(@PathVariable long id) {
		studentService.deleteById(id);
	}
	
	@GetMapping("student/findById/{id}")
	public StudentDTO findById(@PathVariable long id) {
		return studentService.findById(id);
	}
}
