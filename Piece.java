public class Piece {
// should be able to distinguish between red and black- the team
// also should have the clickSquare(row,col) method here?
// it will highlight the available move locations, even the ones
//with double jump,not triple jump
// it has a row and col location
// it has a move() method
	public Piece() {
	
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
		
	}
}
