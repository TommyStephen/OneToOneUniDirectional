package study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import study.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("SELECT s.name, p.city FROM Student s JOIN s.profile p WHERE p.city = :city")
    List<Object[]> findNameAndCityByCity(String city);
	
}
