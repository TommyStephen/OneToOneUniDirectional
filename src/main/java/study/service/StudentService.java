package study.service;

import java.util.List;



import study.dto.StudentDTO;
import study.model.Student;

public interface StudentService {

	public StudentDTO createStudent(Student student); 
	List<Object[]> findNameAndCityByCity(String city);
	public void deleteById(long id);
	public StudentDTO findById(long id);
	
	
	
	
}
