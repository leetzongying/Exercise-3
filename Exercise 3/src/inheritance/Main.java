package inheritance;

public class Main {
	
	public static void main(String[] args) {

		Horse Alpha = new Horse();
		Mustang Beta = new Mustang("Mustang", 14.5, "North America", "Black", 12, 10);
		
		System.out.println(Alpha);
		System.out.println();
		System.out.println(Beta);
		System.out.println("Total amount of food taken by " + Beta.getBreed() + " is" + Beta.getTotalFood());
	}

}
