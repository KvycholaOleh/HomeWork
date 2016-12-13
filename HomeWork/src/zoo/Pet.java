package zoo;

import java.io.Serializable;

public class Pet implements Serializable{
	

	private static final long serialVersionUID = -3736997515259307333L;
	private String name;
	private String kindAnimal;
	private int age;
	private Gender gender;
	
	public Pet(String name, String kindAnimal, int age, Gender gender) {
		super();
		this.name = name;
		this.kindAnimal = kindAnimal;
		this.age = age;
		this.gender = gender;
	}
	
	public Pet(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKindAnimal() {
		return kindAnimal;
	}
	public void setKindAnimal(String kindAnimal) {
		this.kindAnimal = kindAnimal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", kindAnimal=" + kindAnimal + ", age="
				+ age + ", gender=" + gender + "]";
	}
	
	
	

}
