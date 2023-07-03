package net.javaguierd.springboot.EntityPkg;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import jakarta.validation.constraints.Size;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	// @Size(min = 3)
	@Column(name = "FirstName")
	private String firstName;
	
	// @Size(min = 3)
	@Column(name = "LastName")
	private String lastName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DOB", nullable = false)
	@NotNull
	private Date dob;
	
	@Column(name = "Section")
	private String section;
	
	@Column(name = "Gender")
	private String gender;
	
	//@Min(value = 0, message = "mark1 should not be less than 18")
    //@Max(value = 100, message = "mark1 should not be greater than 150")
	@Column(name = "Mark1", nullable = false)
	@NotNull
	private int mark1;
	
	//@Min(value = 0, message = "mark2 should not be less than 18")
    //@Max(value = 100, message = "mark2 should not be greater than 150")
	@Column(name = "Mark2", nullable = false)
	@NotNull
	private int mark2;
	
	//@Min(value = 0, message = "mark3 should not be less than 18")
    //@Max(value = 100, message = "mark3 should not be greater than 150")
	@Column(name = "Mark3", nullable = false)
	@NotNull
	private int mark3;
	
	@Column(name = "Total")
	private int total;
	
	@Column(name = "Avarage")
	private int avarage;
	
	@Column(name = "Result")
	private int result;

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String dob, String section, String gender, int mark1,
			int mark2, int mark3, int total, int avarage, int result) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.dob = dob;
		this.section = section;
		this.gender = gender;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.total = total;
		this.avarage = avarage;
		this.result = result;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	/*
	 * public String getDob() { return dob; }
	 * 
	 * public void setDob(String dob) { this.dob = dob; }
	 */

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAvarage() {
		return avarage;
	}

	public void setAvarage(int avarage) {
		this.avarage = avarage;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", section=" + section + ", gender=" + gender + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3="
				+ mark3 + ", total=" + total + ", avarage=" + avarage + ", result=" + result + "]";
	}

}
