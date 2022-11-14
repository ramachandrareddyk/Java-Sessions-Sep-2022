package javaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {


		//Arrylis t is the default class in java
		//it is dynamic array
		//siz is not a fixed 
		//values will store in index basis 0,1,2,3,4,5
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//3
		
		ar.add(400);//3
		ar.add(500);//4
		ar.add("etst");
				
		System.out.println(ar.size());//5
		
		System.out.println(ar.get(2));//300
		
		//System.out.println(ar.get(5));java.lang.IndexOutOfBoundsException
		
		ar.remove(2);
		
		System.out.println(ar.get(2));//400
		
		//to print all the values from arraylist: for loop
		System.out.println("============for loop============");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		System.out.println("===========for each loop==============");
		for(Object e:ar) {
			System.out.println(e);
		}
		
		//Genarics in java
		System.out.println("==================String ArrayLyst====================");
		
		ArrayList<String>str= new ArrayList<String>();
			str.add("Test");
			str.add("Dev");
			str.add("BA");
			
			for(String e:str) {
				System.out.println(e);
			}
			System.out.println("==================Integer ArrayLyst====================");
			
		ArrayList<Integer>numb= new ArrayList<Integer>();
		
		numb.add(200);
		numb.add(300);
		numb.add(400);
		
		for(Integer e:numb) {
			System.out.println(e);
		}
		
		//Object arraylist
		System.out.println("============Object Arraylist==================");
		
		ArrayList<Object>empData=new ArrayList<Object>();
		
		empData.add("Peter");
		empData.add(10008);
		empData.add(46000.87);
		empData.add(true);
		empData.add('M');
		
		for (int i = 0; i < empData.size(); i++) {
			System.out.println(empData.get(i));
			
		}
		
		for(Object e :empData) {
			System.out.println(e);
		}
		
		for (int i = 0; i < empData.size(); i++) {
			System.out.println(empData.get(i));
			if(empData.get(i).equals("Peter")) {
				System.out.println("This is Peter");
				
				break;
			}
			
		}
		
		//Assignment
		//Find max number in given array list
		ArrayList<Integer>a= new ArrayList<Integer>();
		
		a.add(100);
		a.add(20);
		a.add(5000);
		a.add(45);
		a.add(3546);
		a.add(789);
		
	}

}
