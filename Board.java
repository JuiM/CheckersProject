import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Board extends JFrame implements ActionListener{
	int[][] board;
	public Board() {
		board = new int[10][10];
		setBackground(Color.BLACK);
         addMouseListener(this);
         JButton resignButton = new JButton("Resign");
         resignButton.addActionListener(this);
         JButton newGameButton = new JButton("New Game");
         newGameButton.addActionListener(this);
        JLabel message = new JLabel("",JLabel.CENTER);
         message.setFont(new  Font("Serif", Font.BOLD, 14));
         message.setForeground(Color.green);
         // now I have to make a newGame() method
         newGame();
	}
	/**
       * Respond to user's click on one of the two buttons.
       */
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
