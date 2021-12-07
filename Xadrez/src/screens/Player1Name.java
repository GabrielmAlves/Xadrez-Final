package screens;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import controller.Players;

import javax.swing.JButton;

import javax.swing.JOptionPane;


public class Player1Name {

	private JFrame frame;
	private JTextField textName;
	
	Players p1 = new Players();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player1Name window = new Player1Name();
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
	public Player1Name() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/xadd.png"));
		
		JButton btnSend = new JButton("SEND");
		btnSend.setFont(new Font("Unispace", Font.PLAIN, 16));
		btnSend.setBounds(164, 83, 89, 23);
		frame.getContentPane().add(btnSend);
		 
		
		btnSend.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//Return to ChooseScreen so the player can either start the game or click Player 2 button so he/she can type his/her name
        		ChooseScreen back = new ChooseScreen();
                frame.setVisible(false);
                p1.setPlayer1(textName.getText());
                JOptionPane.showMessageDialog(null,"Name: "+ p1.getPlayer1());
                back.main(null);
               
             
        	}
        });
		
		textName = new JTextField();
		textName.setBounds(140, 52, 137, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		
		
		
		JLabel lblNewLabel = new JLabel("What's your name?");
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(120, 11, 222, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFundo = new JLabel("New label");
		lblFundo.setBackground(Color.WHITE);
		lblFundo.setIcon(img);
		lblFundo.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblFundo);
		
		
		
	
		
		
	}
}
