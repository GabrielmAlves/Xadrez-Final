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

import javax.swing.JButton;
import java.awt.SystemColor;

import controller.Controller;
import controller.Players;

public class ChooseScreen {

	private JFrame frame;
	
	Players player1 = new Players();
	Players player2 = new Players();
	Controller c = new Controller();
	//Player1Name p1 = new Player1Name();
	//Player2Name p2 = new Player2Name();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseScreen window = new ChooseScreen();
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
	public ChooseScreen() {
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
        
        JButton btnStart = new JButton("START\r\n");
        btnStart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(c.verifica())
        		{
        			JOptionPane.showMessageDialog(null, "Welcome!");
        			//tem q criar a tela 
        		}
        	}
        });
        btnStart.setBackground(SystemColor.scrollbar);
        btnStart.setForeground(Color.BLACK);
        btnStart.setFont(new Font("Unispace", Font.PLAIN, 16));
        btnStart.setBounds(168, 84, 89, 23);
        frame.getContentPane().add(btnStart);
        
       // System.out.printf("%s", player1.getPlayer1());
       // System.out.printf("%s", player2.getPlayer2());
        
        JButton btnPlayer2 = new JButton("PLAYER 2\r\n");
        btnPlayer2.setFont(new Font("Unispace", Font.PLAIN, 10));
        btnPlayer2.setBounds(250, 50, 89, 23);
        frame.getContentPane().add(btnPlayer2);
        
        btnPlayer2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//Goes to Player2Name where the player 2 will type his name
        		Player2Name back = new Player2Name();
                frame.setVisible(false);
                back.main(null);
        	}
        });
        
        JButton btnPlayer1 = new JButton("PLAYER 1");
        btnPlayer1.setFont(new Font("Unispace", Font.PLAIN, 10));
        btnPlayer1.setBounds(89, 50, 89, 23);
        frame.getContentPane().add(btnPlayer1);
        
        btnPlayer1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//Goes to Player1Name where the player 1 will type his name
        		Player1Name back = new Player1Name();
                frame.setVisible(false);
                back.main(null);
        	}
        });
        
        JLabel lblNewLabel_1 = new JLabel("Choose your player");
        lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 18));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(115, 0, 289, 39);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel fundotela = new JLabel("");
        fundotela.setIcon(img);

        fundotela.setBounds(0, 0, 544, 261);
        frame.getContentPane().add(fundotela);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(0, 0, 434, 261);
        frame.getContentPane().add(lblNewLabel);
	}

}
