package javaSessions;

public class ConditionalOperaters {

	public static void main(String[] args) {
		//  <,>,==,<=,>=,!=
		
		
		int a=10;
		int b=20;
		
		System.out.println(a<b);
		
		int d=10;
		int e=10;
		
		System.out.println(d==e);
		
		//if
		//nested if
		//if else
		//if else if
		//switch case
		
		System.out.println("----------------if condition-----------------");
		
		if(a>b) {
			System.out.println("a is highest value");
		}
		
		System.out.println("----------------if else condition------------------");
		
		if(a>b) {
			System.out.println("A is highest value");
		}else {
			System.out.println("B is highest value");
		}
		System.out.println("===============dead code=======================");
		
		if(false) {
			System.out.println("Testing");
		}else {
			System.out.println("Development");
		}
		System.out.println("===============String comparision=======================");
		String s1="Selenium";
		String s2="Selenium";
		
		if(s1.equals(s2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		
		String s3="selenium";
		
		if(s1.equals(s3)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		
		System.out.println("===============String comparision using (==) =======================");
		
		if(s1==s2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		
		
		System.out.println("===========nested if==============");
		
		int marks=67;
		if(marks>=50) {
			System.out.println("Pass");
			if(marks>=60) {
				System.out.println("Grade B");
				if(marks>=75) {
					System.out.println("Grade A");
					if(marks>=80) {
						System.out.println("Grade A++");
					}
				}
			}
		}else {
			System.out.println("Fail");
		}
		
		System.out.println("==========================================================");
		
		String browser= "chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		
		if(browser.equals("Firefox")) {
			System.out.println("Launch chrome");
		}
		
		if(browser.equals("IE")) {
			System.out.println("Launch chrome");
		}
		
		if(browser.equals("safari")) {
			System.out.println("Launch chrome");
		}
		
		
		System.out.println("======================if else if =====================");
		
		String browser1= "chrome";
		
		if(browser1.equalsIgnoreCase("chrome")) {
			System.out.println("Launch chrome");
		} else if(browser1.equalsIgnoreCase("firefox")) {
			System.out.println("Launch firefox browser");
		}else if(browser1.equalsIgnoreCase("IE")) {
			System.out.println("Launch IE browser");
		}else if(browser1.equalsIgnoreCase("safari")) {
			System.out.println("Launch safari browser");
		}else {
			System.out.println("Plase pass the correct browser name");
		}
		
		
		System.out.println("==================Find Max number====================");
		int x=340;
		int y=76;
		int z=120;
		
		if(x>y && x>z) {
			System.out.println("X is the max number");
		}else if(y>z) {
			System.out.println("Y is the max number");
		}else {
			System.out.println("Z is the max number");
		}
		
		
		if(x>y || x>z) {
			System.out.println("X is the max number");
		}else if(y>z) {
			System.out.println("Y is the max number");
		}else {
			System.out.println("Z is the max number");
		}
		
		
		//Assignment
		int p=450;
		int q=230;
		int r=780;
		int s=12;
		int t=34;
		int u=00;
		
		
		
		
		
		

	}

}
