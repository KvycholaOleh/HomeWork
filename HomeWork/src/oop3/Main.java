package oop3;

public class Main {

	public static void main(String[] args) {
		Zarplata employeeHour = new EmployeeHour(10, 120);
		Zarplata employeeMonth = new EmployeeMonth(1000);
		employeeHour.printZp();
		employeeMonth.printZp();

	}

}
