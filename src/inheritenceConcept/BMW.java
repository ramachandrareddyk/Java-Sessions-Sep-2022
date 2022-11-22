package inheritenceConcept;

public class BMW extends Car{
	
	public static void main(String[] args) {
		BMW b= new BMW();
		
		Car c= new BMW();
		
		b.start();
		b.price();
		b.start();
		
		c.start();
		c.price();
		c.stop();
	}

}
