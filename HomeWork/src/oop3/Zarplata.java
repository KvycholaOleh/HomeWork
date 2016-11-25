package oop3;

public interface Zarplata {
	double zarplata();
	public default void printZp(){
		System.out.println("Zarplata = "+zarplata());
	}
}
