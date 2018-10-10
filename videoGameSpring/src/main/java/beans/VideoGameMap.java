package beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Map DataStructure Layer
public class VideoGameMap implements VideoGameDao {
	
	private Map<Long, VideoGame> videoGameMap = new HashMap<Long, VideoGame>();	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date videoGame1Date = null;
		try {
			videoGame1Date = sdf.parse("1985-09-13");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.util.Date videoGame2Date = null;
		try {
			videoGame2Date = sdf.parse("1986-02-21");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		VideoGame videoGame1 = new VideoGame(1L, "Super Mario Bros.", 10, videoGame1Date, true);
		VideoGame videoGame2 = new VideoGame(2L, "Zelda", 20, videoGame2Date, true);
		videoGameMap.put(videoGame1.getBarcode(), videoGame1);
		videoGameMap.put(videoGame2.getBarcode(), videoGame2);
	}
	
	public void insert(VideoGame videoGame) {
		videoGameMap.put(videoGame.getBarcode(), videoGame);
	}
	
	public void update(VideoGame videoGame) {
		videoGameMap.put(videoGame.getBarcode(), videoGame);
	}
	
	public VideoGame find(long videoGameBarcode) {
		return videoGameMap.get(videoGameBarcode);
	}
	
	//Currently not using the below, these are extras. 
	public void update(List<VideoGame> videoGamess) {
		for(VideoGame videoGame: videoGamess) {
			update(videoGame);
		}
	}
	
	public void delete(long videoGameBarcode) {
		videoGameMap.remove(videoGameBarcode);
	}
	
	public List<VideoGame> find(List<Long>videoGameBarcodes) {
		List<VideoGame> videoGames = new ArrayList<VideoGame>();
		for(Long barcode: videoGameBarcodes) {
			videoGames.add(videoGameMap.get(barcode));
		}
		return videoGames;
	}
	
	public List<VideoGame> find(String name) {
		List<VideoGame> videoGames = new ArrayList<VideoGame>();
		for(VideoGame videoGame: videoGameMap.values()) {
			if(name.equals(videoGame.getName())) {
				videoGames.add(videoGame);
			}
		}
		return videoGames;
	}
	
	public List<VideoGame> find(boolean owned) {
		List<VideoGame> videoGames = new ArrayList<VideoGame>();
		for(VideoGame videoGame: videoGameMap.values()) {
			if(owned == (videoGame.isOwned())) {
				videoGames.add(videoGame);
			}
		}
		return videoGames;
	}
}
