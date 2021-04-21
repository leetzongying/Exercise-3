package inheritance;

import java.util.Scanner;

public class Horse {
	private String breed;
	private double height;
	private String country;
	private String colour;
	private int month;
	
	Scanner in = new Scanner(System.in);
	
	Horse(){
		   System.out.println("Enter type of breed:");
		   this.breed = in.nextLine();
		   System.out.println("Enter country of origin:");
		   this.country = in.nextLine();
		   System.out.println("Enter colour:");
		   this.colour = in.next();
		   System.out.println("Enter height:");
		   this.height = in.nextDouble();
		   
	   }
	
	Horse(String b, double h, String c, String d, int f){
		   this.breed = b;
		   this.height = h;
		   this.country = c;
		   this.colour = d;
		   this.month = f;
	}
	   
	   public String getBreed() {
		   return this.breed;
	   }
	   public double getHeight() {
		   return this.height;
	   }
	   public String getCountry() {
		   return this.country;
	   }
	   public String getColour() {
		   return this.colour;
	   }
	   public int getMonth() {
		   return this.month;
	   }
	   
	   public String toString() {
		   return  "Breed           : " + breed + "\n" +
				   "Height          : " + height + " hands" + "\n" +
				   "Country         : " + country + "\n" +
				   "Colour          : " + colour;
				   
				   
	   }

}
