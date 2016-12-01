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
	public String toString() {
		return "Car [name=" + name + ", wheel=" + wheel + ", disc=" + disc
				+ ", body=" + body + "]";
	}
	
	
	
	

}
