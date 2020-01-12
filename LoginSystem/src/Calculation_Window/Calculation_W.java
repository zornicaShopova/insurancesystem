package Calculation_Window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Canvas;
import javax.swing.JTextPane;

import org.w3c.dom.Text;

import DBconnection.DBConnection;
import Return_Result.Return_R;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;

public class Calculation_W {

	private JFrame frmCalculation_W;
	private JTextField txtFirstName;
	private JTextField txtGSM;
	private JTextField txtAddress;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation_W window = new Calculation_W();
					window.frmCalculation_W.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Calculation_W() {
		CalculationWin();
	}
	//show data to another frame
    String firstname,address,gsm,insurance,home,sum;
    private JTable table;
    
	public Calculation_W(String firstname,String address,String gsm,String insurance,String home,String sum) {
		CalculationWin();
		this.firstname=firstname;
		this.address=address;
		this.gsm=gsm;
		this.insurance=insurance;
		this.home=home;
		this.sum=sum;
		
		
		AddDataToTable();
	}
	void AddDataToTable() {
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		Vector v = new Vector();
		
		v.add(firstname);
		v.add(address);
		v.add(gsm);
		v.add(insurance);
		v.add(home);
		v.add(sum);
		dt.addRow(v);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	public void CalculationWin() {
		
		frmCalculation_W = new JFrame();
		frmCalculation_W.setBounds(100, 100, 695, 397);
		frmCalculation_W.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//show Window
		frmCalculation_W.setVisible(true);
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_3 = new JSeparator();
		
		JButton btnConfirmPayment = new JButton("Confirm payment");
		btnConfirmPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            //show confirm message
				JOptionPane.showMessageDialog(null, "Thank you for your trust! The insurance is done!");
				System.exit(0);
				
				//DB connection
				
				PreparedStatement st;
				ResultSet rs;
				
				String fname = txtFirstName.getText();
				String faddress = txtAddress.getText();
				String gsm = txtGSM.getText();
				
				String query = "SELECT * FROM `insurance` WHERE `First Name` = ? AND `Home Address` = ? AND `GSM` = ?";
				
				try {
					st = DBConnection.getConnection().prepareStatement(query);
					
					st.setString(1, fname);
					st.setString(2,faddress);
					st.setString(3, gsm);
				} catch (SQLException e1) {
					Logger.getLogger(Calculation_W.class.getName()).log(Level.SEVERE,null,e1);
				}
				
			}
		});
		
		
		btnConfirmPayment.setFont(new Font("Sitka Text", Font.BOLD, 12));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculation_W = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmCalculation_W, "Are you sure you want to exit the operation?","Insurance System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Sitka Small", Font.BOLD, 12));
		
		JSeparator separator_4 = new JSeparator();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblInsuranceSystem = new JLabel("Insurance System");
		lblInsuranceSystem.setFont(new Font("Sitka Text", Font.BOLD, 25));
		
		JLabel lblSelectedInformation = new JLabel("Information");
		lblSelectedInformation.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "H_Address", "GSM", "Insurance", "Home", "Total "
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show window
				Return_R back = new Return_R();
				back.WindowsNext();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmCalculation_W.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(271)
							.addComponent(lblSelectedInformation))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(213)
							.addComponent(lblInsuranceSystem))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 651, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(btnConfirmPayment, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addComponent(btnBack)
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblInsuranceSystem)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSelectedInformation)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConfirmPayment)
						.addComponent(btnBack)
						.addComponent(btnExit))
					.addGap(18))
		);
		groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnConfirmPayment, btnExit, btnBack});
		frmCalculation_W.getContentPane().setLayout(groupLayout);
	}
}
