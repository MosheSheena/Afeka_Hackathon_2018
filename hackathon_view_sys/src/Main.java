package view_sys;
import java.util.Set;


public class Main {
	
	public static void main(String args[]) {
		
		Server s = new Server();
		
		Set<ClassData> classes = s.fetchData("/Users/moshesheena/Downloads/0101.csv", ",");
		
		for (ClassData classData : classes) {
			System.out.println(classData);
		}
	}

}
