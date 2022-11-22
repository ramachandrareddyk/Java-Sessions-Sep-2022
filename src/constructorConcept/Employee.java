package constructorConcept;

public class Employee {

	
	
	//In java constructor is the spl type of method
	//it will use to initialize the object
	//the constructor will excecute when object is created with new key word
	
	//1. default constructors
	//2. Parameterized constructors
	
	//rules for constructor
	//1. Constructor must be same as class name
	//2. Constructor does not return any thing
	//3. Constructor can not be static and final
	
	String name;
	int age;
	int empid;
	double salary;
	boolean isPermanent;
	
	
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		Employee emp1= new Employee(10);
		
		Employee emp2= new Employee(10, "100");

	}
	
	public Employee() {
		System.out.println("Default constructor");
	}
	
	public Employee(int a) {
		System.out.println("this is one parameter constructor " +a);
	}
	
	public Employee(int a, String b) {
		System.out.println("This is two parameter constructor "+ a + b );
	}
	
	public void m1() {
		System.out.println("this is my m1 method");
	}
	
	

}
