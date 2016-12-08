package oop4;

public class Car {
	
	private String name;
	private Wheel wheel;
	private Disc disc;
	private Body body;
	
	public Car(String name, Wheel wheel, Disc disc, Body body) {
		this.name = name;
		this.wheel = wheel;
		this.disc = disc;
		this.body = body;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Disc getDisc() {
		return disc;
	}

	public void setDisc(Disc disc) {
		this.disc = disc;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((disc == null) ? 0 : disc.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (disc == null) {
			if (other.disc != null)
				return false;
		} else if (!disc.equals(other.disc))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", wheel=" + wheel + ", disc=" + disc
				+ ", body=" + body + "]";
	}
	
	
	
	

}
