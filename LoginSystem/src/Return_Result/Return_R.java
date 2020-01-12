package Return_Result;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import Calculation_Window.Calculation_W;

import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.util.Random;
import java.awt.event.InputMethodEvent;
import javax.swing.JRadioButton;

public class Return_R {

	private JFrame frmHouseIns;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAddress;
	private JTextField txtID;
	private JTextField txtEmail;
	private JTextField txtGSM;
	private JTextField txtTown;
	private JTextField txtAddress_1;
	private JTextField txtArea;
	
	//radio boxes
	private ButtonGroup btnGroup= new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Return_R window = new Return_R();
					window.frmHouseIns.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Return_R() {
		WindowsNext();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	public void WindowsNext() {
		frmHouseIns = new JFrame();
		frmHouseIns.setBounds(100, 100, 572, 508);
		frmHouseIns.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHouseIns.getContentPane().setLayout(null);
		//show window
		frmHouseIns.setVisible(true);
		
		JRadioButton rdbtnOneTPay = new JRadioButton("One-time payment");
		rdbtnOneTPay.setBounds(427, 194, 109, 23);
		frmHouseIns.getContentPane().add(rdbtnOneTPay);
		
		JRadioButton rdbtnTwoTPay = new JRadioButton("Two-time payment");
		rdbtnTwoTPay.setBounds(427, 232, 109, 23);
		frmHouseIns.getContentPane().add(rdbtnTwoTPay);
		
		JRadioButton rdbtnFourtTPay = new JRadioButton("Four-time payment");
		rdbtnFourtTPay.setBounds(426, 272, 109, 23);
		frmHouseIns.getContentPane().add(rdbtnFourtTPay);
		
		JLabel lblNewLabel = new JLabel("Insurance System");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel.setBounds(166, 11, 216, 28);
		frmHouseIns.getContentPane().add(lblNewLabel);
		
		JLabel lblHouseInsurance = new JLabel("House Insurance");
		lblHouseInsurance.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblHouseInsurance.setBounds(210, 65, 129, 18);
		frmHouseIns.getContentPane().add(lblHouseInsurance);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 52, 513, 2);
		frmHouseIns.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 109, 513, 8);
		frmHouseIns.getContentPane().add(separator_1);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPersonalInformation.setBounds(33, 109, 123, 29);
		frmHouseIns.getContentPane().add(lblPersonalInformation);
		
		JLabel lblCarInformation = new JLabel("House Information");
		lblCarInformation.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCarInformation.setBounds(222, 116, 105, 14);
		frmHouseIns.getContentPane().add(lblCarInformation);
		
		JLabel lblInsuranceTotal = new JLabel("Insurance Payment");
		lblInsuranceTotal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblInsuranceTotal.setBounds(426, 116, 91, 14);
		frmHouseIns.getContentPane().add(lblInsuranceTotal);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(178, 142, 8, 255);
		frmHouseIns.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(407, 142, 17, 255);
		frmHouseIns.getContentPane().add(separator_3);
		
		//Text Fields
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setBounds(10, 149, 64, 14);
		frmHouseIns.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setBounds(10, 181, 64, 14);
		frmHouseIns.getContentPane().add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setBounds(10, 222, 64, 14);
		frmHouseIns.getContentPane().add(lblAddress);
		
