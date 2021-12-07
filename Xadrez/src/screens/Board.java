package screens;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;

//import jdk.internal.misc.FileSystemOption;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import pieces.Pawn;
import pieces.Rook;
import pieces.Bishop;
import pieces.Horse;
import pieces.Queen;
import pieces.King;

public class Board {
	int value = 0;
	int piece = 0;
	int y1 = 0;
	int y2 = 0;
	int y3 = 0;
	int y4 = 0;
	int y5 = 0;
	int y6 = 0;
	int y7 = 0;
	int y8 = 0;
	int y9 = 0;
	int y10 = 0;
	int y11 = 0;
	int y12 = 0;
	int y13 = 0;
	int y14 = 0;
	int y15 = 0;
	int y16 = 0;
	//int ybrook = 0;
	//int ybrook2 = 0;
	boolean black;
	String name;
	int status;
	int ind;
	//int ind1;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board window = new Board();
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
	public Board() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		//Black pawns
		Pawn p1 = new Pawn();
		Pawn p2 = new Pawn();
		Pawn p3 = new Pawn();
		Pawn p4 = new Pawn();
		Pawn p5 = new Pawn();
		Pawn p6 = new Pawn();
		Pawn p7 = new Pawn();
		Pawn p8 = new Pawn();
		//White pawns
		Pawn wp1 = new Pawn();
		Pawn wp2 = new Pawn();
		Pawn wp3 = new Pawn();
		Pawn wp4 = new Pawn();
		Pawn wp5 = new Pawn();
		Pawn wp6 = new Pawn();
		Pawn wp7 = new Pawn();
		Pawn wp8 = new Pawn();
		//Black rooks
		Rook br1 = new Rook();
		Rook br2 = new Rook();
		//Controller
		Controller c1 = new Controller();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBKing = new JLabel("New label");
		lblBKing.setBounds(251, 0, 63, 60);
		frame.getContentPane().add(lblBKing);
		ImageIcon bking = new ImageIcon(this.getClass().getResource("/reipreto.png"));
		lblBKing.setIcon(bking);
		
		JLabel lblBQueen = new JLabel("New label");
		lblBQueen.setBounds(189, 0, 63, 60);
		frame.getContentPane().add(lblBQueen);
		ImageIcon bqueen = new ImageIcon(this.getClass().getResource("/rainhapreta.png"));
		lblBQueen.setIcon(bqueen);
		
		JLabel lblBBishop2 = new JLabel("New label");
		lblBBishop2.setBounds(317, 0, 56, 60);
		frame.getContentPane().add(lblBBishop2);
		ImageIcon bbishop2 = new ImageIcon(this.getClass().getResource("/bispopreto.png"));
		lblBBishop2.setIcon(bbishop2);
		
		JLabel lblBBishop1 = new JLabel("New label");
		lblBBishop1.setBounds(125, 0, 63, 60);
		frame.getContentPane().add(lblBBishop1);
		ImageIcon bbishop1 = new ImageIcon(this.getClass().getResource("/bispopreto.png"));
		lblBBishop1.setIcon(bbishop1);
		
		JLabel lblBHorse2 = new JLabel("New label");
		lblBHorse2.setBounds(373, 0, 63, 60);
		frame.getContentPane().add(lblBHorse2);
		ImageIcon bhorse2 = new ImageIcon(this.getClass().getResource("/cavalopreto.png"));
		lblBHorse2.setIcon(bhorse2);
		
		JLabel lblBHorse1 = new JLabel("New label");
		lblBHorse1.setBounds(64, 0, 63, 60);
		frame.getContentPane().add(lblBHorse1);
		ImageIcon bhorse1 = new ImageIcon(this.getClass().getResource("/cavalopreto.png"));
		lblBHorse1.setIcon(bhorse1);
		
