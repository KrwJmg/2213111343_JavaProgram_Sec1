
public class Personalinfo {
	private Person name;
	private Date bDay;
	private int personID;
	
	public Personalinfo() {
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	public Personalinfo(String first,String last,int mouth,int day,int year,int ID) {
		name = new Person(first,last);
		bDay = new Date(mouth,day,year);
		personID = ID;
	}
	public void setPersonalinfo(String first,String last,int mouth,int day,int year,int ID) {
		name.setName(first,last);
		bDay.setDate(mouth,day,year);
		personID = ID;
	}
	public String toString() {
		return "Name: "+name.toString()+"\n"+"Date of birth: "+bDay.toString()+"\n"+"Personal ID: "+personID;
	}

}
