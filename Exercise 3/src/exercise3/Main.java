package exercise3;

public class Main {

	public static void main(String[] args) {
		
		Horse kuda = new Horse();
		
		System.out.println("Horse 1 Profile.");
		
		System.out.println();
		
		System.out.println("Breed: " + kuda.breed);
		System.out.println("Height: " + kuda.height + " hands");
		System.out.println("Country of Origin: " + kuda.country);
	    System.out.println("Colour: " + kuda.colour);
	    
	    System.out.println();
	    
	    Horse kuda1 = new Horse("Friesian Horse", 15.3, "Netherlands", "Black");
	    
        System.out.println("Horse 2 Profile.");
		
		System.out.println();
		
		System.out.println("Breed: " + kuda1.breed);
		System.out.println("Height: " + kuda1.height + " hands");
		System.out.println("Country of Origin: " + kuda1.country);
	    System.out.println("Colour: " + kuda1.colour);

	}

}
