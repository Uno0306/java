package step01_lombok;

import model.domain.Student;

public class LombokTest {

	public static void main(String[] args) {
		Student student = new Student("Java", 1, "Junior");
		System.out.println(student.getName());
	}

}
