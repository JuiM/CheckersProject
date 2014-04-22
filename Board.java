public class Board {
	int[][] board;
	public Board() {
		board = new int[10][10];
		setBackground(Color.BLACK);
         addMouseListener(this);
         resignButton = new JButton("Resign");
         resignButton.addActionListener(this);
         newGameButton = new JButton("New Game");
         newGameButton.addActionListener(this);
         message = new JLabel("",JLabel.CENTER);
         message.setFont(new  Font("Serif", Font.BOLD, 14));
         message.setForeground(Color.green);
	}
}
