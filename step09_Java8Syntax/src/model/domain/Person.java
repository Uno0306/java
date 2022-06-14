package model.domain;

public class Person {
	private String nameString;
	private String mbti;

	public Person(String nameString, String mbti) {
		this.nameString = nameString;
		this.mbti = mbti;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	@Override
	public String toString() {
		return "Person [name=" + nameString + ", mbti=" + mbti + "]";
	}

}
