package pieces;


import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import screens.Board;

public class Rook {
	
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
	
	
	public int move_vertical(int value, int piece, boolean color, JLabel bpawn) //metodo que anda pra baixo na vertical
	{
		
		if(color==true)
		{
			if(value==1&&piece==1)
			{
				value = 0;
				if(bpawn.getY()==0)
				{
					bpawn.setBounds(0, getY()+60, 63, 60);
					setY(getY()+60);
					//System.out.printf("\nYtorreb = %d", getY());
					//System.out.printf("\nValor torreb = %d\n", value);
				}else {
					if(bpawn.getY()==60)
					{
						bpawn.setBounds(0, getY()+60, 63, 60);
						setY(getY()+60);
						//System.out.printf("\nYtorreb = %d", getY());
						//System.out.printf("\nValor torreb = %d\n", value);
					}else {
						if(bpawn.getY()==120)
						{
							bpawn.setBounds(0, getY()+60, 63, 60);
							setY(getY()+60);
							//System.out.printf("\nYtorreb = %d", getY());
							//System.out.printf("\nValor torreb = %d\n", value);
						}else {
							if(bpawn.getY()==182)
							{
								bpawn.setBounds(0, getY()+60, 63, 60);
								setY(getY()+60);
								//System.out.printf("\nYtorreb = %d", getY());
								//System.out.printf("\nValor torreb = %d\n", value);
							}else {
								if(bpawn.getY()==243)
								{
									bpawn.setBounds(0, getY()+60, 63, 60);
									setY(getY()+60);
									//System.out.printf("\nYtorreb = %d", getY());
									//System.out.printf("\nValor torreb = %d\n", value);
								}else {
									if(bpawn.getY()==303)
									{
										bpawn.setBounds(0, getY()+60, 63, 60);
										setY(getY()+60);
										//System.out.printf("\nYtorreb = %d", getY());
										//System.out.printf("\nValor torreb = %d\n", value);
									}
								}
							}
						}
					}
				}
			}
		}
		return piece;
	}
	
	
	public int move_horizontal(int value, int piece, boolean color, JLabel bpawn) //move a torre pra direita na horizontal
	{
		if(color==true)
		{
			if(value==1&&piece==1)
			{
				value = 0;
				piece=0;
				if(bpawn.getX()==0)
				{
					bpawn.setBounds(getX()+64, getY()+120, 63, 60);
					setX(getX()+64);
					//System.out.printf("\nXTorreb = %d", getX());
				//	System.out.printf("\nValor torreb = %d\n", value);
				}else {
					if(bpawn.getX()==64)
					{
						bpawn.setBounds(getX()+61, getY()+120, 63, 60);
						setX(getX()+61);
						//System.out.printf("\nXTorreb = %d", getX());
						//System.out.printf("\nValor torreb = %d\n", value);
					}else {
						if(bpawn.getY()==125)
						{
							bpawn.setBounds(getX()+64, getY()+120, 63, 60);
							setX(getX()+64);
							//System.out.printf("\nXTorreb = %d", getX());
							//System.out.printf("\nValor torreb = %d\n", value);
						}else {
							if(bpawn.getY()==189)
							{
								bpawn.setBounds(getX()+64, getY()+120, 63, 60);
								setX(getX()+64);
								//System.out.printf("\nYtorreb = %d", getX());
								//System.out.printf("\nValor torreb = %d\n", value);
							}else {
								if(bpawn.getY()==251)
								{
									bpawn.setBounds(getX()+62, getY()+120, 63, 60);
									setX(getX()+62);
									//System.out.printf("\nXTorreb = %d", getX());
									//System.out.printf("\nValor torreb = %d\n", value);
								}else {
									if(bpawn.getY()==317)
									{
										bpawn.setBounds(getX()+63, getY()+120, 63, 60);
										setX(getX()+62);
										//System.out.printf("\nXtorreb = %d", getX());
										//System.out.printf("\nValor torreb = %d\n", value);
									}else {
										if(bpawn.getY()==373)
										{
											bpawn.setBounds(getX()+63, getY()+120, 63, 60);
											setX(getX()+63);
											//System.out.printf("\nXtorreb = %d", getX());
											//System.out.printf("\nValor torreb = %d\n", value);
										}else {
											if(bpawn.getY()==438)
											{
												bpawn.setBounds(getX()+65, getY()+120, 63, 60);
												setX(getX()+65);
												//System.out.printf("\nXtorreb = %d", getX());
												//System.out.printf("\nValor torreb = %d\n", value);
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
		return piece;
	}
	
	
	
	
	public int move_tras_vertical(int value, int piece, boolean color, JLabel bpawn) //metodo que anda pra cima na vertical
	{
		
		if(color==true)
		{
			if(value==1&&piece==1)
			{
				value = 0;
				if(bpawn.getY()==0)
				{
					bpawn.setBounds(0, getY()+0, 63, 60);
					setY(getY()+0);
					System.out.printf("\nYtorreb = %d", getY());
					System.out.printf("\nValor torreb = %d\n", value);
				}else {
					if(bpawn.getY()==60)
					{
						bpawn.setBounds(0, getY()-60, 63, 60);
						setY(getY()-60);
						System.out.printf("\nYtorreb = %d", getY());
						System.out.printf("\nValor torreb = %d\n", value);
					}else {
						if(bpawn.getY()==120)
						{
							bpawn.setBounds(0, getY()-60, 63, 60);
							setY(getY()-60);
							System.out.printf("\nYtorreb = %d", getY());
							System.out.printf("\nValor torreb = %d\n", value);
						}else {
							if(bpawn.getY()==182)
							{
								bpawn.setBounds(0, getY()-60, 63, 60);
								setY(getY()-60);
								System.out.printf("\nYtorreb = %d", getY());
								System.out.printf("\nValor torreb = %d\n", value);
							}else {
								if(bpawn.getY()==243)
								{
									bpawn.setBounds(0, getY()-60, 63, 60);
									setY(getY()-60);
									System.out.printf("\nYtorreb = %d", getY());
									System.out.printf("\nValor torreb = %d\n", value);
								}else {
									if(bpawn.getY()==303)
									{
										bpawn.setBounds(0, getY()-60, 63, 60);
										setY(getY()-60);
										System.out.printf("\nYtorreb = %d", getY());
										System.out.printf("\nValor torreb = %d\n", value);
									}
								}
							}
						}
					}
				}
			}
		}
		return piece;
	}
	
	
	//fazer voltar pra esquerda na horizontal
	//fazer os mesmos movimentos para as torres brancas
	
	public int verifica(int value, int piece, boolean color, JLabel bpiece, int x,int y)
	{
		if(bpiece.getY()==0 && bpiece.getX()==0) //canto superior esquerdo
		{
			if(y>bpiece.getY()) //pra ver se desce na vertical
			{
				move_vertical(value,piece,color,bpiece);
			}else {
				if(x>bpiece.getX())//pra ver se anda pra direita na horizontal
				{
					move_horizontal(value,piece,color,bpiece);
				}
			}
			//só pode movimentar na vertical para baixo
			//horizontal pra direita
		}else {
			if(bpiece.getX()==438&&bpiece.getY()==0)//canto superior direito
			{
				if(y>bpiece.getY()) //pra ver se desce na vertical
				{
					move_vertical(value,piece,color,bpiece);
				}else {
					if(x<bpiece.getX())//pra ver se anda pra direita na horizontal
					{
						//move_horizontal(value,piece,color,bpawn); aqui anda pra esquerda (fzr função)
					}
				}
				//só pode movimentar na vertical para baixo
				//horizontal pra esquerda
			}else {
				if(bpiece.getX()>0&&bpiece.getX()<438&&bpiece.getY()>0)//tabuleiro menos a fileira da esquerda e da direita
				{													//pra saber se ta nos cantos e se pode subir na vertical (y>0)
					
					//pode movimentar na vertical e na horizontal para qualquer lado
				}//else {
//					if(bpawn.getX()==0&&bpawn.getY()>0)//pra ver se desce na vertical
//					{
//						
//					}
//				}
			}
		}
		return piece;
	}
}
