import java.awt.*;
import javax.swing.*;
public class Board {
	int[][] board;
	Graphics a;
	// the array holds either a zero, one, or two. If it holds a zero, there is no piece there.
	// if it holds a one, it has a red piece. 
	// if it holds a two, it has a black piece.
	int activeX;
	int activeY;
	int current =1;

	public Board() {
		board = new int[10][10];
		//setBackground(Color.BLACK);
	} 
	
	public void onClick(int x, int y) {
		if(x>= 0 && y >= 0){
			//actual position that you clicked on
			int newX = x / 50;
			int newY = y / 50;
			// if it is an active square, than move it
			if(isActive(newX, newY)){
				move(activeX, activeY, newX, newY);
				current = (current == 2) ? 1 : 2;
			}
			activeX = x / 50;
			activeY = y / 50 ; 
		}

	}
	public boolean isEmpty(int x, int y){
		if(board[x][y] == 0){
			return true;
		}
		else
			return false;
	}
	public boolean isWhiteSquare(int x, int y){
		if(x%2 == y%2)
			return true;
		else
			return false;
	}

	public boolean isRed(int x, int y){
		return board[x][y] == 1;
	}
	public boolean isBlack(int x, int y){
		return board[x][y] == 2;
	}
	
	public boolean isActive(int x, int y){
		//active means is you can jump to it 
		if(!isEmpty(x,y))
			return false;
		if(isEmpty(x,y) && isRed(activeX,activeY)){
			if(!isWhiteSquare(activeX, activeY)){
				return false;
			}
			// to make sure goes on the right turn
			if(board[activeX][activeY] != current){
				return false;
			}
			if(x + 1 == activeX && y+1 == activeY){
				return true;
			}
			//single jump
			if( x+2 == activeX && y+2 == activeY && isBlack(x+1, y+1)){
				return true;
			}
			if(x - 1 == activeX && y+1 == activeY){
				return true;
			}
			//single jump in other direction
			if(x - 2 == activeX && y+2 == activeY && isBlack(x-1,y+1)){
				return true;
			}
			else
				return false;
		}
		if(isEmpty(x,y) && isBlack(activeX,activeY)){
			if(!isWhiteSquare(activeX, activeY)){
				return false;
			}
			// to make sure goes on the right turn 
			if(board[activeX][activeY] != current){
				return false;
			}
			if(x - 1 == activeX && y-1 == activeY){
				return true;
			}
			//double jump 
			if(x-2 == activeX && y-2 == activeY && isRed(x-1,y-1)){
				return true;
			}
			if(x + 1 == activeX && y - 1 == activeY){
				return true;
			}
			//double jump in other direction
			if(x+2 == activeX && y-2 == activeY && isRed(x+1, y-1)){
				return true;
			}
			else
				return false;
		}
		return false;
	}


	public void move(int x1, int y1, int x2, int y2){
		View view = new View();
		int piece = board[x1][y1];
		board[x1][y1] = 0;
		a.setColor((piece == 1 ) ? Color.RED : Color.BLACK);
		set(x1 * 50 +25,  y1 *50 +25);
		int y = y1 * 50 +25;
		for(int x = x1*50 +25; x !=x2* 50 +25; x= x+ ((x1<x2) ? 1 : -1)){
			y = y+((y1 < y2) ? 1 : -1);
			set(x,y);
		}
		//Draw the board
		view.paintBoard(a);// sets up a basic board
		view.paintPieces(a);
		board [x2][y2] = piece;
		view.paintBoard(a);// the method that sets up a basic board
		view.paintPieces(a);
		// if you single jumped over a piece, then take it over
		if(Math.abs(x2-x1) == 2){
			board[(x2+x1)/2][(y2 + y1) /2 ] =0;
		}
	}
/*	public boolean isEnded(){
		int countBlack =0;
		int countRed = 0;
		for(int row = 0; row < board.length(); row++){
			for(int col = 0; col < board(row).length; col++){
				if
			}
		}
	}
	*/
}
