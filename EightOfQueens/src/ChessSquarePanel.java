import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ChessSquarePanel extends JPanel {
	private Color background;
	private boolean flag;
	private static final int FSIZE =20;
	
	public ChessSquarePanel(){
		background = Color.DARK_GRAY;
		flag= false;
	}	
	
	public ChessSquarePanel(Color c, boolean f){
		background = c;
		flag= f;
	}
	
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.setFont(new Font("TimesRoman", Font.PLAIN, FSIZE));
		 this.setBackground(background);
		 g.setColor(Color.CYAN);
		 /*//CODe from pg 426 in Java Methods
		  * int w = getWidth(); int h = getHeight(); g.setColor(Color.RED); g.drawRect(w/4, h/4, w/2, h/2);
		  */
		 if(flag) {
	            int x = (this.getWidth() / 2) - FSIZE/4; // - letter.length()/2;
	            int y = (this.getHeight() / 2) + FSIZE/4;
	            g.drawString("Q", x, y);
		 }
	 }
	 public static void main(String [] args) {
		 
	 }
}
