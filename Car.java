package javaActivity1;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	public String Color;
	Car(){
		tyres=4;
		doors=4;
		make=2014;
		color="black";
		transmission="manual";
		
	}
public void displayCharecteristics() {
	System.out.println("The color of the car:" +color);
    System.out.println("The transmission of the car:" +transmission);
	System.out.println("The make of the car:" +make);
	System.out.println("No of tyres of car:" +tyres);
	System.out.println("No of doors in car:" +doors);
}
public void accelerate() {
	System.out.println("Car is moving forward");
}
public void brake() {
	System.out.println("CAr has stopped");
}
}
