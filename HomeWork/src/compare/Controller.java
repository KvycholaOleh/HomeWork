package compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Controller {
	
	private static Scanner sc = new Scanner(System.in);	
	private List<Commodity> list = new ArrayList<>();
	
	{
		list.add(new Commodity(213, "CPU", true));
		list.add(new Commodity(234, "SSD", true));
		list.add(new Commodity(43, "HDD", true));
		list.add(new Commodity(123, "Motherboard", false));
		list.add(new Commodity(12, "GPU", true));
		list.add(new Commodity(253, "RAM", false));
		
		
	}
	
	public void addGoods(){
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Is aviable");
		boolean aviable = sc.nextBoolean();
		list.add(new Commodity(id, name, aviable));
	}
	
	public void deleteGoods(){
		System.out.println("Enter name to delete goods");
		String name = sc.next();
		list.removeIf(str -> str.getName().equals(name));
		
//		for (Commodity commodity : list) {
//			if (commodity.getName().equals(name)) {
//				list.remove(commodity);
//			}
//		}
	}
	
	public void changeGoods(){
		System.out.println("Enter name to change goods");
		String name = sc.next();
		for (Commodity commodity : list) {
			if (commodity.getName().equals(name)) {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name2 = sc.next();
				System.out.println("Is aviable");
				boolean aviable = sc.nextBoolean();
				commodity.setId(id);
				commodity.setName(name2);
				commodity.setAviable(aviable);
				
			}
		}
	}
	
	public Stream<Commodity> sortByIdASC(){
		return list.stream().sorted(Comparator.comparingInt(Commodity::getId));
	}
	
	public Stream<Commodity> sortByIdDESC(){
		return list.stream().sorted(Comparator.comparingInt(Commodity::getId).reversed());
	}
	
	public Stream<Commodity> sortByNameASC(){
		return list.stream().sorted(Comparator.comparing(Commodity::getName));
	}
	
	public Stream<Commodity> sortByNameDESC(){
		return list.stream().sorted(Comparator.comparing(Commodity::getName).reversed());
	}
	
	public Stream<Commodity> sortByAviableASC(){
		return list.stream().sorted(Comparator.comparing(Commodity::isAviable));
	}
	
	public Stream<Commodity> sortByAviableDESC(){
		return list.stream().sorted(Comparator.comparing(Commodity::isAviable).reversed());
	}

	public List<Commodity> getCommodity() {
		return list;
	}

	public void setCommodity(List<Commodity> commodity) {
		this.list = commodity;
	}
	
	

}
