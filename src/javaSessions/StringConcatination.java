package javaSessions;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=100;
		int b=200;
		
		
		String s="Hello";
		String s1="Testing";
		
		
		System.out.println(a+b);//300
		System.out.println(s+s1);//HelloTesting
		
		String str="100";
		String str1="200";
		
		System.out.println(str+str1);//100200
		
		System.out.println(a+b+s+s1);//300HelloTesting
		
		System.out.println(s+s1+a+b);//HelloTesting100200
		
		System.out.println(s+s1+(a+b));//HelloTesting300
		
		System.out.println(a+str+b+str1+s+s1);//100100200200HelloTesting
		
		System.out.println(s+s1+(a+b)+str+str1);//HelloTesting300100200
		
		
		char c='a';
		char d='b';
		
		System.out.println(c+d);//
		
		System.out.println('j'+'a'+'v'+'a');
		
		System.out.println(a+b+c+d);
		
		System.out.println(100+200);
		int i=4/2;
		System.out.println(i);
		
		System.out.println(4/2);//2
		
		System.out.println(5/2);//2
		
		System.out.println(5.0/2);//2.5
		
		System.out.println(5.0/2.0);//2.5
		
		int x=10;
		int y=2;
		
		System.out.println(x/y);//5
		
		int z=9;
		
		System.out.println(z/y);
		
		System.out.println(x%y);//0
		
		System.out.println(z%y);//1
		
		int p=100;
		int q=0;
		
		//System.out.println(p/q);	//java.lang.ArithmeticException	
		
		System.out.println(q/p);

	}

}
