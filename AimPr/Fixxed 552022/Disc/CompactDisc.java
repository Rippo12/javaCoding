package Disc;

public class CompactDisc {
	

	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public CompactDisc(String title){
		super();
		this.title=title;
	}

	public boolean search(String title) {
		String strTitle1 = this.getTitle().toUpperCase();
		String strTitle2 = title.toUpperCase();
		boolean check = false;
		for(int counter1 =0; counter1 < strTitle1.length() - strTitle2.length() + 1; counter1++)
		{
			if (check==true)
				break;
			for(int counter2 =0; counter2 < strTitle2.length(); counter2++)
				if(strTitle1.charAt(counter1+counter2)==strTitle2.charAt(counter2)){	
					check=true;
					continue;
				}
				else {
					check=false;
					break;
				}
		}
		return check;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
}
