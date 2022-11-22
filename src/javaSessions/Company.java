package javaSessions;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {
	
		Company co= new Company();
		String[]names= co.getCoFounders();
		System.out.println(names[0]);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String e:names) {
			System.out.println(e);
		}
		
		ArrayList<String>productlist=co.getProductsList();
		
		System.out.println(productlist.get(1));
		
		for(String e:productlist) {
			System.out.println(e);
		}
		
		
	}
	
	public String getCEOName() {
		return "Tom";
	}
	
	public int getEmployeesCount() {
		return 450;
	}
	
	//co founders 3
	public String[] getCoFounders() {
		String[] founders=new String[3];
		founders[0]="Tom";
		founders[1]="Peter";
		founders[2]="Steve";
		
		return founders;
	}
	
	public ArrayList<String> getProductsList() {
		ArrayList<String>products= new ArrayList<String>();
		products.add("Pen");//0
		products.add("Pencil");//1
		products.add("Mobile");//2
		products.add("Charger");//3
		
		return products;
	}

}
