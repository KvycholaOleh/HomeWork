package oop3;

public class EmployeeHour implements Zarplata {
	
	int salaryPerHour;
	int hoursInMonth;
	
	

	public EmployeeHour(int salaryPerHour, int hoursInMonth) {
		this.salaryPerHour = salaryPerHour;
		this.hoursInMonth = hoursInMonth;
	}



	@Override
	public double zarplata() {
		return salaryPerHour*hoursInMonth;
	}

}
