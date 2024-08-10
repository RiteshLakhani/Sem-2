package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class calci {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
	}

}
