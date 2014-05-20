import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;

import javax.swing.JFrame;


public class View extends JFrame implements MouseListener{

	Board board;
	
	public View() {
		super("Checkers");
		setSize(500,530);
		setVisible(true);
		setBackground(new Color(0,150,0));  // Dark green background.
		board = new Board();  
	}
		// keeps the game constantly incrementing the turn, drawing the pieces and board. It occurs with every iteration.
	/*public void loop (){
	while (true){
		paint(Graphics g); 
		checkClick(); // or in this case I think onClick() ??
	}	
	}*/
	public void paint(Graphics g){
		// are we going to have graphics g in the parameters of each of these
		paintBoard(g);
		paintPieces(g);
	}

	public void paintPieces(Graphics g) {
		for(int x=0; x<10 ;x++){
			for(int y=0; y< 10; y++){
				if(board.isRed(x,y)){
					g.setColor(Color.RED);
					g.fillOval(x*50 +5, y*50 +5, 40, 40);
				}
				if(board.isBlack(x,y)){
					g.setColor(Color.black);
					g.fillOval(x*50 +5, y*50 +5, 40, 40);
				}
			}
		}

	}

	public void paintBoard(Graphics g) {
			setBackground(Color.WHITE);

		// Make the white squares
		for(int x =0; x< 10; x++){
			for(int y=0;y <10; y++){
				// Make the background of the square
				if(board.isWhiteSquare(x,y)){
					g.fillRect(x*50,y*50,50,50);
				}
			}
		}
	}
	private void drawActive(Graphics g) {
		for(int x=0; x<10 ; x++){
			for(int y=0;y<10;y++){		
				if(board.isActive(x,y)){
					g.setColor(Color.YELLOW);// this will have the effect of "higlighting" your possible move locations in yellow
					g.fillRect(x*50, y*50, 50, 50);
				}
			}
		}
	}
	// these methods will not do anything and will never be used. Only mouseClicked is ever used
	public void mousePressed(MouseEvent evt) {}
	
	public void mouseReleased(MouseEvent evt) { }

	public void mouseClicked(MouseEvent evt) { 
		board.onClick(evt.getX(), evt.getY());
	}
	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	
}
