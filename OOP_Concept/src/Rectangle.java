
public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(double width, double length, String color) {
		super(color);
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}
	@Override
	public String toString() {
		return "Rectangle [ wigth = "+this.width+" , length = "+this.length+" , "+super.toString()+" , Area = "+getArea()+" ]";
	}
	public double getWidth() {
		return this.width;
	}
	public double getlength() {
		return this.length;
	}

}
