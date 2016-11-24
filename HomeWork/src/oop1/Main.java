package oop1;

public class Main {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		CoffeRobot r2= new CoffeRobot();
		RobotDancer r3 = new RobotDancer();
		RobotCoocker r4 = new RobotCoocker();
		r1.work();
		r2.work();
		r3.work();
		r4.work();
		System.out.println();
		System.out.println(MyMath.addition(3, 5));
		System.out.println(MyMath.subtraction(5, 3));
		System.out.println(MyMath.multiplication(3, 6));
		System.out.println(MyMath.divide(6, 2));
		

	}

}
