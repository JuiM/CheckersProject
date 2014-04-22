
import java.awt.Color;
public class Board extends JFrame {
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
	}
}
