package ExamLogger; 
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 

public class MarksLogger { 
	private String filePath; 
	
	public MarksLogger(String filePath) { 
		this.filePath=filePath; 
	} 
	
	public synchronized void logScore(String record) { 
		FileWriter fw=null; 
		BufferedWriter bw=null; 
		try { 
			fw=new FileWriter(filePath,true); 
			bw=new BufferedWriter(fw); 
			bw.write(record); 
			bw.flush();
			}catch(IOException e) { 
				e.printStackTrace();
		}
	} 	
}