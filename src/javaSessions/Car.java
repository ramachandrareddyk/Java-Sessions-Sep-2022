package javaSessions;

public class Car {

	String Name;
	int price;
	String Colcor;
	static int wheels=4;
	public static void main(String[] args) {
		
		Car bmw= new Car();
		
		bmw.Name="BMW x";
		bmw.price=50;
		bmw.Colcor="White";
		
		Car audi= new Car();
		audi.Name="Audi Q7";
		audi.price=30;
		audi.Colcor="Black";
		
		Car honda= new Car();
		honda.Name="City";
		honda.price=20;
		honda.Colcor="Blue";
		
		System.out.println(bmw.Name+" "+bmw.price+" "+bmw.Colcor+" "+wheels);
		
		System.out.println(audi.Name+" "+audi.price+" "+audi.Colcor+" "+wheels);
		
		System.out.println(honda.Name+" "+honda.price+" "+honda.Colcor+" "+wheels);
		
		honda.start("push");

	}
	
	public static void start() {
		System.out.println("Start with Key");
	}
	
	public void start(String push) {
		System.out.println("Push start");
	}
	
	
}
