package compare;

public class Commodity {
	
	private int id;
	private String name;
	private boolean aviable;
	
	public Commodity(int id, String name, boolean aviable) {
		super();
		this.id = id;
		this.name = name;
		this.aviable = aviable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAviable() {
		return aviable;
	}

	public void setAviable(boolean aviable) {
		this.aviable = aviable;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", aviable="
				+ aviable + "]";
	}
	
	

}
