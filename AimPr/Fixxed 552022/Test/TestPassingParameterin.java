package Test;
import Disc.DigitalVideoDisc;

public class TestPassingParameterin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("\nChange title:");
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	

	
	private static void changeTitle(DigitalVideoDisc dvd, String title) {
		// TODO Auto-generated method stub
		String oldTilte = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTilte);
	}
}
