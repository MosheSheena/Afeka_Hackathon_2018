package view_system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Server {

	private String csvFile = "/Users/mkyong/csv/country.csv";

	private String cvsSplitBy = ",";

	public Server(String csvFile, String cvsSplitBy) {
		setCsvFile(csvFile);
		setCsvSplitBy(cvsSplitBy);
	}

	public String getCsvFile() {
		return csvFile;
	}

	public void setCsvFile(String csvFile) {
		this.csvFile = csvFile;
	}

	public String getCvsSplitBy() {
		return cvsSplitBy;
	}

	public void setCsvSplitBy(String cvsSplitBy) {
		this.cvsSplitBy = cvsSplitBy;
	}

	public Set<ClassData> fetchDataFromCsv(String fileName, String delimiter) {
		
		Set<ClassData> classes = new HashSet<>();
		String line = "";
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			
			while((line = br.readLine()) != null) {
				String[] data = line.split(delimiter);
				
				classes.add(createClassDataFromLine(data));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return classes;
	}
	
	public ClassData createClassDataFromLine(String[] fields) {
		int classID;
		boolean available;
		int startingHour;
		int endingHour;
		boolean isLab;
		String courseName;
		
		classID = Integer.parseInt(fields[3]);
		
		if(fields[6].equals(ClassData.AVAILABLE))
			available = true;
		else
			available = false;
		
		startingHour = Integer.parseInt(fields[4]);
		endingHour = Integer.parseInt(fields[5]);
		
		if(fields[2].equals(ClassData.AVAILABLE))
			isLab = true;
		else
			isLab = false;
		
		courseName = fields[7];
		
		return new ClassData(classID, available, startingHour, endingHour, isLab, courseName);
	}
	
}
