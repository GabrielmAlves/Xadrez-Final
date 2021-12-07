package controller;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.Color;

import screens.Board;
public class Controller {

	Players p = new Players(); 
	
	public boolean verifica()
	{	
		if(p.getPlayer1()==null)
		{
			JOptionPane.showMessageDialog(null, "Player 1 must have a name!");
			return false;
		}
		
		if(p.getPlayer2()==null)
		{
			JOptionPane.showMessageDialog(null, "Player 2 must have a name!");
			return false;
		}
		return true;
	}
		
	public int borda(int value,boolean color,int piece, JLabel bpiece,int ind)
	{
		if(color==true)
		{
			for(int x=0;x<438;x=+60)
			{
				for(int y=0;y<420;y=+60)
				{
					if(bpiece.getX()+438==438&&bpiece.getY()+420==420)
					{
						if(piece==1&&ind==0)//verifica se tem uma peça preta na label
						{
							
						}else {
							if(piece==1&&ind==1)//verifica se tem uma peça branca na label e faz o kill
							{
								
							}
						}
					}
				}
			}
		}
		return piece;
	}
}
