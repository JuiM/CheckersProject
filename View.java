import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;


public class View extends JFrame implements MouseListener{

	public View() {
		super("");
		setSize(500,530);
		setVisible(true);
		// added on stuff:
		setBackground(new Color(0,150,0));  // Dark green background.
      
      /* Create the components and add them to the applet. */
      
      Board board = new Board();  
      add(board);
      
      /* Set the position and size of each component by calling
       its setBounds() method. */
      
      board.setBounds(20,20,164,164); // size should be 164-by-164, right? for 8-by-8?
	}
	public void paint(Graphics g){
		// are we going to have graphics g in the parameters of each of these
		paintBoard();
		paintCheckers();
	}
	 /**
       * Respond to a user click on the board. Find the row and column that the user 
       * clicked and call clickSquare() to handle it.
       */
      public void mousePressed(MouseEvent evt) {
        // what do we need when the mouse is pressed
        //  get the row and col and then click it
               //clickSquare(row,col); should I have a 
               //clickSquare() method?
         }
      }
      public void mouseReleased(MouseEvent evt) {game.clicked(x,y); }
       
      public void mouseClicked(MouseEvent evt) { }
      public void mouseEntered(MouseEvent evt) { }
      public void mouseExited(MouseEvent evt) { }
      // should I have a setUpGame() method?
      //where we can set up the black and red 
}
