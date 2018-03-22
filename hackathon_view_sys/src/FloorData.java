package view_system;

import java.util.Set;

public class FloorData {

	private int numClassRooms;
	private Set<ClassData> classes;
	
	public FloorData(int numClassRooms, Set<ClassData> classes) {
		super();
		this.numClassRooms = numClassRooms;
		this.classes = classes;
	}

	public int getNumClassRooms() {
		return numClassRooms;
	}

	public void setNumClassRooms(int numClassRooms) {
		this.numClassRooms = numClassRooms;
	}

	public Set<ClassData> getClasses() {
		return classes;
	}

	public void setClasses(Set<ClassData> classes) {
		this.classes = classes;
	}
	
	
}
