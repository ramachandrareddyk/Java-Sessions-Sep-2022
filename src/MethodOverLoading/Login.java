package MethodOverLoading;

public class Login {

	public static void main(String[] args) {
		Login log= new Login();
		
		log.login("1234567890", 435678);

	}
	//Amazon login
	public void login(String userName, String Password) {
		System.out.println("Login with user name and password");
	}
	
	public void login(String mobilenumber, int otp) {
		System.out.println("Login with Mobile number and OTP");
	}
	
	public void login(String email,long Mobilenumber, int otp) {
		System.out.println("Login with email, Mobile number and OTP");
	}
	
	//product search
	
	public void search(String productName) {
		System.out.println("Search with product name");
	}
	
	public void search(String productName, int price){
		System.out.println("Search with product name and price");
	}
	
	public void search(String productName, String color) {
		System.out.println("Search with product name and color");
	}
	
	public void search(String productName, String productBrand, int price) {
		System.out.println("Search with product name and color");
	}

}
