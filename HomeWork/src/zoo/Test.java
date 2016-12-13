package zoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Zooclub zooclub = new Zooclub();
		Person person = new Person(13, "Petro", Gender.MALE);
		List<Pet> list = new ArrayList<>();
		list.add(new Pet("Pesik", "Dog", 2, Gender.MALE));
		zooclub.map.put(person, list);
		//System.out.println(zooclub.map);
		
		File file = new File("collection.zoo");
		if (file.exists()) {
			try (InputStream is = new FileInputStream(file);ObjectInputStream ois = new ObjectInputStream(is)) {
				Zooclub obj = (Zooclub) ois.readObject();
					System.out.println(obj);
				
			} catch (Exception e) {
			}

	}
	}
}

