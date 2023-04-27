
public class Cylinder extends Shape {
	private double radius;  //radius in feet 
	private double height;
	 
	   //---------------------------------- 
	   //  Constructor: Sets up the Cylinder. 
	   //---------------------------------- 
	   public Cylinder(double r, double h) 
	   {   
	      super("Cylinder"); 
	      radius= r; 
	      height= h;
	   } 
	 
	   //----------------------------------------- 
	   //  Returns the surface area of the Cylinder. 
	   //----------------------------------------- 
	   public double area() 
	   { 
	       return Math.PI*Math.pow(radius,  2)*height; 
	   } 
	 
	   //----------------------------------- 
	   //  Returns the rectangle as a Cylinder. 
	   //-----------------------------------  
	   public String toString() 
	   { 
	       return super.toString() + " of Radius: " + radius + " and Height: " + height; 
	   }
}
