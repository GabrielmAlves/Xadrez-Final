package screens;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
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
		//Background image
		ImageIcon img = new ImageIcon(this.getClass().getResource("/xadd.png"));
        
        JLabel lblNewLabel = new JLabel("Chess Kings");
        lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 24));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(128, 11, 198, 37);
        frame.getContentPane().add(lblNewLabel);
                        
                        JButton btnNewButton = new JButton("PLAY");
                        btnNewButton.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                        		//Goes to ChooseScreen where the player will choose to be P1 or P2
                        		ChooseScreen back = new ChooseScreen();
                                frame.setVisible(false);
                                back.main(null);
                        	}
                        });
                        btnNewButton.setBackground(Color.LIGHT_GRAY);
                        btnNewButton.setForeground(new Color(0, 0, 0));
                        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
                        btnNewButton.setBounds(167, 73, 89, 23);
                        frame.getContentPane().add(btnNewButton);
                        
                                JLabel fundotela = new JLabel("PLAY");
                                fundotela.setIcon(img);
                                
                                        fundotela.setBounds(0, 0, 434, 261);
                                        frame.getContentPane().add(fundotela);
	}
}
