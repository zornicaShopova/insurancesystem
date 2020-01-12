package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Insurance_Calculator.Insurance_C;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Login_S {

	private JFrame frmLoginSystem;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frmLoginSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		ShowWindow();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void ShowWindow() {
		frmLoginSystem = new JFrame();
		frmLoginSystem.setBounds(200, 200, 500, 300);
		frmLoginSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginSystem.getContentPane().setLayout(null);
		
		
		JLabel lblLoginSystem = new JLabel("Login System");
		lblLoginSystem.setBounds(202, 0, 77, 14);
		frmLoginSystem.getContentPane().add(lblLoginSystem);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(68, 61, 68, 14);
		frmLoginSystem.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(68, 120, 48, 14);
		frmLoginSystem.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(197, 58, 96, 20);
		frmLoginSystem.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(197, 117, 96, 20);
		frmLoginSystem.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		frmLoginSystem.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			//show window
			public void actionPerformed(ActionEvent e) {
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("1234") && username.contains("admin")){
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
				
				
				Insurance_C w2 = new Insurance_C();
				w2.NewWindows();
				
				
			}
		});
		btnLogin.setBounds(27, 210, 89, 23);
		frmLoginSystem.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
				
				
			}
		});
		btnReset.setBounds(169, 210, 89, 23);
		frmLoginSystem.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,"Confirm if you want to exit","Login System",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}	
			}
		});
		btnExit.setBounds(312, 210, 89, 23);
		frmLoginSystem.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 175, 406, 2);
		frmLoginSystem.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 30, 413, 2);
		frmLoginSystem.getContentPane().add(separator_1);
	}
	
}
