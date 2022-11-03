package javaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		b=40;
		
		String s="Test";
		String x="Automation";
		s="Manual";
		
		//Array is the collection of similar types of elements
		//to create array we have to create Object 10
		
		//1. static array
		//2. Dynamic array
		
		//we can store only fixed set of elements
		//array will store values in index basis
		//0 1 2 3 4 5 6 7
		
		//Lowest index is 0
		//Highest index is length-1
		//To get size of the array we have to use Length;
		
		int i[]= new int[5];
		i[0]=10;
		i[1]=20;
		//i[2]=30;
		//i[3]=40;
		i[4]=50;
		
		System.out.println("Lowest index is = "+0);
		
		System.out.println("Highest index is = "+(i.length-1));
		
		System.out.println(i.length);
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[4]);
		
		//System.out.println(i[5]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		System.out.println("---------for loop to get the all values from  array-------");
		

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
//		for (int j = 0; j <= i.length; j++) {//ArrayIndexOutOfBoundsException
//			System.out.println(i[j]);
//		}
		
		for (int j = 0; j <=i.length-1; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("-----------for each loop-------------");
		for(int e:i) {
			System.out.println(e);
		}
		
		System.out.println("-----------Duble array------------");
		//2. Double array
		double d[]= new double[2];
		d[0]=123.43;
		d[1]=45.34;
		
		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
		}
		
		for(double e:d) {
			System.out.println(e);
		}
		
		System.out.println("-----------Character Array-------------");
		char c[]= new char[2];
		c[0]='1';
		c[1]='a';
		for(char t:c) {
			System.out.println(t);
		}
		System.out.println("-----------String Array-------------");
		
		String str[]= new String[4];
		
		str[0]="Mohith";
		str[1]="Ranjith";
		str[2]="Apple";
		
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
		}
		
		for(String e:str) {
			System.out.println(e);
		}
		
		//Limitations of an array
		//1.Size is fixed: mStatic array
		//2. We can stotre only similar datatype vales
		
		//to store the multiple data type vales we have use Object Array
		
		//Object is the super/parent class for all the java class
		System.out.println("=============Object Array===========");
		Object ob[] = new Object[5];
		ob[0]=1234;
		ob[1]="Tom";
		ob[2]='M';
		ob[3]=34.66;
		ob[4]=true;
		
		for (int j = 0; j < ob.length; j++) {
			System.out.println(ob[j]);
		}
		
		for(Object e:ob) {
			System.out.println(e);
		}
		
	}

}
