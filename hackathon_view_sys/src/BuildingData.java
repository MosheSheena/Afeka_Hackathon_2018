package view_system;

import java.util.Set;

public class BuildingData {
	
	private int numFloors;
	private Set<FloorData> floors;
	
	public BuildingData(int numFloors, Set<FloorData> floors) {
		super();
		this.numFloors = numFloors;
		this.floors = floors;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public Set<FloorData> getFloors() {
		return floors;
	}

	public void setFloors(Set<FloorData> floors) {
		this.floors = floors;
	}
	
}
