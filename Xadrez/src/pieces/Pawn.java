package pieces;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import screens.Board;

public class Pawn {
	
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public boolean move(int value, int piece, boolean color, JLabel bpawn)
	{
		if(color==true)
		{
			if(value==1&&piece==1)
    		{
    			value = 0;
    			if(bpawn.getX()==0)
    			{
				bpawn.setBounds(0, getY()+60, 63, 60);
				setY(getY()+60);
				//System.out.printf("\nY = %d", getY());
				//System.out.printf("\nValor = %d\n", value);
    			}else {
    				if(bpawn.getX()==64)
    				{
    					bpawn.setBounds(64, getY()+60, 63, 60);
    					setY(getY()+60);
    					//System.out.printf("\nY = %d", getY());
    					//System.out.printf("\nValor = %d\n", value);
    				}else {
    					if(bpawn.getX()==125)
    					{
    						bpawn.setBounds(125, getY()+60, 63, 60);
    						setY(getY()+60);
    						//System.out.printf("\nY = %d", getY());
    						//System.out.printf("\nValor = %d\n", value);
    					}else {
    						if(bpawn.getX()==189)
    						{
    							bpawn.setBounds(189, getY()+60, 63, 60);
    							setY(getY()+60);
    							//System.out.printf("\nY = %d", getY());
    							//System.out.printf("\nValor = %d\n", value);
    						}else {
    							if(bpawn.getX()==251)
    							{
    								bpawn.setBounds(251, getY()+60, 63, 60);
    								setY(getY()+60);
    								//System.out.printf("\nY = %d", getY());
    								//System.out.printf("\nValor = %d\n", value);
    							}else {
    								if(bpawn.getX()==314)
    								{
    									bpawn.setBounds(314, getY()+60, 63, 60);
    									setY(getY()+60);
    									//System.out.printf("\nY = %d", getY());
    									//System.out.printf("\nValor = %d\n", value);
    								}else {
    									if(bpawn.getX()==373)
    									{
    										bpawn.setBounds(373, getY()+60, 63, 60);
    										setY(getY()+60);
    										//System.out.printf("\nY = %d", getY());
    										//System.out.printf("\nValor = %d\n", value);
    									}else {
    										if(bpawn.getX()==438)
    										{
    											bpawn.setBounds(438, getY()+60, 63, 60);
    											setY(getY()+60);
    											//System.out.printf("\nY = %d", getY());
    											//System.out.printf("\nValor = %d\n", value);
    										}
    									}
    								}
    							}
    						}
    					}
    				}
    			}
    					
    				
    		
    		}else {
    			if(value==0&&piece==1)
    			{
    				JOptionPane.showMessageDialog(null, "You must select the piece!");
    			}
    		}
		}else {
			if(color==false)
			{
				if(value==1&&piece==1)
				{
					value = 0;
					//piece = 0;
	    			if(bpawn.getX()==0)
	    			{
	    				
	    				int y= getY()-60;
	    				//System.out.printf("%d",y);
	    				
					bpawn.setBounds(0,y, 63, 60);
					setY(y);
					//System.out.printf("\nYwhite = %d", getY());
					//System.out.printf("\nValorwhite = %d\n", value);
	    			}else {
	    				if(bpawn.getX()==62)
	    				{
	    					bpawn.setBounds(62, getY()-60, 63, 60);
	    					setY(getY()-60);
	    					//System.out.printf("\nY = %d", getY());
	    					//System.out.printf("\nValor = %d\n", value);
	    				}else {
	    					if(bpawn.getX()==125)
	    					{
	    						bpawn.setBounds(125, getY()-60, 63, 60);
		    					setY(getY()-60);
		    					//System.out.printf("\nY = %d", getY());
		    					//System.out.printf("\nValor = %d\n", value);
	    					}else {
	    						if(bpawn.getX()==189)
	    						{
	    							bpawn.setBounds(189, getY()-60, 63, 60);
			    					setY(getY()-60);
			    					//System.out.printf("\nY = %d", getY());
			    					//System.out.printf("\nValor = %d\n", value);

	    						}else {
	    							if(bpawn.getX()==251)
	    							{
	    								bpawn.setBounds(251, getY()-60, 63, 60);
				    					setY(getY()-60);
				    					//System.out.printf("\nY = %d", getY());
				    					//System.out.printf("\nValor = %d\n", value);
	    							}else {
	    								if(bpawn.getX()==316)
	    								{
	    									bpawn.setBounds(316, getY()-60, 63, 60);
					    					setY(getY()-60);
					    					//System.out.printf("\nY = %d", getY());
					    					//System.out.printf("\nValor = %d\n", value);
	    								}else {
	    									if(bpawn.getX()==373)
	    									{
	    										bpawn.setBounds(373, getY()-60, 63, 60);
						    					setY(getY()-60);
						    					//System.out.printf("\nY = %d", getY());
						    					//System.out.printf("\nValor = %d\n", value);
	    									}else {
	    										if(bpawn.getX()==438)
	    										{
	    											bpawn.setBounds(438, getY()-60, 63, 60);
							    					setY(getY()-60);
							    					//System.out.printf("\nY = %d", getY());
							    					//System.out.printf("\nValor = %d\n", value);
	    										}
	    									}
	    								}
	    							}
	    						}
	    					}
	    				}
	    			}
				}
			}
		}
		return true;
	}
	
	
}
