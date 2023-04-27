
public abstract class Shape {
	
	String shapeName;
	
	public Shape(String s) {
		shapeName=s;
	}

	public abstract double area();
	
	public String toString() {
		return shapeName;
	}
}
