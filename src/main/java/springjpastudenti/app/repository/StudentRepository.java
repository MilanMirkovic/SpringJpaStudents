package springjpastudenti.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import springjpastudenti.app.model.Student;


@Component
public interface StudentRepository  extends JpaRepository<Student, Long> {

	public Student findByIndexNumber(String indexNumber);
}
