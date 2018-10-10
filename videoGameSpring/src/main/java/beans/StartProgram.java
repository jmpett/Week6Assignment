package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) throws Exception {

		//Using Java Based Configuration with the Bean Configuration class.
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		VideoGameServicing videoGameServicing = applicationContext.getBean("videoGameProcessing", VideoGameServicing.class);
		
		//Move video games from one barcode to another
		int sourceVideoGame = 1;
		int targetVideoGame = 2;
		int amountMoved = 5;
		System.out.println("**Before video game moved -");
		System.out.println("VideoGame barcode: " + videoGameServicing.getVideoGame(1).getBarcode() + " amount owned: " + videoGameServicing.getVideoGame(1).getNumOwned());
		System.out.println("VideoGame barcode: " + videoGameServicing.getVideoGame(2).getBarcode() + " amount owned: " + videoGameServicing.getVideoGame(2).getNumOwned());
		videoGameServicing.moveVideoGame(sourceVideoGame, targetVideoGame, amountMoved);
		System.out.println("You are moving: " + amountMoved + " video games from barcode: " +  videoGameServicing.getVideoGame(sourceVideoGame).getBarcode() + " to barcode: " 
		+ videoGameServicing.getVideoGame(targetVideoGame).getBarcode());
		System.out.println("**After video game moved -");
		System.out.println("VideoGame barcode: " + videoGameServicing.getVideoGame(1).getBarcode() + " amount owned: " + videoGameServicing.getVideoGame(1).getNumOwned());
		System.out.println("VideoGame barcode: " + videoGameServicing.getVideoGame(2).getBarcode() + " amount owned: " + videoGameServicing.getVideoGame(2).getNumOwned());
		
		//Add a duplicate video game to a single barcode
		int amountAdded = 3;
		long dupBarcode = 1;
		System.out.println();
		System.out.println("**Before new duplicate game entered -");
		System.out.println("VideoGame barcode: " + videoGameServicing.getVideoGame(1).getBarcode() + " amount owned: " + videoGameServicing.getVideoGame(1).getNumOwned());
		videoGameServicing.addDupVideoGame(dupBarcode, amountAdded);
		System.out.println("You are adding 3 duplicate video games to barcode: " + videoGameServicing.getVideoGame(1).getBarcode());
		System.out.println("**After new duplicate game entered -");
		System.out.println("VideoGame barcode: " + videoGameServicing.getVideoGame(1).getBarcode() + " amount owned: " + videoGameServicing.getVideoGame(1).getNumOwned());
		
		//Find a video game using its barcode
		long findBarcode =2;
		System.out.println();
		System.out.println("**After finding barcode: " + videoGameServicing.getVideoGame(findBarcode).getBarcode() + " - ");
		System.out.println(videoGameServicing.getVideoGame(findBarcode));
	}
}
