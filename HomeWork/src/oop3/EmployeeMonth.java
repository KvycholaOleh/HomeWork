package oop3;

public class EmployeeMonth implements Zarplata {
	int rateMonth;
	
	

	public EmployeeMonth(int rateMonth) {
		this.rateMonth = rateMonth;
	}



	@Override
	public double zarplata() {
		return rateMonth;
	}
	

}
