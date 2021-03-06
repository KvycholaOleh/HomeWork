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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Body other = (Body) obj;
		if (color != other.color)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Body [color=" + color + ", type=" + type + "]";
	}
	
	
	
}
