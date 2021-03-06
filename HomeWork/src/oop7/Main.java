package oop7;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import oop4.Body;
import oop4.Car;
import oop4.ColorBody;
import oop4.Disc;
import oop4.TypeBody;
import oop4.TypeDisc;
import oop4.TypeWheel;
import oop4.Wheel;

public class Main {

	public static void main(String[] args) {
		Set<Car> cars = new LinkedHashSet<>();
		cars.add(new Car("BMW", new Wheel(TypeWheel.SKIN,10, false), new Disc(18,TypeDisc.METAL), new Body(ColorBody.RED,TypeBody.HATCHBACK)));
		cars.add(new Car("Mercedes", new Wheel(TypeWheel.SKIN,11, true), new Disc(20,TypeDisc.METAL), new Body(ColorBody.BLUE,TypeBody.SEDAN)));
		cars.add(new Car("Volkswagen", new Wheel(TypeWheel.PLASTIC,10, false), new Disc(16,TypeDisc.METAL), new Body(ColorBody.BLACK,TypeBody.UNIVERSAL)));
		cars.add(new Car("Subaru", new Wheel(TypeWheel.SKIN,12, true), new Disc(19,TypeDisc.TITAN), new Body(ColorBody.BLUE,TypeBody.HATCHBACK)));
		cars.add(new Car("Lamborghini", new Wheel(TypeWheel.SKIN,9, true), new Disc(20,TypeDisc.TITAN), new Body(ColorBody.YELLOW,TypeBody.COUPE)));
		cars.add(new Car("Mitsubishi", new Wheel(TypeWheel.PLASTIC,8, false), new Disc(16,TypeDisc.METAL), new Body(ColorBody.WHITE,TypeBody.SEDAN)));
		cars.add(new Car("Rebault", new Wheel(TypeWheel.SKIN,9, true), new Disc(16,TypeDisc.TITAN), new Body(ColorBody.BLUE,TypeBody.UNIVERSAL)));
		cars.add(new Car("Hummer", new Wheel(TypeWheel.SKIN,13, true), new Disc(22,TypeDisc.TITAN), new Body(ColorBody.YELLOW,TypeBody.SUV)));
		
		//changeDiscType(cars);
		//deleteOnDiameter(cars);
		findCarsOnTypeDiscAndDiameter(cars);

	}
	
	public static void changeDiscType(Set<Car> cars){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input body color");
		String findColor = sc.next();
		System.out.println("Input disc diameter");
		int findDiameter = sc.nextInt();
		for (Car car : cars) {
			if (car.getBody().getColor().name().equals(findColor.toUpperCase())&&car.getDisc().getDiametr()==findDiameter) {
				System.out.println("Enter 1 to titan, 2 to metal");
				TypeDisc typeDisc = sc.nextInt()==1 ? TypeDisc.TITAN : TypeDisc.METAL;
				car.getDisc().setMaterial(typeDisc);
			}
		}
		
		for (Car car : cars) {
			System.out.println(car);
		}
		
	}
	
	public static void deleteOnDiameter(Set<Car> cars) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input min");
		int min = sc.nextInt();
		System.out.println("Input max");
		int max = sc.nextInt();
		Iterator<Car> iter = cars.iterator();
		while(iter.hasNext()){
			Car tmp = iter.next();
			if (tmp.getDisc().getDiametr()<max && tmp.getDisc().getDiametr()>min) {
				iter.remove();
			}
		}
		
		for (Car car : cars) {
			System.out.println(car);
		}
	}
	
	public static void findCarsOnTypeDiscAndDiameter(Set<Car> cars) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input min");
		int min = sc.nextInt();
		System.out.println("Input max");
		int max = sc.nextInt();
		System.out.println("Input type disc");
		String checkTypeDisc = sc.next();
		for (Car car : cars) {
			if (car.getDisc().getMaterial().name().equals(checkTypeDisc.toUpperCase())&&car.getDisc().getDiametr()<max&&car.getDisc().getDiametr()>min) {
				System.out.println(car);
			}
		}
		
	}

}
