
public class Date {
	private int dMouth;
	private int dDay;
	private int dYear;

	public Date() {
		dMouth = 1;
		dDay = 1;
		dYear = 1900;
	}

	public Date(int mouth, int day, int year) {
		dMouth = mouth;
		dDay = day;
		dYear = year;
	}
	public void setDate(int mouth,int day,int year) {
		dMouth = mouth;
		dDay = day;
		dYear = year;
	}
	public int getMouth() {
		return dMouth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return dMouth+"-"+dDay+"-"+dYear;
	}
}
