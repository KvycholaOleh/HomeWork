package zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Zooclub {
	
	List<Pet> list;
	Map<Person,List<Pet>> map;
	Set<Entry<Person,List<Pet>>> set;
	Iterator<Entry<Person,List<Pet>>> iter;
	
	public Zooclub(){
		list = new ArrayList<>();
		map = new HashMap<>();
		set = map.entrySet();
		iter = set.iterator();
	}

	@Override
	public String toString() {
		return "Zooclub [list=" + list + ", map=" + map + ", set=" + set
				+ ", iter=" + iter + "]";
	}
	
	
	
	

}