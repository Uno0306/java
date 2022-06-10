package model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private String name;
	private int stNo;
	private String grade;
	
//	public Student() {}
//	
//	public Student(String name, int stNo, String grade) {
//		super();
//		this.name = name;
//		this.stNo = stNo;
//		this.grade = grade;
//	}
//	
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getStNo() {
//		return stNo;
//	}
//	public void setStNo(int stNo) {
//		this.stNo = stNo;
//	}
//	public String getGrade() {
//		return grade;
//	}
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", stNo=" + stNo + ", grade=" + grade + "]";
//	}
	

}
