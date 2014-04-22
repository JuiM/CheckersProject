import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class View extends JFrame{

	public View() {
		super("");
		setSize(500,530);
		setVisible(true);
	}
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 530);
	}
}
