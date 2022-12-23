
public class Product {
	private String id;
	private int unit;
	private double price;

	public void setId(String ID) {
		id = ID;

	}

	public String getId() {
		return id;

	}

	public void setUnit(int Unit) {
		unit = Unit;

	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		double Total = 0;
		Total = price * unit;
		return Total;
	}

	public String checkUnit(int getUnit) {
		if (unit < 5) {
			return "LOW";
		} else if (unit >= 5 && unit <= 50) {
			return "NORMAL";
		} else
			return "HIGH";

	}
}
