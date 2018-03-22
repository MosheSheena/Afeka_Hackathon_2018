package view_system;

public class ClassData {

	private int classID;
	private boolean available;
	private int startingHour;
	private int endingHour;
	private boolean isLab;
	private String courseName;
	final static int NUM_FIELDS = 6;
	final static String AVAILABLE = "0";
	final static String NOT_AVAILABLE = "1";
	
	public ClassData(int classID, boolean available, int startingHour, int endingHour, boolean isLab, String courseName) {
		setClassID(classID);
		setAvailable(available);
		setStartingHour(startingHour);
		setEndingHour(endingHour);
		setLab(isLab);
		setCourseName(courseName);
	}
	
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getStartingHour() {
		return startingHour;
	}
	public void setStartingHour(int startingHour) {
		this.startingHour = startingHour;
	}
	public int getEndingHour() {
		return endingHour;
	}
	public void setEndingHour(int endingHour) {
		this.endingHour = endingHour;
	}
	public boolean isLab() {
		return isLab;
	}
	public void setLab(boolean isLab) {
		this.isLab = isLab;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	 
}
