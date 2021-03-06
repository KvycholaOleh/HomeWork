package zoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



public class Controller {
	Zooclub zo = readFromFile();
	final Scanner sc = new Scanner(System.in);
		
	public void addPerson(){
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter 1 to male 2 to female");
		Gender gender = sc.nextInt()==1 ? Gender.MALE : Gender.FEMALE;
		zo.map.put(new Person(age, name, gender), new ArrayList());
		
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
		
		for(Entry<Person,List<Pet>> entry : zo.set){
			Person person = entry.getKey();
			if (person.getName().equals(memberName)) {
				System.out.println("Enter pet name");
				String petName = sc.next();
				zo.map.get(person).removeIf(p -> p.getName().equals(petName));
			}
			}
	}
	
	
	public void deletePetFromAllMembers(){
		System.out.println("Enter type of pet to remove");
		String petName = sc.next();
		
		for(Entry<Person,List<Pet>> entry : zo.set){
			Person person = entry.getKey();
				zo.map.get(person).removeIf(p -> p.getKindAnimal().equals(petName));
			
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
		for (Pet pet : zo.list) {
			System.out.println(pet);
		}
		System.out.println(zo);
	}
	
	public void saveToFile(){
		try (OutputStream os = new FileOutputStream(new File("collection.zoo"));ObjectOutputStream oos = new ObjectOutputStream(os)) {
			oos.writeObject(zo);
			oos.flush();
		} catch (IOException e) {
		}
	}
	
	public Zooclub readFromFile(){
		File file = new File("collection.zoo");
		if (file.exists()) {
			try (InputStream is = new FileInputStream(file);ObjectInputStream ois = new ObjectInputStream(is)) {
				Zooclub obj = (Zooclub) ois.readObject();
					return obj;
				
			} catch (Exception e) {
			}
		}
		return new Zooclub();
		
		
	}
	
	
}
