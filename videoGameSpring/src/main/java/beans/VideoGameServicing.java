package beans;

//Servicing Layer
public interface VideoGameServicing {

	public void moveVideoGame(long sourceVideoGameBarcode, long targetVideoGameBarcode, int amount);
	public void addDupVideoGame(long videoGameBarcode, int amount) throws Exception;
	public VideoGame getVideoGame(long videoGameBarcode);
}
