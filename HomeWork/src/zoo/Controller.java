package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;



public class Controller {
	Zooclub zo = new Zooclub();
	final Scanner sc = new Scanner(System.in);
	
	public void addPerson(){
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter 1 to male 2 to female");
		Gender gender = sc.nextInt()==1 ? Gender.MALE : Gender.FEMALE;
		zo.map.put(new Person(age, name, gender), new ArrayList());
		
//		for(Entry<Person,List<Pet>> entry : zo.set){
//			Person person = entry.getKey();
//				System.out.println(person+" -> ");
//		}
	}
	
	public void addPetToMember(){
		System.out.println("Enter member to add pet");
		String nameMemeber = sc.next();
		for(Entry<Person,List<Pet>> entry : zo.set){
			Person person = entry.getKey();
				if (person.getName().equals(nameMemeber)) {
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter age");
					int age = sc.nextInt();
					System.out.println("Enter kind of animal");
					String kindAnimal = sc.next();
					System.out.println("Enter 1 to male 2 to female");
					Gender gender = sc.nextInt()==1 ? Gender.MALE : Gender.FEMALE;
					zo.map.get(person).add(new Pet(name, kindAnimal, age, gender));
				}
		}
	}
	
	public void deletePetFromMember(){
		System.out.println("Enter member name");
		String memberName = sc.next();
		System.out.println("Enter pet name");
		String petName = sc.next();
		for(Entry<Person,List<Pet>> entry : zo.set){
			Person person = entry.getKey();
			if (person.getName().equals(memberName)) {
				for(Pet pet : entry.getValue()){
					if (pet.getName().equals(petName)) {
						zo.map.get(person).remove(pet);
					}
				}
			}
		}
	}
	
	public void deleteMember(){
		System.out.println("Enter member name");
		String memberName = sc.next();
		for(Entry<Person,List<Pet>> entry : zo.set){
			Person person = entry.getKey();
			if (person.getName().equals(memberName)) {
				zo.map.remove(person);
			}
		}
	}
	
	public void showAll(){
		for(Entry<Person,List<Pet>> entry : zo.set){
			Person person = entry.getKey();
			System.out.print(person+" -> ");
			for(Pet pet : entry.getValue()){
				System.out.print(pet+" ");
			}
			System.out.println();
		}
	}
	
	
}