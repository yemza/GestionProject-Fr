package gestionProject.entitiesDAO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClassTest {
	
	@Id
	private Long id;
	private String testName;
	private String testSecondeName;


	public ClassTest() {
		// TODO Auto-generated constructor stub
		this.id =(long) 1;
		this.testName ="testName";
		this.testSecondeName = "testSecondeName";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public String getTestSecondeName() {
		return testSecondeName;
	}


	public void setTestSecondeName(String testSecondeName) {
		this.testSecondeName = testSecondeName;
	}
	
	
}
