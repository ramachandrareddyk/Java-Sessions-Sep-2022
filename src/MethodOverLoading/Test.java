package MethodOverLoading;

public class Test {
	
	//Polymarphisam
	//One action we can perform multiple ways
		//1. Method Overloading
		//2. Method Overriding
	//Class having multile methods with same name, with different parameters and different num of parameters
	

	public static void main(String[] args) {
		
		Test t= new Test();
		
		t.m1("testing");
		
		t.m1(234);
		
		t.m1();
		
	}
	
	public void m1() {
		System.out.println("this is m1 method");
	}
	
	public void m1(int a) {
		System.out.println("This is m1 method with int parameter");
	}
	
	public void m1(String s) {
		System.out.println("This is m1 method with string parameter");
	}
	
	
	
	

}
