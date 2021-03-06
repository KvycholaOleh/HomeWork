package oop6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("BMW", new Wheel(TypeWheel.SKIN,10, false), new Disc(18,TypeDisc.METAL), new Body(ColorBody.RED,TypeBody.HATCHBACK)));
		cars.add(new Car("Mercedes", new Wheel(TypeWheel.SKIN,11, true), new Disc(20,TypeDisc.METAL), new Body(ColorBody.BLUE,TypeBody.SEDAN)));
		cars.add(new Car("Volkswagen", new Wheel(TypeWheel.PLASTIC,10, false), new Disc(16,TypeDisc.METAL), new Body(ColorBody.BLACK,TypeBody.UNIVERSAL)));
		cars.add(new Car("Subaru", new Wheel(TypeWheel.SKIN,12, true), new Disc(19,TypeDisc.TITAN), new Body(ColorBody.BLUE,TypeBody.HATCHBACK)));
		cars.add(new Car("Lamborghini", new Wheel(TypeWheel.SKIN,9, true), new Disc(20,TypeDisc.TITAN), new Body(ColorBody.YELLOW,TypeBody.COUPE)));
		cars.add(new Car("Mitsubishi", new Wheel(TypeWheel.PLASTIC,8, false), new Disc(16,TypeDisc.METAL), new Body(ColorBody.WHITE,TypeBody.SEDAN)));
		cars.add(new Car("Rebault", new Wheel(TypeWheel.SKIN,9, true), new Disc(16,TypeDisc.TITAN), new Body(ColorBody.BLUE,TypeBody.UNIVERSAL)));
		cars.add(new Car("Hummer", new Wheel(TypeWheel.SKIN,13, true), new Disc(22,TypeDisc.TITAN), new Body(ColorBody.YELLOW,TypeBody.SUV)));
		
//		for(Car car : cars){
//			System.out.println(car);
//		}
		
//		searchDiameterDisc(cars,16);
//		System.out.println();
//		searchDiameterDiscAndColour(cars, 16, "Black");
//		System.out.println();
//		redCarsChangeWheel(cars);
//		System.out.println();
//		ifButtonsDoubleDiameter(cars);
//		System.out.println();
//		changeCarIfDiameterLess(cars,17);
//		System.out.println();
//		findCarOnBodyType(cars, "sedan");
//		System.out.println();
//		removeIfColorEquals(cars,"blue");
//		System.out.println();
//		changeTypeDisc(cars,15,23);
//		System.out.println();
		deleteCarOnBodyTypeAndWheelDiameter(cars, "hatchback", 8, 14);

		

	}
	
	public static void searchDiameterDisc(List<Car> list, int yourDiameter){
		for(Car car : list){
			if (car.getDisc().getDiametr()==yourDiameter) {
				System.out.println(car);
			}
		}
	}
	
	
	public static void searchDiameterDiscAndColour(List<Car> list, int yourDiameter, String yourColor){
		for(Car car : list){
			if (car.getDisc().getDiametr()==yourDiameter&&car.getBody().getColor().name().equals(yourColor.toUpperCase())) {
				System.out.println(car);
			}
		}
	}
	
	public static void redCarsChangeWheel(List<Car> list){
		for(Car car : list){
			if (car.getBody().getColor()==ColorBody.RED) {
				if (car.getWheel().getMaterial()==TypeWheel.PLASTIC) {
					car.getWheel().setMaterial(TypeWheel.SKIN);
				} else car.getWheel().setMaterial(TypeWheel.PLASTIC);
			}
			System.out.println(car);
		}
	}
	
	public static void ifButtonsDoubleDiameter(List<Car> list){
		for(Car car : list){
			if (car.getWheel().isButtons()) {
				car.getDisc().setDiametr(car.getDisc().getDiametr()*2);
			}
			System.out.println(car);
		}
	}
	
	public static void changeCarIfDiameterLess(List<Car> list, int checkDiameter) {
		for(Car car : list){
			if(car.getDisc().getDiametr()<checkDiameter){
				list.set(list.indexOf(car), new Car("Chrysler", new Wheel(TypeWheel.SKIN,13,true), new Disc(19,TypeDisc.TITAN), new Body(ColorBody.BLACK,TypeBody.SUV)));
			
			}
		}
		
		for(Car car : list){
			System.out.println(car);
		}
	}
	
	
	public static void findCarOnBodyType(List<Car> list, String checkBodyType){
		Iterator<Car> iter = list.iterator();
		while(iter.hasNext()){
			Car tmp = iter.next();
			if (tmp.getBody().getType().name().equals(checkBodyType.toUpperCase())) {
				System.out.println(tmp);
			}
		}
	}
	
	
	public static void removeIfColorEquals(List<Car> list, String checkBodyColor){
		Iterator<Car> iter = list.iterator();
		while(iter.hasNext()){
			Car tmp = iter.next();
			if (tmp.getBody().getColor().name().equals(checkBodyColor.toUpperCase())) {
				iter.remove();
			}
		}
		for(Car car : list){
			System.out.println(car);
		}
	}
	
	
	public static void changeTypeDisc(List<Car> list, int minDiameter, int maxDiameter){
		Iterator<Car> iter = list.iterator();
		while(iter.hasNext()){
			Car tmp = iter.next();
			if (tmp.getDisc().getDiametr()<maxDiameter&&tmp.getDisc().getDiametr()>minDiameter) {
				tmp.getDisc().setMaterial(TypeDisc.TITAN);
			}
		}
		for(Car car : list){
			System.out.println(car);
		}
	}
	
	
	public static void deleteCarOnBodyTypeAndWheelDiameter(List<Car> list, String checkBodyType, int minDiameter, int maxDiameter){
		Iterator<Car> iter = list.iterator();
		while(iter.hasNext()){
			Car tmp = iter.next();
			if (tmp.getBody().getType().name().equals(checkBodyType.toUpperCase()) && tmp.getWheel().getDiametr()<maxDiameter && tmp.getWheel().getDiametr()>minDiameter) {
				iter.remove();
			}
		}
		for(Car car : list){
			System.out.println(car);
		}
	}

}
