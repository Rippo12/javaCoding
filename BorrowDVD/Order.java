
public class Order {
	public static final int MAX_NUMBERS_ORDERED =10;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered() {
		int quantity=0;
		while(this.itemsOrdered[quantity]!=null)
				quantity += 1;
		return quantity;
				
	}
	public void addDigitalVideoDisc(DigitalVideoDisc  disc)
	{
		for(int i =0 ;i<10 ; i++)
			if(this.itemsOrdered[i]==null)
				{
				this.itemsOrdered[i]=disc;
				break;
				}
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc  disc)
	{
		for(int i =0 ;i<10 ; i++)
			if(this.itemsOrdered[i]==disc)
				{
					for(int j =i ;j<10 ; j++)
						if(this.itemsOrdered[j+1]!=null)
							this.itemsOrdered[j]=this.itemsOrdered[j+1];
					break;
				}
	}
	public float totalCost()
	{
		float cost=0;
		for(int i =0 ;i<10 ; i++)
			if(this.itemsOrdered[i]!=null)
			{
				cost+= this.itemsOrdered[i].getCost();
				
			}
			else break;
		return cost;
	}
}
