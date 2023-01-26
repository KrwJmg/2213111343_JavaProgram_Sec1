import java.util.*;
import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book1 book = new Book1();
		String author = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int choice = JOptionPane.showConfirmDialog(null, "Is the page correct?", title, JOptionPane.YES_NO_OPTION);
		while (choice == 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again:"));
			choice = JOptionPane.showConfirmDialog(null, "Is the page correct?", title, JOptionPane.YES_NO_OPTION);
		}
		// Author1 authorName = new Author1(author,email);
		Book1 book1 = new Book1(title, new Author1(author, email), page);

		JOptionPane.showMessageDialog(null, "Book Title : " + book1.getTitle() + "\nAuthor name : " + book1.getAuthor().getName()
				+ " (" + book1.getPage() + " page)" + "\nAuthor e-mail : "+book1.getAuthor().getEmail(),"Message",JOptionPane.INFORMATION_MESSAGE);

	}

}