		JLabel lbl_ID = new JLabel("ID :");
		lbl_ID.setBounds(10, 259, 48, 14);
		frmHouseIns.getContentPane().add(lbl_ID);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 297, 48, 14);
		frmHouseIns.getContentPane().add(lblEmail);
		
		JLabel lblGsm = new JLabel("GSM:");
		lblGsm.setBounds(10, 339, 48, 14);
		frmHouseIns.getContentPane().add(lblGsm);
		
		JLabel lblTown = new JLabel("Town :");
		lblTown.setBounds(207, 166, 48, 14);
		frmHouseIns.getContentPane().add(lblTown);
		
		JLabel lblAddress_1 = new JLabel("Address :");
		lblAddress_1.setBounds(207, 198, 48, 14);
		frmHouseIns.getContentPane().add(lblAddress_1);
		
		JLabel lblArea = new JLabel("Area /m2/ :");
		lblArea.setBounds(207, 276, 59, 14);
		frmHouseIns.getContentPane().add(lblArea);
		
		JLabel lblValue = new JLabel("Value :");
		lblValue.setBounds(207, 339, 48, 14);
		frmHouseIns.getContentPane().add(lblValue);
		
		JLabel lblValueCall = new JLabel("");
		lblValueCall.setBounds(301, 339, 48, 14);
		frmHouseIns.getContentPane().add(lblValueCall);
		
		//show type of home
		String[] messageStrings = {"","House" , "Apartment"};
		JComboBox comboBox = new JComboBox(messageStrings);
		comboBox.setBounds(301, 232, 69, 22);
		frmHouseIns.getContentPane().add(comboBox);
		
		JLabel lblTypeOfHome = new JLabel("Select home :");
		lblTypeOfHome.setBounds(196, 239, 70, 14);
		frmHouseIns.getContentPane().add(lblTypeOfHome);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(84, 149, 84, 20);
		frmHouseIns.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(84, 178, 84, 20);
		frmHouseIns.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(80, 219, 88, 20);
		frmHouseIns.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		txtID = new JTextField();
		txtID.setBounds(80, 259, 88, 20);
		frmHouseIns.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(80, 300, 88, 20);
		frmHouseIns.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtGSM = new JTextField();
		txtGSM.setBounds(80, 336, 88, 20);
		frmHouseIns.getContentPane().add(txtGSM);
		txtGSM.setColumns(10);
		
		txtTown = new JTextField();
		txtTown.setBounds(287, 160, 96, 20);
		frmHouseIns.getContentPane().add(txtTown);
		txtTown.setColumns(10);
		
		txtAddress_1 = new JTextField();
		txtAddress_1.setBounds(287, 192, 96, 20);
		frmHouseIns.getContentPane().add(txtAddress_1);
		txtAddress_1.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(287, 270, 96, 20);
		frmHouseIns.getContentPane().add(txtArea);
		txtArea.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(23, 395, 523, 18);
		frmHouseIns.getContentPane().add(separator_4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//trying to show the error if we don't have input
					
					frmHouseIns = new JFrame("Submit");
					if(txtFirstName.equals("") || txtAddress_1.equals("") || txtGSM.equals("")) {
					JOptionPane.showConfirmDialog(frmHouseIns, "Error Input","Error Input",JOptionPane.OK_CANCEL_OPTION);
						
					}
					else {
						//show window
						Calculation_W next = new Calculation_W();
						next.CalculationWin();
					}
					
					//show data to another frame
					
					String firstname = txtFirstName.getText();
					String address = txtAddress_1.getText();
					String gsm = txtGSM.getText();
					
					//select one of the insurance type and show
					
					String insurance=null;
					if(rdbtnOneTPay.isSelected()) {
						rdbtnTwoTPay.setSelected(false);
						rdbtnFourtTPay.setSelected(false);
						insurance = rdbtnOneTPay.getText();
					}
					if(rdbtnTwoTPay.isSelected()) {
						rdbtnOneTPay.setSelected(false);
						rdbtnFourtTPay.setSelected(false);
						insurance = rdbtnTwoTPay.getText();
					}
					if(rdbtnFourtTPay.isSelected()) {
						rdbtnTwoTPay.setSelected(false);
						rdbtnOneTPay.setSelected(false);
						insurance = rdbtnFourtTPay.getText();
					}
					String home = (String)comboBox.getSelectedItem();
					
					//calculation of house insurance
					
					int value1 = Integer.parseInt(lblValueCall.getText());
					String sum = null;
					
					if(messageStrings.equals("House")) {
						if(rdbtnOneTPay.isSelected()) {
							int homeSum = (value1*2)/1000;
							sum = Integer.toString(homeSum);
						}
						else if(rdbtnTwoTPay.isSelected()) {
							int homeSum = ((value1*2)/1000)/2;
							sum = Integer.toString(homeSum);
						}
						else if(rdbtnFourtTPay.isSelected()) {
							int homeSum = ((value1*2)/1000)/4;
							sum = Integer.toString(homeSum);
						}
						
					}
					else if(messageStrings.equals("Apartment")) {
						if(rdbtnOneTPay.isSelected()) {
							int homeSum = (value1*3)/1000;
							sum = Integer.toString(homeSum);
						}
						else if(rdbtnTwoTPay.isSelected()) {
							int homeSum = ((value1*3)/1000)/2;
							sum = Integer.toString(homeSum);
						}
						else if(rdbtnFourtTPay.isSelected()) {
							int homeSum = ((value1*3)/1000)/4;
							sum = Integer.toString(homeSum);
						}
						
						
						
					}
					
					
					new Calculation_W(firstname,address,gsm,insurance,home,sum);	

				}});
	
		btnSubmit.setBounds(54, 424, 89, 23);
		frmHouseIns.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//reset button
				txtFirstName.setText(null);;
				txtLastName.setText(null);;
		        txtAddress.setText(null);
				txtID.setText(null);
				txtEmail.setText(null);
				txtGSM.setText(null);
				txtTown.setText(null);
				txtAddress_1.setText(null);
				txtArea.setText(null);
				
				 rdbtnOneTPay.setSelected(false);
				 rdbtnTwoTPay.setSelected(false);
				 rdbtnFourtTPay.setSelected(false);
				
			}
		});
		btnReset.setBounds(250, 424, 89, 23);
		frmHouseIns.getContentPane().add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHouseIns = new JFrame("Close");
				if(JOptionPane.showConfirmDialog(frmHouseIns, "Confirm if you want to close it ?","House Insurance",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnClose.setBounds(428, 424, 89, 23);
		frmHouseIns.getContentPane().add(btnClose);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(23, 136, 513, 2);
		frmHouseIns.getContentPane().add(separator_5);
		
		
		
		JButton btnSum = new JButton("Sum");
		int numbersum;
		btnSum.addActionListener(new ActionListener() {
			//show VALUE
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(txtArea.getText());
				int numbersum =( number * 1000);
				String s = String.valueOf(numbersum);
				lblValueCall.setText(s);
					
			}
		});
		btnSum.setBounds(302, 293, 68, 35);
		frmHouseIns.getContentPane().add(btnSum);
		
		
		
		//selected insurance type 
		btnGroup.add(rdbtnOneTPay);
		btnGroup.add(rdbtnTwoTPay);
		btnGroup.add(rdbtnFourtTPay);
	}
}
