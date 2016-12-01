package oop4;

public class Wheel {
	
	private TypeWheel material;
	private int diametr;
	private boolean buttons;
	
	public Wheel(TypeWheel material, int diametr, boolean buttons) {
		this.material = material;
		this.diametr = diametr;
		this.buttons = buttons;
	}

	public Wheel(){}
	
	public void changeMaterial(TypeWheel newmMterial){
		this.material=newmMterial;
	}

	public TypeWheel getMaterial() {
		return material;
	}

	public void setMaterial(TypeWheel material) {
		this.material = material;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public boolean isButtons() {
		return buttons;
	}

	public void setButtons(boolean buttons) {
		this.buttons = buttons;
	}

	@Override
	public String toString() {
		return "Wheel [material=" + material + ", diametr=" + diametr
				+ ", buttons=" + buttons + "]";
	}
	
		
	

}
