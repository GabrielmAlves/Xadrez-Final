package screens;

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import controller.Players;

public class Player2Name {

	private JFrame frame;
	private JTextField textName;
	Players p2 = new Players();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player2Name window = new Player2Name();
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
	public Player2Name() {
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
		
		JButton btnSend = new JButton("SEND");
		btnSend.setFont(new Font("Unispace", Font.PLAIN, 16));
		btnSend.setBounds(166, 80, 89, 23);
		frame.getContentPane().add(btnSend);
		
		btnSend.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//Return to ChooseScreen so the player can either start the game or click Player 1 button so he/she can type his/her name
        		ChooseScreen back = new ChooseScreen();
                frame.setVisible(false);
                p2.setPlayer2(textName.getText());
                JOptionPane.showMessageDialog(null,"Name: "+ p2.getPlayer2());
                back.main(null);
        	}
        });
		
		textName = new JTextField();
		textName.setBounds(144, 49, 136, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		p2.setPlayer2(textName.getText());
		
		JLabel lblWhatsName = new JLabel("What's your name?");
		lblWhatsName.setFont(new Font("Unispace", Font.PLAIN, 18));
		lblWhatsName.setForeground(Color.WHITE);
		lblWhatsName.setBounds(118, 11, 214, 34);
		frame.getContentPane().add(lblWhatsName);
		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblBackground);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/xadd.png"));
		
		JLabel fundotela = new JLabel("");
        fundotela.setIcon(img);

        fundotela.setBounds(0, 0, 544, 261);
        frame.getContentPane().add(fundotela);
        
	}
}
