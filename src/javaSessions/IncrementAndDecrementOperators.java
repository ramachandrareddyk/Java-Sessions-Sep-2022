package javaSessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		//Increment operators
			//1. Post Increment
			//2. Pre increment
		
		//Decrement Operators
			//1. Post Decrement
			//2. Pre Decrement
		
		//1. Post Increment
		System.out.println("==========post increment==========");
		int a=10;
		
		int b=a++;
		
		System.out.println(a);//11
		System.out.println(b);//10
		
		int x=-9;
		int y=x++;
		
		System.out.println(x);//-8
		System.out.println(y);//-9
		System.out.println("==========pre increment==========");
		//2. Pre increment
		
		int c=10;
		int d=++c;
		
		System.out.println(c);//11
		System.out.println(d);//11
		
		int p=-99;
		int q=++p;
		
		System.out.println(p);//-98
		System.out.println(q);//-98
		
		//1. Post Decrement
		System.out.println("==========post Decrement==========");
		
		int r=10;
		int s=r--;
		
		System.out.println(r);//9
		System.out.println(s);//10
		
		int r1=-9;//-9-1=-10
		int s1=r1--;//-9
		System.out.println(r1);
		System.out.println(s1);
		
		//2. Pre Decrement
		System.out.println("==========Pre Decrement==========");
		int a1=10;
		int b1=--a1;
		
		System.out.println(a1);//9
		System.out.println(b1);//9
		
		int x1=-10;//-10-1=-11
		int x2=--x1;
		
		System.out.println(x1);//11
		System.out.println(x2);//11
		
	}

}
