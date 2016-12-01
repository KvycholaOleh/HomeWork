package oop4;

public class Body {
	
	private ColorBody color;
	private TypeBody type;
	
	public Body(ColorBody color, TypeBody type) {
		this.color = color;
		this.type = type;
	}
	
	public Body(){}
	
	public void changeColor(ColorBody newColor){
		this.color = newColor;
	}

	public ColorBody getColor() {
		return color;
	}

	public void setColor(ColorBody color) {
		this.color = color;
	}

	public TypeBody getType() {
		return type;
	}

	public void setType(TypeBody type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Body [color=" + color + ", type=" + type + "]";
	}
	
	
	
}
