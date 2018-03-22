package view_sys;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawString extends JPanel {
	
	public String text;
	private int fontSize;
	protected boolean isTitle;
	final private String fontType = "Tahoma";
	final static int FONT_SIZE_TITLE = 14;
	final static int FONT_SIZE_BODY = 14;
	final int xPos = 20;
	final int yPos = 30;
	final int offset = 35;
	
	public DrawString(String text, int fontSize, boolean isTitle) {
		this.text = text;
		this.fontSize = fontSize;
		this.isTitle = isTitle;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Font f = null;
		
		if(this.isTitle)
			 f = new Font("Tahoma", Font.BOLD, FONT_SIZE_TITLE);
		else
			 f = new Font("Tahoma", Font.BOLD, FONT_SIZE_BODY);
		
		g.setFont(f);
		g.drawString(this.text, xPos, yPos);
	}

}
