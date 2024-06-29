package study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.dto.StudentDTO;
import study.model.Student;
import study.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public StudentDTO createStudent(Student stu) {
		
		Student student = studentRepository.save(stu);
		StudentDTO studentDto = new StudentDTO();
		
		studentDto.setCity(student.getProfile().getCity());
		studentDto.setCountry(student.getProfile().getCountry());
		studentDto.setEmail(student.getEmail());
		studentDto.setId(student.getId());
		studentDto.setName(student.getName());
		studentDto.setStreet(student.getProfile().getStreet());
		return studentDto;
		
		
	}

	@Override
	public List<Object[]> findNameAndCityByCity(String city) {
		
		return studentRepository.findNameAndCityByCity(city);
	}

	@Override
	public void deleteById(long id) {
		studentRepository.deleteById(id);	
	}

	@Override
	public StudentDTO findById(long id) {
		Optional<Student> s = studentRepository.findById(id);
		Student student = new Student();
		if(s!=null) {
			student = s.get();
		}
		StudentDTO studentDto = new StudentDTO();
		studentDto.setCity(student.getProfile().getCity());
		studentDto.setCountry(student.getProfile().getCountry());
		studentDto.setEmail(student.getEmail());
		studentDto.setId(student.getId());
		studentDto.setName(student.getName());
		studentDto.setStreet(student.getProfile().getStreet());
		return studentDto;
	}

	

}
