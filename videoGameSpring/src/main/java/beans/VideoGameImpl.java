package beans;

public class VideoGameImpl implements VideoGameServicing {
	private VideoGameDao videoGameDao;
	
	//Constructor
	public VideoGameImpl(VideoGameDao videoGameDao) {
		this.videoGameDao = videoGameDao;
	}
	
	//Getters and Setters
	public VideoGameDao getVideoGameDao() {
		return videoGameDao;
	}
	
	public void setVideoGameDao(VideoGameDao videoGameDao) {
		this.videoGameDao = videoGameDao;
	}
	
	//Helper Methods
	public void moveVideoGame(long sourceVideoGameBarcode, long targetVideoGameBarcode, int ammount) {  
		
		VideoGame sourceVideoGame = videoGameDao.find(sourceVideoGameBarcode);
		VideoGame targetVideoGame = videoGameDao.find(targetVideoGameBarcode);
		
		sourceVideoGame.setNumOwned((sourceVideoGame.getNumOwned() - ammount));
		targetVideoGame.setNumOwned((targetVideoGame.getNumOwned() + ammount));
		
		videoGameDao.update(sourceVideoGame);
		videoGameDao.update(targetVideoGame);
	}

	public void addDupVideoGame(long videoGameBarcode, int amount) throws Exception {
		VideoGame videoGame = videoGameDao.find(videoGameBarcode);
		videoGame.setNumOwned((videoGame.getNumOwned() + amount));
		videoGameDao.update(videoGame);
	}
	

	public VideoGame getVideoGame(long videoGameBarcode) {
		return videoGameDao.find(videoGameBarcode);
	}
}

