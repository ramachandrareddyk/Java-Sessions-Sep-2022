package javaSessions;

public class Employee {
	//instence variables
	
	String name;
	int age;
	double salary;
	boolean isActive;
	
	
	// TODO Auto-generated method stub
			//Class:--
			//------------
			//Class is the group of objects which have comman properties.
			//class is the templet or blue print to ctrate object
			
			//Variables
			//Methods
			//Constructors
			//Blocks
			//Nested Class
			
			//Object
			//----------
			//Object is the instence of the class

	public static void main(String[] args) {
		
		int a=10;
		
		System.out.println(a);
		
		
		Employee e1 = new Employee();//RHS

		//Employee- Refarence class
		//e1- Refarence name
		//=  is the assignment operater
		//new Key word
		//Employee() -- Object
		
		System.out.println(e1.name);//null
		System.out.println(e1.age);//0
		
		e1.name="Tom";
		e1.age=45;
		e1.salary=45000;
		e1.isActive=true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		Employee e2 = new Employee();
		
		e2.name="Peter";
		e2.age=56;
		
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		Employee e3= new Employee();
		
		e3.name="Phill";
		System.out.println(e3.name);
		
		e3=null;
		
		System.out.println(e3.name);// java.lang.NullPointerException: Cannot read field "name" because
		
		Employee e4= new Employee();
		
		//Garbage Collecter
		
		System.gc();
		
		//not recomanded objects 
		//this all will create new objects for each one
		new Employee().name="Mark";
		new Employee().age=47;
	}

}
