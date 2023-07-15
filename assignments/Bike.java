package week1.day1.assignments;

public class Bike {
	public void applyBreak()
	{
		System.out.println(" Applied break-Bike");
	}
	public void soundHorn()
	
	{
		System.out.println(" sound horn-Bike");	
	}
	public static void main(String[] args) {
		Bike bike =new Bike();
		Car car =new Car();
		bike.applyBreak();
		bike.soundHorn();
		car.applyBreak();
		car.soundHorn();
	}
}
