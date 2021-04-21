package inheritance;

public class Mustang extends Horse {
	
	private double food;
	
	Mustang(String b, double h, String c, String d, int f, double e){
		super(b, h, c, d, f);
		food = e;
	}
	public double getFood() {
		return food;
	}
	public double getTotalFood() {
		return super.getMonth()*food;
	}
    public String toString() {
    	return super.toString() + "\n" + "Amount of food needed to eat (in kg) by " + super.getBreed() + ": " + food;
    }
}
