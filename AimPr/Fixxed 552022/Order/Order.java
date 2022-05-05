package Order;
import Disc.CompactDisc;
import Disc.DigitalVideoDisc;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMMITED_ORDERS =5;
	private DigitalVideoDisc DVDOrdered[]= new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private CompactDisc CDOrdered[]= new CompactDisc[MAX_NUMBER_ORDERED];
	public int qtyOrdered =0;
	public static int nbOrders =0;
	public static int nbCDDisc =0;
	public static int nbDVDDisc =0;
	private DigitalVideoDisc luckyItem;
	
	//*****************Order******************************************
	
	public Order()
	{
		if(nbOrders!=MAX_LIMMITED_ORDERS)
			nbOrders +=1;
		else
		System.out.println("Da dat gioi han so luong order!");
		
	}
	//*****************Testing******************************************
	public DigitalVideoDisc luckyItem()
	{
		if(nbDVDDisc!=0)
		{
			luckyItem = new DigitalVideoDisc(null);
			int luckyNumber=(int) Math.floor(Math.random() * nbDVDDisc);
			luckyItem = DVDOrdered[luckyNumber];
			
			luckyItem = new DigitalVideoDisc(DVDOrdered[luckyNumber].getTitle()+ " LI");
			luckyItem.setCategory(DVDOrdered[luckyNumber].getCategory());
			luckyItem.setCost(0);
			luckyItem.setDirector(DVDOrdered[luckyNumber].getDirector());
			luckyItem.setLength(DVDOrdered[luckyNumber].getLength());
			
			DVDOrdered[luckyNumber]=luckyItem;
			
			
			
			
			return luckyItem;
		}
		
		
		return null;
		
	}
	
	public void swap (Object o1, Object o2)
	{
		Object tmp=o1;
		o1=o2;
		o2=tmp;
		
	}
	
	public void test()
	{
		DVDOrdered[0].setCost(0);
		System.out.println(DVDOrdered[0].getCost());
		
	}
	
	//*****************DVD********************************************
	public int addDigitalVideoDisc(DigitalVideoDisc disc)
	{
		if(qtyOrdered>=MAX_NUMBER_ORDERED)
			{
			System.out.println("Da dat gioi han so luong dia duoc dat!");
			return -1;
			}
	
		else
			for(int counter=0;counter<MAX_NUMBER_ORDERED;counter++)
				if(DVDOrdered[counter]==null){
					nbDVDDisc+=1;
					DVDOrdered[counter]=disc;
					qtyOrdered+=1;
					break;
					}
		return 0;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] disc,int numberOfDisc)
	{
		
		int quantity = 0;
		int checkFullCart=0;
		for(int counter =0;counter < numberOfDisc;counter++)
		{
			
			if(disc[counter]==null)
			{
		
				System.out.println("Da dat thanh cong! ");
				break;
			}
			else if(checkFullCart == 0)
			{
				quantity=addDigitalVideoDisc(disc[counter]);
				if(quantity==-1) 
					{
						checkFullCart = 1;
						System.out.println("Cac dia chua duoc dat la: ");
						counter-=1;
						continue;
					}
			}
			else
				System.out.println(disc[counter].getTitle());
			}
		
	}
	
	int findDigitalVideoDisc(DigitalVideoDisc  disc)
	{
		for(int counter=0;counter<MAX_NUMBER_ORDERED;counter++)
			if(DVDOrdered[counter]==null)
				return -1;
			else if(DVDOrdered[counter]==disc)
				return counter;
		return -1;
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc  disc)
	{	
		
		int inCart = findDigitalVideoDisc( disc) 	;
		if(inCart==-1)
			return;
		else 
		for(int counter = inCart; counter<MAX_NUMBER_ORDERED;counter++)
			if(DVDOrdered[counter+1]==null)
				{
				DVDOrdered[counter]=null;
				break;
				}
			else
				DVDOrdered[counter]=DVDOrdered[counter+1];
		qtyOrdered -=1;
		nbDVDDisc -=1;
	}
	
	float costDigitalVideoDisc()
	{
		float costDigitalVideoDisc=0;
		for(int counter = 0; counter<MAX_NUMBER_ORDERED;counter++)
			if(DVDOrdered[counter]!=null)
				costDigitalVideoDisc+=DVDOrdered[counter].getCost();
		return costDigitalVideoDisc;
	}
	void printfDVDOrder()
	{
		System.out.println("Cac DVD ban da dat: ");
		for(int counter = 0; counter<MAX_NUMBER_ORDERED;counter++)
		{
			
			if(DVDOrdered[counter]!=null) {
				String strCost = Float.toString(DVDOrdered[counter].getCost());
				System.out.printf("%-40S %7S$\n",DVDOrdered[counter].getTitle() ,strCost);
			}
		}
	}
	//******************CD********************************************
	void addCompactDisc(CompactDisc disc)
	{
		if(qtyOrdered>=MAX_NUMBER_ORDERED)
			System.out.print("\nDa dat gioi han so luong dia duoc dat!");
	
		else
			for(int counter=0;counter<MAX_NUMBER_ORDERED;counter++)
				if(CDOrdered[counter]==null){
					nbCDDisc+=1;
					CDOrdered[counter]=disc;
					qtyOrdered+=1;
					break;
					}
	}
	
	int findCompactDisc(CompactDisc  disc)
	{
		for(int counter=0;counter<MAX_NUMBER_ORDERED;counter++)
			if(CDOrdered[counter]==null)
				return -1;
			else if(CDOrdered[counter]==disc)
				return counter;
		return -1;
	}
	
	void removeCompactDisc(CompactDisc  disc)
	{	
		
		int inCart = findCompactDisc( disc) 	;
		if(inCart==-1)
			return;
		else 
		for(int counter = inCart; counter<MAX_NUMBER_ORDERED;counter++)
			if(CDOrdered[counter+1]==null)
				{
				CDOrdered[counter]=null;
				break;
				}
			else
				CDOrdered[counter]=CDOrdered[counter+1];
		qtyOrdered -=1;
		nbCDDisc-=1;
	}
	
	float costCompactDisc()
	{
		float costDigitalVideoDisc=0;
		for(int counter = 0; counter<MAX_NUMBER_ORDERED;counter++)
			if(CDOrdered[counter]!=null)
				costDigitalVideoDisc+=CDOrdered[counter].getCost();
		return costDigitalVideoDisc;
	}
	void printfCDOrder()
	{
		System.out.println("Cac CD ban da dat: ");
		for(int counter = 0; counter<MAX_NUMBER_ORDERED;counter++)
		{	
			
			if(CDOrdered[counter]!=null) {
				String strCost = Float.toString(CDOrdered[counter].getCost());
				System.out.printf("%-40S %7S$\n",CDOrdered[counter].getTitle() ,strCost);
			}
		}
	}
	//****************Service*****************************************
	float totalCost()
	{
		float totalCost = costDigitalVideoDisc() + costCompactDisc();
		return totalCost;
	}
	public void printfOrder()
	{
		System.out.println("8******************Order************************8");
		printfDVDOrder();
		printfCDOrder();
		System.out.printf("%-40S %7.2f$\n","Total cost is: " ,this.totalCost());
		
		System.out.println("*************************************************");
	}
	
	
}