		JLabel lblBRook2 = new JLabel("New label");
		lblBRook2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(br2.getY()<420)
				{
					value = 1;
					//ybrook2 = ybrook2 +0;
					black = true;
					status = 18;
					ind = 0;
					if(br2.getY()<420)
					{
						if(value==1)
						{
							//br2.setY(ybrook2);
							System.out.printf("YtorreB = %d", br2.getY());
							System.out.printf("\nValorTorreB:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBRook2.setBounds(438, 0, 63, 60);
		frame.getContentPane().add(lblBRook2);
		ImageIcon brook2 = new ImageIcon(this.getClass().getResource("/torrepreta.png"));
		lblBRook2.setIcon(brook2);
		
		JLabel lblBRook1 = new JLabel("New label");
		br1.setY(0);
		br1.setX(0);
		lblBRook1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(br1.getY()<420)
				{
					value = 1;
					//ybrook = ybrook +0;
					black = true;
					status = 17;
					ind = 0;
					if(br1.getY()<420)
					{
						if(br1.getY()==0)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							c1.borda(value, black, piece, lblBRook1, ind);
							//br1.setY(ybrook);
							System.out.printf("YtorreB = %d", br1.getY());
							System.out.printf("\nValorTorreB:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBRook1.setBounds(0, 0, 63, 60);
		frame.getContentPane().add(lblBRook1);
		ImageIcon brook1 = new ImageIcon(this.getClass().getResource("/torrepreta.png"));
		lblBRook1.setIcon(brook1);
		
		JLabel lblBPawn8 = new JLabel("New label");
		lblBPawn8.setBounds(438, 61, 62, 60);
		p8.setY(61);
		p8.setX(438);
		lblBPawn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p8.getY()<420)
				{
					value = 1;
					y8 = y8 +60;
					black = true;
					status = 8;
					ind = 0;
					if(p8.getY()<420)
					{
						if(p8.getY()==60)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							p8.setY(y8);
							System.out.printf("Y = %d", p8.getY());
							System.out.printf("\nValor:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBPawn8.setBounds(438, 61, 62, 60);
		frame.getContentPane().add(lblBPawn8);
		ImageIcon bpawn8 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn8.setIcon(bpawn8);
		
		JLabel lblBPawn7 = new JLabel("New label");
		lblBPawn7.setBounds(373, 61, 63, 60);
		p7.setY(61);
		p7.setX(373);
		lblBPawn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p7.getY()<420)
				{
					value = 1;
					y7 = y7 +60;
					black = true;
					status = 7;
					ind = 0;
					if(p7.getY()<420)
					{
						if(p7.getY()==60)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							p7.setY(y7);
							System.out.printf("Y = %d", p7.getY());
							System.out.printf("\nValor:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBPawn7.setBounds(373, 61, 63, 60);
		frame.getContentPane().add(lblBPawn7);
		ImageIcon bpawn7 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn7.setIcon(bpawn7);
		
		JLabel lblBPawn6 = new JLabel("New label");
		lblBPawn6.setBounds(314, 61, 59, 60);
		p6.setY(61);
		p6.setX(314);
		lblBPawn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p6.getY()<420)
				{
					value = 1;
					y6 = y6 +60;
					black = true;
					status = 6;
					ind = 0;
					if(p6.getY()<420)
					{
						if(p6.getY()==60)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							p6.setY(y6);
							System.out.printf("Y = %d", p6.getY());
							System.out.printf("\nValor:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBPawn6.setBounds(314, 61, 59, 60);
		frame.getContentPane().add(lblBPawn6);
		ImageIcon bpawn6 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn6.setIcon(bpawn6);
		
		JLabel lblBPawn5 = new JLabel("New label");
		lblBPawn5.setBounds(251, 61, 63, 60);
		p5.setY(61);
		p5.setX(251);
		lblBPawn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p5.getY()<420)
				{
					value = 1;
					y5 = y5 +60;
					black = true;
					status = 5;
					ind = 0;
					if(p5.getY()<420)
					{
						if(p5.getY()==60)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							p5.setY(y5);
							System.out.printf("Y = %d", p5.getY());
							System.out.printf("\nValor:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBPawn5.setBounds(251, 61, 63, 60);
		frame.getContentPane().add(lblBPawn5);
		ImageIcon bpawn5 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn5.setIcon(bpawn5);
		
		
		
		JLabel lblBPawn4 = new JLabel("New label");
		lblBPawn4.setBounds(189, 61, 63, 60);
		p4.setY(61);
		p4.setX(189);
		lblBPawn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p4.getY()<420)
				{
					value = 1;
					y4 = y4 +60;
					black = true;
					status = 4;
					ind = 0;
					if(p4.getY()<420)
					{
						if(p4.getY()==60)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							p4.setY(y4);
							System.out.printf("Y = %d", p4.getY());
							System.out.printf("\nValor:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBPawn4.setBounds(189, 61, 63, 60);
		frame.getContentPane().add(lblBPawn4);
		ImageIcon bpawn4 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn4.setIcon(bpawn4);
		
		
		
		
		JLabel lblBPawn3 = new JLabel("New label");
		lblBPawn3.setBounds(125, 61, 63, 60);
		p3.setY(61);
		p3.setX(125);
		lblBPawn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p3.getY()<420)
				{
					value = 1;
					y3 = y3 +60;
					black = true;
					status = 3;
					ind = 0;
					if(p3.getY()<420)
					{
						if(p3.getY()==60)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							p3.setY(y3);
							System.out.printf("Y = %d", p3.getY());
							System.out.printf("\nValor:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBPawn3.setBounds(125, 61, 63, 60);
		frame.getContentPane().add(lblBPawn3);
		ImageIcon bpawn3 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn3.setIcon(bpawn3);
		
		
		
		JLabel lblBPawn2 = new JLabel("New label");
		
		lblBPawn2.setBounds(64, 61, 63, 60);
		p2.setY(61);
		p2.setX(64);
		lblBPawn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(p2.getY()<420)
				{
					value = 1;
					y2 = y2 +61;
					black = true;
					status = 2;
					ind = 0;
					if(p2.getY()<420)
					{
						if(p2.getY()==61)
						{
							//onde faz a cor de onde o peão pode ir ficar colorida
						}
						if(value==1)
						{
							p2.setY(y2);
							System.out.printf("Y = %d", p2.getY());
							System.out.printf("\nValor:%d\n", value);
							
						}
						
					}
				}
			}
		});
		lblBPawn2.setBounds(64, 61, 63, 60);
		frame.getContentPane().add(lblBPawn2);
		ImageIcon bpawn2 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn2.setIcon(bpawn2);
		
		
		
		JLabel lblBPawn1 = new JLabel("New label");
		lblBPawn1.setBounds(0, 61, 63, 60);
		p1.setY(61);
		p1.setX(0);
		
		lblBPawn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				y1 = y1 +60;
				black = true;
				status = 1;
				ind = 0;
				if(p1.getY()<420)
				{
					if(p1.getY()==60)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						p1.setY(y1);
						System.out.printf("Y = %d", p1.getY());
						System.out.printf("\nValor:%d\n", value);
						System.out.printf("\nValor:%s\n", name);
						
					}
					
				}
			}
		});
		lblBPawn1.setBounds(0, 61, 63, 60);
		frame.getContentPane().add(lblBPawn1);
		ImageIcon bpawn1 = new ImageIcon(this.getClass().getResource("/peaopreto.png"));
		lblBPawn1.setIcon(bpawn1);
		
		//WHITE PIECES
		
		JLabel lblWKing = new JLabel("New label");
		lblWKing.setBounds(251, 420, 63, 60);
		frame.getContentPane().add(lblWKing);
		ImageIcon king = new ImageIcon(this.getClass().getResource("/reibranco.png"));
		lblWKing.setIcon(king);
		
		JLabel lblWQueen = new JLabel("New label");
		lblWQueen.setBounds(189, 420, 63, 60);
		frame.getContentPane().add(lblWQueen);
		ImageIcon queen = new ImageIcon(this.getClass().getResource("/rainhabranca.png"));
		lblWQueen.setIcon(queen);
		
		JLabel lblWBishop2 = new JLabel("New label");
		lblWBishop2.setBounds(317, 420, 56, 60);
		frame.getContentPane().add(lblWBishop2);
		ImageIcon bishop2 = new ImageIcon(this.getClass().getResource("/bispobranco.png"));
		lblWBishop2.setIcon(bishop2);
		
		JLabel lblWBishop1 = new JLabel("New label");
		lblWBishop1.setBounds(125, 420, 63, 60);
		frame.getContentPane().add(lblWBishop1);
		ImageIcon bishop1 = new ImageIcon(this.getClass().getResource("/bispobranco.png"));
		lblWBishop1.setIcon(bishop1);
		
		JLabel lblWHorse2 = new JLabel("New label");
		lblWHorse2.setBounds(373, 420, 63, 60);
		frame.getContentPane().add(lblWHorse2);
		ImageIcon horse2 = new ImageIcon(this.getClass().getResource("/cavalobranco.png"));
		lblWHorse2.setIcon(horse2);
		
		JLabel lblWHorse1 = new JLabel("New label");
		lblWHorse1.setBounds(62, 420, 63, 60);
		frame.getContentPane().add(lblWHorse1);
		ImageIcon horse1 = new ImageIcon(this.getClass().getResource("/cavalobranco.png"));
		lblWHorse1.setIcon(horse1);
		
		JLabel lblWRook2 = new JLabel("New label");
		lblWRook2.setBounds(438, 420, 62, 60);
		frame.getContentPane().add(lblWRook2);
		ImageIcon rook2 = new ImageIcon(this.getClass().getResource("/torrebranca.png"));
		lblWRook2.setIcon(rook2);
		
		JLabel lblWRook1 = new JLabel("New label");
		lblWRook1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblWRook1.setBounds(0, 420, 63, 60);
		frame.getContentPane().add(lblWRook1);
		ImageIcon rook1 = new ImageIcon(this.getClass().getResource("/torrebranca.png"));
		lblWRook1.setIcon(rook1);
		
		JLabel lblWPawn8 = new JLabel("New label");
		wp8.setY(359);
		wp8.setX(438);
		lblWPawn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 16;
				if(wp8.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp8.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp8.setY(wp8.getY());
						System.out.printf("YWhite1 = %d", wp8.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn8.setBounds(438, 359, 62, 62);
		frame.getContentPane().add(lblWPawn8);
		ImageIcon pawn8 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn8.setIcon(pawn8);
		
		JLabel lblWPawn7 = new JLabel("New label");
		wp7.setY(359);
		wp7.setX(373);
		lblWPawn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 15;
				if(wp7.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp7.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp7.setY(wp7.getY());
						System.out.printf("YWhite7 = %d", wp7.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn7.setBounds(373, 359, 63, 62);
		frame.getContentPane().add(lblWPawn7);
		ImageIcon pawn7 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn7.setIcon(pawn7);
		
		JLabel lblWPawn6 = new JLabel("New label");
		wp6.setY(359);
		wp6.setX(316);
		lblWPawn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 14;
				if(wp6.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp6.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp6.setY(wp6.getY());
						System.out.printf("YWhite1 = %d", wp6.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn6.setBounds(316, 359, 57, 62);
		frame.getContentPane().add(lblWPawn6);
		ImageIcon pawn6 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn6.setIcon(pawn6);
		
		JLabel lblWPawn5 = new JLabel("New label");
		wp5.setY(359);
		wp5.setX(251);
		lblWPawn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 13;
				if(wp5.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp5.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp5.setY(wp5.getY());
						System.out.printf("YWhite5 = %d", wp5.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn5.setBounds(251, 359, 63, 62);
		frame.getContentPane().add(lblWPawn5);
		ImageIcon pawn5 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn5.setIcon(pawn5);
		
		JLabel lblWPawn4 = new JLabel("New label");
		wp4.setY(359);
		wp4.setX(189);
		lblWPawn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 12;
				if(wp4.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp4.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp4.setY(wp4.getY());
						System.out.printf("YWhite1 = %d", wp4.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn4.setBounds(189, 359, 63, 62);
		frame.getContentPane().add(lblWPawn4);
		ImageIcon pawn4 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn4.setIcon(pawn4);
		
		JLabel lblWPawn3 = new JLabel("New label");
		wp3.setY(359);
		wp3.setX(125);
		lblWPawn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 11;
				if(wp3.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp3.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp3.setY(wp3.getY());
						System.out.printf("YWhite1 = %d", wp3.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn3.setBounds(125, 359, 63, 62);
		frame.getContentPane().add(lblWPawn3);
		ImageIcon pawn3 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn3.setIcon(pawn3);
		
		JLabel lblWPawn2 = new JLabel("New label");
		wp2.setY(359);
		wp2.setX(62); //depois tentar aqui com wp2 e nas labels teste 5 ate teste 8
		lblWPawn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 10;
				if(wp2.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp2.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp2.setY(wp2.getY());
						System.out.printf("YWhite1 = %d", wp2.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn2.setBounds(62, 359, 63, 62);
		frame.getContentPane().add(lblWPawn2);
		ImageIcon pawn2 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn2.setIcon(pawn2);
		
		JLabel lblWPawn1 = new JLabel("New label");
		wp1.setY(359);
		wp1.setX(0); //depois tentar com wp1 aqui e nas labels teste ate teste 4
		lblWPawn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				value = 1;
				//y9 = 359;
				black = false;
				String name = "peao";
				status = 9;
				if(wp1.getY()>0) //testar o objeto como p1 ou wp1
				{
					if(wp1.getY()==359)
					{
						//onde faz a cor de onde o peão pode ir ficar colorida
					}
					if(value==1)
					{
						
						wp1.setY(wp1.getY());
						System.out.printf("YWhite1 = %d", wp1.getY());
						System.out.printf("\nValorWhite1:%d\n", value);
						System.out.printf("\nValorWhite1:%s\n", name);
						
					}
					
				}
			}
		});
		lblWPawn1.setBounds(0, 359, 63, 62);
		frame.getContentPane().add(lblWPawn1);
		ImageIcon pawn1 = new ImageIcon(this.getClass().getResource("/peaobranco.png"));
		lblWPawn1.setIcon(pawn1);
		
		
		//////////////////////////////
		
		JLabel lblBackground = new JLabel("New label");
		lblBackground.setBounds(0, 0, 500, 346);
		frame.getContentPane().add(lblBackground);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/cb.png"));
		lblBackground.setIcon(img);
		lblBackground.setBounds(0, 0, 500, 480);
        frame.getContentPane().add(lblBackground);
        
        JButton btnNewButton = new JButton("MENU");
        btnNewButton.setFont(new Font("Unispace", Font.PLAIN, 10));
        btnNewButton.setBounds(503, 258, 81, 23);
        frame.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("QUIT");
        btnNewButton_1.setFont(new Font("Unispace", Font.PLAIN, 10));
        btnNewButton_1.setBounds(503, 200, 81, 23);
        frame.getContentPane().add(btnNewButton_1);
        
        //BLACK PIECES MOVIMENTATION
        
        JLabel lblTeste = new JLabel("New label");
        lblTeste.setForeground(Color.BLACK);
        lblTeste.setBackground(Color.WHITE);
        lblTeste.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		//lblTeste.setForeground(Color.red);
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,0,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,0,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
  
        
        	}
        });
        
        //LABELS DE MOVIMENTAÇÃO
        //teste até teste4 (1 coluna), 5 ate 8 (2 coluna), 9 ate 12 (3 coluna), 13 ate 16 (4 coluna), 17 ate 20 (5 coluna), 21 ate 24 (6 coluna), 25 ate 28 (7 coluna), 29 ate 32 (8 coluna);
        lblTeste.setBounds(0, 120, 63, 60);
        frame.getContentPane().add(lblTeste);
        
        JLabel lblTeste2 = new JLabel("New label");
        lblTeste2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,0,182);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,0,182);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste2.setBounds(0, 182, 63, 60);
        frame.getContentPane().add(lblTeste2);
        
        JLabel lblTeste3 = new JLabel("New label");
        lblTeste3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,0,243);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,0,243);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste3.setBounds(0, 243, 63, 60);
        frame.getContentPane().add(lblTeste3);
        
        JLabel lblTeste4 = new JLabel("New label");
        lblTeste4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,0,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,0,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste4.setBounds(0, 303, 63, 60);
        frame.getContentPane().add(lblTeste4);
        
        JLabel lblTeste5 = new JLabel("New label"); //label onde o peão 1 preto pode andar na diagonal*
        lblTeste5.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,64,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,64,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste5.setBounds(64, 120, 63, 60);
        frame.getContentPane().add(lblTeste5);
        
        JLabel lblTeste6 = new JLabel("New label");
        lblTeste6.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,64,182);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,64,182);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste6.setBounds(64, 182, 63, 60);
        frame.getContentPane().add(lblTeste6);
        
        JLabel lblTeste7 = new JLabel("New label");
        lblTeste7.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,64,240);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,64,240);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste7.setBounds(64, 240, 63, 59);
        frame.getContentPane().add(lblTeste7);
        
        JLabel lblTeste8 = new JLabel("New label");
        lblTeste8.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,64,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,64,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste8.setBounds(64, 303, 63, 60);
        frame.getContentPane().add(lblTeste8);
        
        JLabel lblTeste9 = new JLabel("New label");
        lblTeste9.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,125,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,125,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste9.setBounds(125, 120, 63, 60);
        frame.getContentPane().add(lblTeste9);
        
        JLabel lblTeste10 = new JLabel("New label");
        lblTeste10.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,125,179);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,125,179);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste10.setBounds(125, 179, 63, 60);
        frame.getContentPane().add(lblTeste10);
        
        JLabel lblTeste11 = new JLabel("New label");
        lblTeste11.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,124,243);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,124,243);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste11.setBounds(124, 243, 64, 60);
        frame.getContentPane().add(lblTeste11);
        
        JLabel lblTeste12 = new JLabel("New label");
        lblTeste12.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,125,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,125,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste12.setBounds(125, 303, 63, 60);
        frame.getContentPane().add(lblTeste12);
        
        JLabel lblTeste13 = new JLabel("New label");
        lblTeste13.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,189,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,189,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste13.setBounds(189, 120, 63, 60);
        frame.getContentPane().add(lblTeste13);
        
        JLabel lblTeste14 = new JLabel("New label");
        lblTeste14.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,189,180);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,189,180);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste14.setBounds(189, 180, 63, 62);
        frame.getContentPane().add(lblTeste14);
        
        JLabel lblTeste15 = new JLabel("New label");
        lblTeste15.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,189,243);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,189,243);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste15.setBounds(189, 243, 63, 60);
        frame.getContentPane().add(lblTeste15);
        
        JLabel lblTeste16 = new JLabel("New label");
        lblTeste16.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,189,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,189,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste16.setBounds(189, 303, 63, 60);
        frame.getContentPane().add(lblTeste16);
        
        JLabel lblTeste17 = new JLabel("New label");
        lblTeste17.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,251,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,251,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste17.setBounds(251, 120, 63, 60);
        frame.getContentPane().add(lblTeste17);
        
        JLabel lblTeste18 = new JLabel("New label");
        lblTeste18.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,251,182);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,251,182);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste18.setBounds(251, 182, 63, 60);
        frame.getContentPane().add(lblTeste18);
        
        JLabel lblTeste19 = new JLabel("New label");
        lblTeste19.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,251,243);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,251,243);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste19.setBounds(251, 243, 63, 60);
        frame.getContentPane().add(lblTeste19);
        
