import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;
public class Board extends JFrame{
	int[][] board;
	// should I create an int player? to tell whether black/ red..(or string)
	public Board() {
		board = new int[10][10];
		setBackground(Color.BLACK);
         // now I have to make a newGame() method
         /*  addMouseListener(this);
         JButton resignButton = new JButton("Resign");
         resignButton.addActionListener(this);
         JButton newGameButton = new JButton("New Game");
         newGameButton.addActionListener(this);
        JLabel message = new JLabel("",JLabel.CENTER);
         message.setFont(new  Font("Serif", Font.BOLD, 14));
         message.setForeground(Color.green);
	}
	*
       * Respond to user's click on one of the two buttons.
       *
      public void actionPerformed(ActionEvent evt) {
         Object src = evt.getSource();
         if (src == newGameButton)
            newGame();
         else if (src == resignButton)
            resign();
      }
      // now have a resign() method
      // and a newGame() method
}
          *
          */
         newGame();
	} 
      //paint the board!
      public void paintBoard(Graphics g)
      {
      	/**
       * Draw a checkerboard pattern in gray and lightGray. Should this also be able to highlight the legal moves?
       */   
         /* Draw a two-pixel black border around the edges of the canvas. */
         
         g.setColor(Color.black);
         g.drawRect(0,0,getSize().width-1,getSize().height-1);
         g.drawRect(1,1,getSize().width-3,getSize().height-3);
         
         /* Draw the squares of the checkerboard
          *what about drawing the checkers?
          *aren't they part of the board.. but we have a piece class
          */
         
         for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
               if ( row % 2 == col % 2 )
                  g.setColor(Color.LIGHT_GRAY);
               else
                  g.setColor(Color.GRAY);
               g.fillRect(2 + col*20, 2 + row*20, 20, 20);
       
            }
         }
      }
      /**
       * Set up the board with checkers in position for the beginning
       * of a game.  At the start of the game,
       * all squares in the first three rows contain black squares
       * and all such squares in the last three rows contain red squares.
       */
     public void setUpGame() {
         for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
               if ( row % 2 == col % 2 ) {
                  if (row < 3)
                     board[row][col] = 3;
                  else if (row > 4)
                     board[row][col] = 1;
                  else
                     board[row][col] = 0;
               }
               else {
                  board[row][col] = 0;
               }
            }
         }
      }  // end setUpGame()
}

// Board: reset, getPiece(x,y), click(x,y), incrementScore(), gameOver?, 
