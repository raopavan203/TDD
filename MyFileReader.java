package fileRead;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MyFileReader {

	private String fName; 
	public MyFileReader(String file) {
		// TODO Auto-generated constructor stub
		this.fName=file;
	}
	
	public String printLine(int lineNumber) {
		// TODO Auto-generated method stub
		String returnValue = "";
	    FileReader file = null;
	    String line = "";
	    int currentLineNumber=0;
	    
	    try {
	      file = new FileReader(this.fName);
	      BufferedReader reader = new BufferedReader(file);
	      while ((line = reader.readLine()) != null) {
	    	currentLineNumber++; 
	    	System.out.println(line);
	    	if(currentLineNumber==lineNumber)
	           returnValue += line+"\n";
	      }
	    } catch (FileNotFoundException e) {
	      throw new RuntimeException("File not found");
	    } catch (IOException e) {
	      throw new RuntimeException("IO Error occured");
	    } finally {
	      if (file != null) {
	        try {
	          file.close();
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	    return returnValue;
	}
	
	public String printLine(int lineNumber1, int lineNumber2) {
		// TODO Auto-generated method stub
		String returnValue = "";
	    FileReader file = null;
	    String line = "";
	    int currentLineNumber=0;
	    
	    try {
	      file = new FileReader(this.fName);
	      BufferedReader reader = new BufferedReader(file);
	      while ((line = reader.readLine()) != null) {
	    	currentLineNumber++; 
	    	System.out.println(line);
	    	if(currentLineNumber==lineNumber1 || currentLineNumber==lineNumber2)
	           returnValue += line+"\n";
	      }
	    } catch (FileNotFoundException e) {
	      throw new RuntimeException("File not found");
	    } catch (IOException e) {
	      throw new RuntimeException("IO Error occured");
	    } finally {
	      if (file != null) {
	        try {
	          file.close();
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	    return returnValue;
	}
}
