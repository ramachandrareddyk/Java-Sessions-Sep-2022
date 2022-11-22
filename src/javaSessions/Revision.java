package javaSessions;

import java.util.ArrayList;

public class Revision {

	public static void main(String[] args) {
		//Data types
		byte b=2;
		short s=4;
		int a=500;
		long l=00;
		//default value for byte short int and long is '0'
		float f=457.89f;
		double d=345.67;
		
		//default value for float and double is '0.0'
		
		char c='r';
		//default value for char is space
		
		boolean b1=true;
		//default value for boolean is false
		
		String s1="Testing";
		//default value for string is null
		
		//if
		//if else
		//if else if
		
		if(10>=10) {
			System.out.println("yes");
		}
		
		int x=10;
		int y=12;
		if(x>=y) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		int marks=146;
		
		if(marks>=550) {
			System.out.println("Grade A+");
		}else if(marks>=500) {
			System.out.println("Grade A");
		}else if(marks>=400) {
			System.out.println("Grade B");
		}else if(marks>=300) {
			System.out.println("Grade C");
		}else if(marks>=200) {
			System.out.println("Grade D");
		}else {
			System.out.println("Fail");
		}
		//loops concept
		//to avide the repitative statements
		/*
		 * System.out.println("1"); System.out.println("2"); System.out.println("3");
		 */
		
		//While loop
		//for loop
		//do while loop
		//for each
		
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		for(int j=0;j<100;j++) {
			if(j%2==0) {
				System.out.println(j+ " This is Even number");
			}else {
				System.out.println(j+ " This is Odd number");
			}
		}
		
		//Array--Static array,Fixed size,array index,array index,
		
		int [] ss=new int [4];
		ss[0]=10;
		ss[1]=23;
		
		for(int e:ss) {
			System.out.println(e);
		}
		
		System.out.println(ss[0]);
		
		//Array list -- dynamic array,Size is not fixed,Add method,get method,
		
		ArrayList<Integer> aa= new ArrayList<Integer>();
		aa.add(345);	
		aa.add(456);
		System.out.println(aa.get(0));
		
		for (int j = 0; j < aa.size(); j++) {
			System.out.println(aa.get(i));
		}
		

	}

}
