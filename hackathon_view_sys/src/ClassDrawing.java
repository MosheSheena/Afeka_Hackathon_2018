package view_sys;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class ClassDrawing extends JPanel{

	private static final long serialVersionUID = 1L;
	private Timer theTimer;
	private String classNum;
	private String courseName;
	private boolean isAvailable;
	private int time; // time is both for available and not available and is expressed in hours
	private final String AVAILABLE_TEXT_FREE = "Available for: ";
	private final String AVAILABLE_TEXT_TAKEN = "Available at: ";
	private final int NUM_ROWS = 3;
	private final int NUM_COLS = 1;
	private final int timerDelay = 3000;
	private final int timerFrequency = 1000;
	
	public ClassDrawing(ClassData c) {
		theTimer = new Timer();
		theTimer.schedule(new MyTimerTask(), timerDelay, timerFrequency);
		decomposeClassData(c);
		
		//graphics
		this.setSize(160, 150);
		//this.setLocation(null);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(new DrawStringOffset(this.classNum, DrawString.FONT_SIZE_TITLE, true));
		
		if(isAvailable) {
			this.setBackground(new Color(102,204,51));
			this.add(new DrawString(this.AVAILABLE_TEXT_FREE, DrawString.FONT_SIZE_BODY, false));
		}
		else {
			this.setBackground(new Color(204,0,0));
			this.add(new DrawString(this.courseName, DrawString.FONT_SIZE_BODY, false));
			this.add(new DrawString(this.AVAILABLE_TEXT_TAKEN, DrawString.FONT_SIZE_BODY, false));
		}
		
		this.add(new DrawStringOffset(this.time + "", DrawString.FONT_SIZE_BODY, false));
		
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int hour) {
		this.time = hour;
	}
	
	public JLabel createClassNumLabel(int classNum) {
		return new JLabel(classNum + "");
	}
	
	public void decomposeClassData(ClassData c) {
		this.classNum = c.getClassID() + "";
		this.courseName = c.getCourseName();
		this.isAvailable = c.isAvailable();
		
		Calendar cal = Calendar.getInstance();
		int currentHour = cal.get(Calendar.HOUR);
		int currentMinuts = cal.get(Calendar.MINUTE);
		
		if(isAvailable) {
			this.time = c.getEndingHour() - currentHour;
		}
		else {
			this.time = c.getEndingHour();
		}
	}

	class MyTimerTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			repaint();
		}
		
	}
}
