package exercise3modified;

import java.util.*;

public class Horse {
	private String breed;
	private double height;
	private String country;
	private String colour;
	
   Scanner in = new Scanner(System.in);
   
   //default constructor
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
   
   //parameterized constructor
   Horse(String b, double h, String c, String d){
	   this.breed = b;
	   this.height = h;
	   this.country = c;
	   this.colour = d;
}
   
   //getter
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
}
