package view_sys;

public class ClassData implements Cacheable{

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

	@Override
	public String toString() {
		return "ClassData [classID=" + classID + ", available=" + available + ", startingHour=" + startingHour
				+ ", endingHour=" + endingHour + ", isLab=" + isLab + ", courseName=" + courseName + "]";
	}

	@Override
	public boolean isExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + classID;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + endingHour;
		result = prime * result + (isLab ? 1231 : 1237);
		result = prime * result + startingHour;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		ClassData other = (ClassData)obj;
		if(this.classID == other.classID) {
			if(this.startingHour == other.startingHour) {
				if(this.endingHour == other.endingHour)
					return true;
			}
			else
				return false;
		}
		else
			return false;
		
		return false;
	}
	
	 
}
