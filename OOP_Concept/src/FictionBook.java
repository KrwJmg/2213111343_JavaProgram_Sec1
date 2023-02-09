
public class FictionBook {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title=title;
		this.publicYear=publicYear;
	}
	public void setAuthorName(String name) {
		this.author_name =name;
	}

}
