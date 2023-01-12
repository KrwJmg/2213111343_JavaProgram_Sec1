import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.text.*;

public class CacullateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CacullateTwoNumber frame = new CacullateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CacullateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNumber1.setBounds(34, 30, 95, 32);
		contentPane.add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2 ");
		lblNumber2.setBounds(34, 97, 78, 14);
		contentPane.add(lblNumber2);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(153, 36, 172, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(151, 94, 174, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResult.setBounds(169, 264, 46, 14);
		contentPane.add(lblResult);
		
		JComboBox cmdOperator = new JComboBox();
		cmdOperator.setBounds(153, 137, 78, 22);
		//contentPane.add(comboBox);
		cmdOperator.addItem("+");
		cmdOperator.addItem("-");
		cmdOperator.addItem("*");
		cmdOperator.addItem("/");
		contentPane.add(cmdOperator);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(34, 141, 59, 14);
		contentPane.add(lblOperator);
		
		JLabel lblDigit = new JLabel("New label");
		lblDigit.setBounds(34, 184, 46, 14);
		contentPane.add(lblDigit);
		
		JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(152, 180, 109, 23);
		contentPane.add(oneDigit);
		
		JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(153, 210, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOk) {
					num1= Double.parseDouble(txtNumber1.getText());
					num2= Double.parseDouble(txtNumber2.getText());
					operator = (String)cmdOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected())
						frmNumber = new DecimalFormat("#,###.0");
					else if (twoDigit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");
					
					lblResult.setText(frmNumber.format(sum));
				}
				
			}
		});
		btnOk.setBounds(87, 289, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(209, 289, 89, 23);
		contentPane.add(btnExit);
	
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