        JLabel lblTeste20 = new JLabel("New label");
        lblTeste20.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,251,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,251,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste20.setBounds(251, 303, 63, 60);
        frame.getContentPane().add(lblTeste20);
        
        JLabel lblTeste21 = new JLabel("New label");
        lblTeste21.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,314,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,314,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste21.setBounds(314, 120, 59, 60);
        frame.getContentPane().add(lblTeste21);
        
        JLabel lblTeste22 = new JLabel("New label");
        lblTeste22.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,314,182);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,314,182);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste22.setBounds(314, 182, 59, 60);
        frame.getContentPane().add(lblTeste22);
        
        JLabel lblTeste23 = new JLabel("New label");
        lblTeste23.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,313,243);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,313,243);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste23.setBounds(313, 243, 63, 60);
        frame.getContentPane().add(lblTeste23);
        
        JLabel lblTeste24 = new JLabel("New label");
        lblTeste24.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,311,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,311,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste24.setBounds(311, 303, 62, 60);
        frame.getContentPane().add(lblTeste24);
        
        JLabel lblTeste25 = new JLabel("New label");
        lblTeste25.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,373,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,373,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste25.setBounds(373, 120, 63, 60);
        frame.getContentPane().add(lblTeste25);
        
        JLabel lblTeste26 = new JLabel("New label");
        lblTeste26.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,373,182);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,373,182);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste26.setBounds(373, 182, 63, 60);
        frame.getContentPane().add(lblTeste26);
        
        JLabel lblTeste27 = new JLabel("New label");
        lblTeste27.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,373,244);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,373,244);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste27.setBounds(373, 244, 63, 55);
        frame.getContentPane().add(lblTeste27);
        
        JLabel lblTeste28 = new JLabel("New label");
        lblTeste28.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,373,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,373,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste28.setBounds(373, 303, 63, 60);
        frame.getContentPane().add(lblTeste28);
        
        JLabel lblTeste29 = new JLabel("New label");
        lblTeste29.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,438,120);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,438,120);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste29.setBounds(438, 120, 63, 60);
        frame.getContentPane().add(lblTeste29);
        
        JLabel lblTeste30 = new JLabel("New label");
        lblTeste30.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,438,182);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,438,182);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste30.setBounds(438, 182, 63, 60);
        frame.getContentPane().add(lblTeste30);
        
        JLabel lblTeste31 = new JLabel("New label");
        lblTeste31.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,438,243);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,438,243);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste31.setBounds(438, 243, 63, 60);
        frame.getContentPane().add(lblTeste31);
        
        JLabel lblTeste32 = new JLabel("New label");
        lblTeste32.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,438,303);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,438,303);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste32.setBounds(438, 303, 63, 60);
        frame.getContentPane().add(lblTeste32);
        
        JLabel lblTeste33 = new JLabel("New label");
        lblTeste33.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		piece = 1;
        		if(black==true)
        		{
        			switch(status)
        			{
        			case 1: p1.move(value, piece, black, lblBPawn1);
        					break;
        			case 2: p2.move(value, piece, black, lblBPawn2);
        					break;
        			case 3: p3.move(value, piece, black, lblBPawn3);
							break;
        			case 4: p4.move(value, piece, black, lblBPawn4);
							break;
        			case 5: p5.move(value, piece, black, lblBPawn5);
							break;
        			case 6: p6.move(value, piece, black, lblBPawn6);
							break;
        			case 7: p7.move(value, piece, black, lblBPawn7);
							break;
        			case 8: p8.move(value, piece, black, lblBPawn8);
							break;
        			case 17:br1.verifica(value, piece, black, lblBRook1,0,61);
        					break;
        			case 18:br2.verifica(value, piece, black, lblBRook2,0,61);
        					break;
        			}
        			
        		}
        			
        		else {
        			if(black==false)
        			{
        				switch(status)
        				{
        				case 9: wp1.move(value, piece, black, lblWPawn1);
        						break;
        				case 10:wp2.move(value, piece, black, lblWPawn2);
        						break;
        				case 11:wp3.move(value, piece, black, lblWPawn3);
        						break;
        				case 12:wp4.move(value, piece, black, lblWPawn4);
								break;
        				case 13:wp5.move(value, piece, black, lblWPawn5);
								break;
        				case 14:wp6.move(value, piece, black, lblWPawn6);
								break;
        				case 15:wp7.move(value, piece, black, lblWPawn7);
								break;
        				case 16:wp8.move(value, piece, black, lblWPawn8);
								break;
        				}
        			}
        		}
        	}
        });
        lblTeste33.setBounds(0, 61, 63, 60);
        frame.getContentPane().add(lblTeste33);
        
        JLabel lblTeste34 = new JLabel("New label");
        lblTeste34.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste34.setBounds(0, 0, 63, 60);
        frame.getContentPane().add(lblTeste34);
        
        JLabel lblTeste35 = new JLabel("New label");
        lblTeste35.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste35.setBounds(64, 0, 63, 60);
        frame.getContentPane().add(lblTeste35);
        
        JLabel lblTeste36 = new JLabel("New label");
        lblTeste36.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste36.setBounds(64, 61, 63, 60);
        frame.getContentPane().add(lblTeste36);
        
        JLabel lblTeste37 = new JLabel("New label");
        lblTeste37.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste37.setBounds(125, 0, 63, 60);
        frame.getContentPane().add(lblTeste37);
        
        JLabel lblTeste38 = new JLabel("New label");
        lblTeste38.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste38.setBounds(125, 61, 63, 60);
        frame.getContentPane().add(lblTeste38);
        
        JLabel lblTeste39 = new JLabel("New label");
        lblTeste39.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste39.setBounds(189, 0, 63, 60);
        frame.getContentPane().add(lblTeste39);
        
        JLabel lblTeste40 = new JLabel("New label");
        lblTeste40.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste40.setBounds(189, 61, 63, 60);
        frame.getContentPane().add(lblTeste40);
        
        JLabel lblTeste41 = new JLabel("New label");
        lblTeste41.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste41.setBounds(251, 0, 63, 60);
        frame.getContentPane().add(lblTeste41);
        
        JLabel lblTeste42 = new JLabel("New label");
        lblTeste42.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste42.setBounds(251, 61, 63, 60);
        frame.getContentPane().add(lblTeste42);
        
        JLabel lblTeste44 = new JLabel("New label");
        lblTeste44.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste44.setBounds(314, 0, 59, 60);
        frame.getContentPane().add(lblTeste44);
        
        JLabel lblTeste45 = new JLabel("New label");
        lblTeste45.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste45.setBounds(313, 61, 60, 60);
        frame.getContentPane().add(lblTeste45);
        
        JLabel lblTeste46 = new JLabel("New label");
        lblTeste46.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste46.setBounds(373, 0, 63, 60);
        frame.getContentPane().add(lblTeste46);
        
        JLabel lblTeste48 = new JLabel("New label");
        lblTeste48.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste48.setBounds(373, 61, 63, 60);
        frame.getContentPane().add(lblTeste48);
        
        JLabel lblTeste49 = new JLabel("New label");
        lblTeste49.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste49.setBounds(438, 0, 63, 60);
        frame.getContentPane().add(lblTeste49);
        
        JLabel lblTeste50 = new JLabel("New label");
        lblTeste50.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste50.setBounds(438, 61, 63, 60);
        frame.getContentPane().add(lblTeste50);
        
        JLabel lblTeste51 = new JLabel("New label");
        lblTeste51.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste51.setBounds(0, 359, 63, 62);
        frame.getContentPane().add(lblTeste51);
        
        JLabel lblTeste52 = new JLabel("New label");
        lblTeste52.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste52.setBounds(0, 420, 63, 60);
        frame.getContentPane().add(lblTeste52);
        
        JLabel lblTeste53 = new JLabel("New label");
        lblTeste53.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste53.setBounds(64, 359, 63, 62);
        frame.getContentPane().add(lblTeste53);
        
        JLabel lblTeste54 = new JLabel("New label");
        lblTeste54.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste54.setBounds(64, 420, 63, 60);
        frame.getContentPane().add(lblTeste54);
        
        JLabel lblTeste55 = new JLabel("New label");
        lblTeste55.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste55.setBounds(125, 359, 63, 62);
        frame.getContentPane().add(lblTeste55);
        
        JLabel lblTeste56 = new JLabel("New label");
        lblTeste56.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste56.setBounds(125, 422, 63, 58);
        frame.getContentPane().add(lblTeste56);
        
        JLabel lblTeste57 = new JLabel("New label");
        lblTeste57.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste57.setBounds(189, 359, 63, 62);
        frame.getContentPane().add(lblTeste57);
        
        JLabel lblTeste58 = new JLabel("New label");
        lblTeste58.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste58.setBounds(189, 420, 63, 60);
        frame.getContentPane().add(lblTeste58);
        
        JLabel lblTeste59 = new JLabel("New label");
        lblTeste59.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste59.setBounds(251, 359, 63, 62);
        frame.getContentPane().add(lblTeste59);
        
        JLabel lblTeste60 = new JLabel("New label");
        lblTeste60.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste60.setBounds(251, 420, 63, 60);
        frame.getContentPane().add(lblTeste60);
        
        JLabel lblTeste61 = new JLabel("New label");
        lblTeste61.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste61.setBounds(314, 359, 59, 62);
        frame.getContentPane().add(lblTeste61);
        
        JLabel lblTeste62 = new JLabel("New label");
        lblTeste62.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste62.setBounds(314, 422, 59, 58);
        frame.getContentPane().add(lblTeste62);
        
        JLabel lblTeste63 = new JLabel("New label");
        lblTeste63.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste63.setBounds(373, 360, 63, 61);
        frame.getContentPane().add(lblTeste63);
        
        JLabel lblTeste64 = new JLabel("New label");
        lblTeste64.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste64.setBounds(373, 420, 63, 60);
        frame.getContentPane().add(lblTeste64);
        
        JLabel lblTeste65 = new JLabel("New label");
        lblTeste65.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste65.setBounds(438, 359, 63, 62);
        frame.getContentPane().add(lblTeste65);
        
        JLabel lblTeste66 = new JLabel("New label");
        lblTeste66.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	}
        });
        lblTeste66.setBounds(438, 422, 63, 58);
        frame.getContentPane().add(lblTeste66);
       // teste.setY(120);
        
        
  
        
	}
}
