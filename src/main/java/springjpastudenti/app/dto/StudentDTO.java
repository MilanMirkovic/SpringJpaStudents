package springjpastudenti.app.dto;

import java.util.ArrayList;
import java.util.List;

import springjpastudenti.app.model.Student;

public class StudentDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private String cardNumber;
	
	private List<ExamDTO> exams = new ArrayList<ExamDTO>();

	public StudentDTO() {

	}

	public StudentDTO(Long id, String firstName, String lastName,
			String cardNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardNumber = cardNumber;
	}
	

	public StudentDTO(Student student) {
		this.id = student.getId();
		this.firstName = student.getName();
		this.lastName = student.getLastname();
		this.cardNumber = student.getIndexNumber();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public List<ExamDTO> getExams() {
		return exams;
	}

	public void setExams(List<ExamDTO> exams) {
		this.exams = exams;
	}
}
