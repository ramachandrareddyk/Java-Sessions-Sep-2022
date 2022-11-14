package javaSessions;

public class Login {
	
	String url;
	String Username;
	String password;
	String title;
	
	//This is the class template
	
	public static void main(String[] args) {
		
		Login amazon = new Login();
		amazon.url="https://www.amazon.in";
		amazon.Username="1234567890";
		amazon.password="Test@123";
		amazon.title="Home Page";
		
		System.out.println(amazon.url+" "+amazon.Username+" "+amazon.password+" "+amazon.title);
		
		Login flipkart = new Login();
		flipkart.url="https://www.flipkart.in";
		flipkart.Username="1234567890";
		flipkart.password="Test@123";
		flipkart.title="Home Page";
		
		Login myntra = new Login();
		
		flipkart.url="https://www.Myntra.in";
		flipkart.Username="1234567890";
		flipkart.password="Test@123";
	}

}
