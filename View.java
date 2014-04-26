import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;


public class View extends JFrame implements MouseListener{

	public View() {
		super("");
		setSize(500,530);
		setVisible(true);
	}
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 530);
	}
	 /**
       * Respond to a user click on the board.  If no game is in progress, show 
       * an error message.  Otherwise, find the row and column that the user 
       * clicked and call clickSquare() to handle it.
       */
      public void mousePressed(MouseEvent evt) {
      	// should I create a gameInProgress method??
         if (gameInProgress == false)
            message.setText("Click \"New Game\" to start a new game.");
        // what else do we need when the mouse is pressed
        // else get the row and col and then click it
         else {
            int col = (evt.getX() - 2) / 20;
            int row = (evt.getY() - 2) / 20;
            if (col >= 0 && col < 8 && row >= 0 && row < 8)
               //clickSquare(row,col); should I have a 
               //clickSquare() method?
         }
      }
      public void mouseReleased(MouseEvent evt) { }
      // Do we still need the game.clicked(x,y) thing?
      public void mouseClicked(MouseEvent evt) { }
      public void mouseEntered(MouseEvent evt) { }
      public void mouseExited(MouseEvent evt) { }
      // should I have a setUpGame() method?
      //where we can set up the black and red 
}
