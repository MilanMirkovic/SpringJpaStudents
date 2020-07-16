package springjpastudenti.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Student", catalog="students")
public class Student {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String lastname;
	private String indexNumber;
	
	@OneToMany(mappedBy="student", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Exam> exmas=new HashSet<Exam>();

	public Student() {}
	public Student(Long id, String name, String lastname, String indexNumber) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.indexNumber = indexNumber;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public Set<Exam> getExmas() {
		return exmas;
	}

	public void setExmas(Set<Exam> exmas) {
		this.exmas = exmas;
	}
	
	
	
	
	
	
}
