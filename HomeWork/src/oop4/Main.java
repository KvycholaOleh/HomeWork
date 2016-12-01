package oop4;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("BMW", new Wheel(TypeWheel.PLASTIC,10, false), new Disc(18,TypeDisc.METAL), new Body(ColorBody.RED,TypeBody.HATCHBACK));
		System.out.println(car);
		car.getWheel().changeMaterial(TypeWheel.SKIN);
		car.getDisc().changeDiametr(19);
		car.getBody().changeColor(ColorBody.BLACK);
		System.out.println(car);
		

	}

}
