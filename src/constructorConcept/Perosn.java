package constructorConcept;

public class Perosn {

	
	String name;
	int age;
	int empid;
	double salary;
	boolean isPermanent;
	
	//this keyowd
	//this keywprd refars to current class objects in method or constructor
	//the most usage of the this keyword is eliminate the confusion between class leval attributes and
	// parameters with the same name
	/*
	 * public static Perosn() {
	 * 
	 * }
	 */
	public Perosn(String name) {
		this.name=name;
		
		System.out.println(name);
	}
	
	public Perosn(String name, int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		Perosn p= new Perosn("Tom");
		
		Perosn p1= new Perosn("Tom", 45);

	}

}
