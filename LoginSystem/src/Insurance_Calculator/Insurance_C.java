package Insurance_Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import Return_Result.Return_R;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Insurance_C {

	private JFrame frame;
	//select radio button
	private ButtonGroup btnGroup= new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insurance_C window = new Insurance_C();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Insurance_C() {
		NewWindows();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void NewWindows() {
		frame = new JFrame();
		frame.setBounds(400, 100, 558, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//show window
		frame.setVisible(true);
		
		JLabel lblInsuranceSystem = new JLabel("Insurance System");
		lblInsuranceSystem.setBackground(Color.WHITE);
		lblInsuranceSystem.setFont(new Font("Sitka Display", Font.BOLD, 20));
		lblInsuranceSystem.setBounds(194, 11, 191, 51);
		frame.getContentPane().add(lblInsuranceSystem);
		
		JLabel lblTypeOfInsurance = new JLabel("Choose of Insurance");
		lblTypeOfInsurance.setBackground(Color.WHITE);
		lblTypeOfInsurance.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTypeOfInsurance.setBounds(201, 97, 162, 14);
		frame.getContentPane().add(lblTypeOfInsurance);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(37, 122, 471, 14);
		frame.getContentPane().add(separator_3);
		
		JRadioButton rdbtnHouseInsurance = new JRadioButton("House Insurance");
		rdbtnHouseInsurance.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnHouseInsurance.setBounds(211, 143, 140, 23);
		frame.getContentPane().add(rdbtnHouseInsurance);
		
		
		JRadioButton rdbtnLifeInsurance = new JRadioButton("Life Insurance");
		rdbtnLifeInsurance.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnLifeInsurance.setBounds(211, 186, 109, 23);
		frame.getContentPane().add(rdbtnLifeInsurance);
		
		
		JRadioButton rdbtnCarInsurance = new JRadioButton("Car Insurance");
		rdbtnCarInsurance.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnCarInsurance.setBounds(211, 233, 109, 23);
		frame.getContentPane().add(rdbtnCarInsurance);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(41, 54, 467, 8);
		frame.getContentPane().add(separator);
		
		JButton btnNext = new JButton("Next");
		frame.getContentPane().add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			//show Window
			public void actionPerformed(ActionEvent e) {
				Return_R r = new Return_R();
				r.WindowsNext();
			}
		});
		btnNext.setBounds(211, 300, 109, 23);
		frame.getContentPane().add(btnNext);
		
		//select radio button
		btnGroup.add(rdbtnHouseInsurance);
		btnGroup.add(rdbtnLifeInsurance);
		btnGroup.add(rdbtnCarInsurance);
	}
	
}
