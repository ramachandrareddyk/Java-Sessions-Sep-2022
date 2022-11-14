package javaSessions;

public class User {
	
	String name;
	int age;
	String City;

	public static void main(String[] args) {
		

		User u1= new User();
		u1.name="Neeraj";
		u1.age=34;
		u1.City="Bangalore";
		
		User u2= new User();
		u2.name="Rahul";
		u2.age=38;
		u2.City="Hyderabad";
		
		User u3= new User();
		u3.name="Dhravid";
		u3.age=44;
		u3.City="Pune";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.City);//neeraj
		System.out.println(u2.name+" "+u2.age+" "+u2.City);//Rahul
		System.out.println(u3.name+" "+u3.age+" "+u3.City);//Dhravid
		
		u1=u2;
		System.out.println("----------------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.City);//Rahul
		System.out.println(u2.name+" "+u2.age+" "+u2.City);//Rahul
		System.out.println(u3.name+" "+u3.age+" "+u3.City);//Dhravid
		
		u2=u3;
		System.out.println("----------------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.City);//Rahul
		System.out.println(u2.name+" "+u2.age+" "+u2.City);//Dhravid
		System.out.println(u3.name+" "+u3.age+" "+u3.City);//Dhravid
		System.out.println("----------------------");
		u3=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.City);//Rahul
		System.out.println(u2.name+" "+u2.age+" "+u2.City);//Dhravid
		System.out.println(u3.name+" "+u3.age+" "+u3.City);//rahul
		
		//Assignment=
		int [] a= new int[5];
		
		a[0]=5;
		a[1]=10;
		a[2]=4;
		a[3]=24;
		a[4]=97;
		//Find max number in array  //97
		//find second max number //24
	}
	
	
	

}
