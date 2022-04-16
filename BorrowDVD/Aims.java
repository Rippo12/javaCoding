
public class Aims {
	public static void main(String[] args )
	{	
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory ("Animation");
		dvd1.setCost (19.00f);
		dvd1.setDirectory("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Alladin");
		dvd2.setCategory ("Animation");
		dvd2.setCost (18.00f);
		dvd2.setDirectory("Roger Allers");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
	
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Star War");
		dvd3.setCategory ("Khoa hoc vien tuong");
		dvd3.setCost (24.00f);
		dvd3.setDirectory("George Lucas");
		dvd3.setLength(124);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
	}
	
}
