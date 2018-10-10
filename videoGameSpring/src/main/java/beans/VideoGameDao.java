package beans;

import java.util.List;

//DAO Layer
public interface VideoGameDao {

	public void insert(VideoGame videoGame);
	public void update(VideoGame videoGame);
	public VideoGame find(long barcode);
	
	//Currently not using the below, these are extras. 
	public void update(List<VideoGame>videoGames);	
	public void delete(long barcode);	
	public List<VideoGame> find(List<Long>barcodes);
	public List<VideoGame> find(String name);
	public List<VideoGame> find(boolean owned);
}
