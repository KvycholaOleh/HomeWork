package oop4;

public class Disc {
	
	private int diametr;
	private TypeDisc material;
	
	
	public Disc(int diametr, TypeDisc material) {
		this.diametr = diametr;
		this.material = material;
	}

	public Disc(){}
	
	public void changeDiametr(int newDiametr){
		this.diametr=newDiametr;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public TypeDisc getMaterial() {
		return material;
	}

	public void setMaterial(TypeDisc material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Disc [diametr=" + diametr + ", material=" + material + "]";
	}


		
	
	
	

}
