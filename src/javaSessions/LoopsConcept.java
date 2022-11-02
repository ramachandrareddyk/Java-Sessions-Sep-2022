package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("1"); System.out.println("2"); System.out.println("3");
		 * System.out.println("4");
		 */
		//while loop
		//for loop
		//do while loop
		//for each loop
		
			System.out.println("=============While loop==============");
		//while loop
			
		int i=1;//initialization
		while(i<=10) {//condition
			System.out.println(i);//print statement or logic//1 2 3.....8 9 10
			//i++;//increment or decrement// 2 3 4......9 10 11
			//i=i+1;
			++i;
		}
		
		//for loop
		System.out.println("=============For loop==============");
		for(int j=1;j<=100;j++) {
			System.out.println(j);
		}
		
		for(int j=1;j<10;) {
			System.out.println(j);
			j++;
		}
		
		int x=1;
		for(x=1;x<=10;x++) {
			System.out.println(x);
		}
		
		/*
		 * for(;;) { System.out.println("Bye"); }//it will print infinty times
		 */
		/*
		 * for(int j=0;j<=10;) { System.out.println("Testing"); }//it will print infinty times
		 */
		
		//for(int j=0;j++;) {//it will give compilation error
			
		//}
		System.out.println("===============================");
		for(int j=10;j>=0;j--) {
			System.out.println(j);//10 9....0
		}
		
		System.out.println("===============print alphabits===========");
		for(int j='a';j<='z';j++) {
			System.out.println(j);
		}
		
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		
		System.out.println("==========if condition inside loop=============");
		
		for (int j = 1; j <=10; j++) {
			System.out.println(j);
			if(j%5==0) {
				System.out.println("Testing");
			}
		}
		
		//Assignment
		
		int a=10;
		int b=20;
		
		System.out.println(a);//20
		System.out.println(b);//10
		
	}

}
