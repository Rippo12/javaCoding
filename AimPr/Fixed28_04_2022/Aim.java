
public class Aim {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("Jonh Musker");
		dvd3.setLength(90);
		
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.printfOrder();
		System.out.print("\nTotal cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.printfOrder();
		System.out.print("\nTotal cost is: ");
		System.out.println(anOrder.totalCost());
		DigitalVideoDisc dvd[] = new DigitalVideoDisc[10];
		dvd[0] = new DigitalVideoDisc("Aladdin0");
		dvd[1] = new DigitalVideoDisc("Aladdin1");
		dvd[2] = new DigitalVideoDisc("Aladdin2");
		dvd[3] = new DigitalVideoDisc("Aladdin3");
		dvd[4] = new DigitalVideoDisc("Aladdin4");
		
		anOrder.addDigitalVideoDisc(dvd,10);
		anOrder.printfOrder();
		
	}

}
