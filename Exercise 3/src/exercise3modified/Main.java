package exercise3modified;

public class Main {

	public static void main(String[] args) {
		
        Horse kuda = new Horse();
		
		System.out.println("Horse 1 Profile.");
		
		System.out.println();
		
		System.out.println("Breed: " + kuda.getBreed());
		System.out.println("Height: " + kuda.getHeight() + " hands");
		System.out.println("Country of Origin: " + kuda.getCountry());
	    System.out.println("Colour: " + kuda.getColour());
	    
	    System.out.println();
	    
	    Horse kuda1 = new Horse("Friesian Horse", 15.3, "Netherlands", "Black");
	    
        System.out.println("Horse 2 Profile.");
		
		System.out.println();
		
		System.out.println("Breed: " + kuda1.getBreed());
		System.out.println("Height: " + kuda1.getHeight() + " hands");
		System.out.println("Country of Origin: " + kuda1.getCountry());
	    System.out.println("Colour: " + kuda1.getColour());


	}

}
