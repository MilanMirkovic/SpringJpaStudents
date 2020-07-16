package springjpastudenti.app.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import springjpastudenti.app.model.Course;
import springjpastudenti.app.model.Exam;

@Component
public interface ExamRepository extends JpaRepository<Exam, Long> {

	public List<Exam> findByStudentId(Long studentId);
	public Page<Exam> findByStudentId(Long studentId, Pageable page);
	public List<Exam> findByCourseId(Long courseId);
	public Page<Exam> findByCourseId(Long courseId, Pageable page);
	@Query("SELECT avg(e.grade) from Exam e where e.student.id = :id")
	public double findStudentAvgGrade(@Param("id") Long studentId);
	
	
//	SELECT c.name, count(e.course_id) AS broj from Exam e join Course c on e.course_id=c.id  group by c.name order by broj;
	
	@Query("SELECT e.course, count(e.course) from Exam e group by e.course")
	public Page<Course> findCourseByExamCount(Pageable page);
}
