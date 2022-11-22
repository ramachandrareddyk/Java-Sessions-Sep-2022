package javaSessions;

public class StaticKeyword {
	int c;
	

	static int a;
	static String s;

	public static void main(String[] args) {
		
		StaticKeyword st= new StaticKeyword();
		st.m2();
		
		st.c=10;
		
		a=20;
		s="Monday";
		//Direct way to call static methods
		m1();
		
		//using class name
		StaticKeyword.m1();
		StaticKeyword.a=50;
		StaticKeyword.s="TuesDay";
		
		//using object
		st.m1();
	}
	
	public static void m1() {
		System.out.println("this is m1 method");
	}
	public void m2() {
		System.out.println("this is m2 method");
	}
	
	

}
