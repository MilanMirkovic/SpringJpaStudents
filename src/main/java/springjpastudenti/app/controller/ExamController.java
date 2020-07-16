package springjpastudenti.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springjpastudenti.app.model.Exam;
import springjpastudenti.app.service.ExamService;

@RestController
public class ExamController {

	@Autowired
	ExamService examService;
	
	
	
	@GetMapping(value="api/exams")
	public ResponseEntity<Page<Exam>> getAll(Pageable page){
		Page<Exam> retVal=examService.findAll(page);
		
		return new ResponseEntity<>(retVal, HttpStatus.OK);
	}
}
