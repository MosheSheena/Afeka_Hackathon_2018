package view_sys;

import java.awt.Font;
import java.awt.Graphics;

public class DrawStringOffset extends DrawString {

	public DrawStringOffset(String text, int fontSize, boolean isTitle) {
		super(text, fontSize, isTitle);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Font f = null;
		
		if(this.isTitle)
			 f = new Font("Tahoma", Font.BOLD, FONT_SIZE_TITLE);
		else
			 f = new Font("Tahoma", Font.BOLD, FONT_SIZE_BODY);
		
		g.setFont(f);
		g.drawString(this.text, xPos + offset, yPos);
	}

}
