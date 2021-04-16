package exercise3;

import java.util.*;

public class Horse {
	String breed;
	double height;
	String country;
	String colour;
	
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
}
