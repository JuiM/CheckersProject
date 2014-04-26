public class Piece {
//having kings or not? different paint(), but still a piece...	
// should be able to distinguish between red and black- the team
// also should have the clickSquare(row,col) method here?
// it will highlight the available move locations, even the ones
//with double jump,not triple jump
// it has a row and col location
// it has a move() method
	public Piece() {
	int[][] board = new int[8][8];	
	setUpGame();
	}
	
      /**
       * This is called by mousePressed() when a player clicks on the
       * square in the specified row and col.  It has already been checked
       * that a game is, in fact, in progress.
       */
	public void clickSquare(row,col){
		/* If the player clicked on one of the pieces that the player
          can move, mark this row and col as selected and return. */
          
          /* If no piece has been selected to be moved, the user must first
          select a piece. */
          
          /* If the user clicked on a square where the selected piece can be
          legally moved, then make the move and return. */
          // we can use the other methods in this one
	}
	//should we have a getPossibleMoves() method?
	// or a canJump() or canMove() method?
	public void move(row,col){
		//has to contain the list of jumps, etc.
	}
	// I guess the set-up will be here... adding the checkers to the board
      // now need to paint the actual checkers
      public void paintCheckers( Graphics g)
      {
      	/* Draw the squares of the checkerboard and the checkers. */
         
         for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
               if ( row % 2 == col % 2 )
                  g.setColor(Color.LIGHT_GRAY);
               else
                  g.setColor(Color.GRAY);
               g.fillRect(2 + col*20, 2 + row*20, 20, 20);
               if(// red player)
               {
                  g.setColor(Color.RED);
                  g.fillOval(4 + col*20, 4 + row*20, 15, 15);
               }
               if(//black player)
               {
                  g.setColor(Color.BLACK);
                  g.fillOval(4 + col*20, 4 + row*20, 15, 15);
               }
               // kings?
               }
         }
         
      }
}
