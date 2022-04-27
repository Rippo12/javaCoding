
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMMITED_ORDERS =5;
	private DigitalVideoDisc DVDOrdered[]= new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private CompactDisc CDOrdered[]= new CompactDisc[MAX_NUMBER_ORDERED];
	public int qtyOrdered =0;
	public static int nbOrders =0;
	
	
	//*****************Order******************************************
	
	Order()
	{
		if(nbOrders!=MAX_LIMMITED_ORDERS)
			nbOrders +=1;
		else
		System.out.println("Da dat gioi han so luong order!");
		
	}
	
	
	
	//*****************DVD********************************************
	int addDigitalVideoDisc(DigitalVideoDisc disc)
	{
		if(qtyOrdered>=MAX_NUMBER_ORDERED)
			{
			System.out.println("Da dat gioi han so luong dia duoc dat!");
			return -1;
			}
	
		else
			for(int counter=0;counter<MAX_NUMBER_ORDERED;counter++)
				if(DVDOrdered[counter]==null){
					
					DVDOrdered[counter]=disc;
					qtyOrdered+=1;
					break;
					}
		return 0;
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc[] disc,int numberOfDisc)
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
			if(DVDOrdered[counter]!=null)
				System.out.println(DVDOrdered[counter].getTitle());
			
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
			if(CDOrdered[counter]!=null)
				System.out.println(CDOrdered[counter].getTitle());
			
		}
	}
	//****************Service*****************************************
	float totalCost()
	{
		float totalCost = costDigitalVideoDisc() + costCompactDisc();
		return totalCost;
	}
	void printfOrder()
	{
		printfDVDOrder();
		printfCDOrder();
	}
	
	
}
