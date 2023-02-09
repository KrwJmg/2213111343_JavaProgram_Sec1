
public class Rectangle2 implements Shape2 {
	private double width;
	private double length;

	public Rectangle2(double width, double length) {
		this.width = width;
		this.length = length;
		
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}

	@Override
	public String toString() {
		return "Rectangle [ wigth = " + this.width + " , length = " + this.length + " , " + "color = " + color
				+" ]";
	}

	public double getWidth() {
		return this.width;
	}

	public double getlength() {
		return this.length;
	}

}
