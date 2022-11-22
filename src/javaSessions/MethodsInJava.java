package javaSessions;

public class MethodsInJava {

	//Method is a function
	//inside this method or function we will write some logic
	//Static methods and non static methods
	//in a class we can write n number of methods
	//inside the method we can not able to create method
	//duplicate methods are not allowed
	//But we can do the metod overloading
	
	
	public static void main(String[] args) {
		
			MethodsInJava m1= new MethodsInJava();
			
			m1.test();
			
			int x=m1.sum();
			System.out.println(x);
			
			System.out.println(m1.sum());
			
			m1.sum1(20, 30);
			
			m1.sum1(200, 450);
			
			int y=m1.add(34, 36);
			System.out.println(y);
				String name=m1.getName();	
				System.out.println(name);
	}
	
	//1. No input and no return
	//void -- not return anything
	//at same time we can not able to use void and return kewords
	public void test() {
		System.out.println("This is test method");
	}
	
	//2. no input but return some value
	public int sum() {
		int a=10;
		int b=20;
		
		int z=a+b;
		return z;
	}
	
	//3. some input and no return
	public void sum1(int a, int b) {
		System.out.println(a+b);
	}
	
	//4. Some input and some return
	public int add(int a, int b) {
		int x=a+b;
		return x;
	}
	
	public String getName() {
		String name="Tester";
		return name;
	}
	
	public void t1() {
		System.out.println("this is t1 method");
	}
	
	public void t2() {
		
	}
	
	

}
