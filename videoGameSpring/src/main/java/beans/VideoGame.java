package beans;

import java.util.Date;

public class VideoGame {
	private long barcode;			
	private String name;			
	private int numOwned;		
	private Date releaseDate;		
	private boolean owned;
	
	//Constructors
	public VideoGame() {
		
	}
	
	public VideoGame(long barcode, String name, int numOwned, Date releaseDate, boolean owned) {
		this.barcode = barcode;
		this.name = name;
		this.numOwned = numOwned;
		this.releaseDate = releaseDate;
		this.owned = owned;
	}

	//Getters and Setters
	public long getBarcode() {
		return barcode;
	}

	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOwned() {
		return numOwned;
	}

	public void setNumOwned(int numOwned) {
		this.numOwned = numOwned;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isOwned() {
		return owned;
	}

	public void setOwned(boolean owned) {
		this.owned = owned;
	}

	@Override
	public String toString() {
		return "VideoGame [Barcode= " + barcode + ", Name= " + name + ", Number Owned= " + numOwned + ", Release Date= "
				+ releaseDate + ", Owned= " + owned + "]";
	}
}
