package compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Controller {
	
	private List<Commodity> commodity = new ArrayList<>();
	
	{
		commodity.add(new Commodity(213, "CPU", true));
		commodity.add(new Commodity(234, "SSD", true));
		commodity.add(new Commodity(43, "HDD", true));
		commodity.add(new Commodity(123, "Motherboard", false));
		commodity.add(new Commodity(12, "GPU", true));
		commodity.add(new Commodity(253, "RAM", false));
		
		
	}
	
	public Stream<Commodity> sortByIdASC(){
		return commodity.stream().sorted(Comparator.comparingInt(Commodity::getId));
	}
	
	public Stream<Commodity> sortByIdDESC(){
		return commodity.stream().sorted(Comparator.comparingInt(Commodity::getId).reversed());
	}

}
