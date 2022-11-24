import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;

public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		DecimalFormat frm = new DecimalFormat("#,###");
		int balance = rand.nextInt(9) * 100000;
		int withDraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance:"+balance+
				"\nInput money to withdraw:"));
		int t = withDraw/1000;
		int hfive = (withDraw%1000)/500;
		int h = (withDraw%1000)%500/100;	
		if(withDraw>balance) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(withDraw>20000) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than 20,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (withDraw%100 !=0){
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw "+(withDraw%100)+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"You withdraw "+frm.format(withDraw)+" baht."+"\n1000 = "+t+"\n500 ="+hfive+"\n100 ="+h);
		}
	}

}
