package fileRead;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyFileReader {

	private String fName; 
	public MyFileReader(String file) {
		// TODO Auto-generated constructor stub
		this.fName=file;
	}
	
	public MyFileReader() {
		// TODO Auto-generated constructor stub
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
	
	public void main(String[] args) throws IOException{
		int lineNumber1=0,lineNumber2=0;
		String lines="",fName="";
		
		if (args.length == 3) {
			fName=args[0];
			try {
		        lineNumber1 = Integer.parseInt(args[1]);
		        lineNumber2 = Integer.parseInt(args[2]);
		    } catch (NumberFormatException e) {
		        System.err.println("Argument" + " must be an integer");
		        System.exit(1);
		    }
		}
		
		if(args.length==0){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter File Name");
			fName=br.readLine();
	        System.out.print("Enter Line Number 1 (-1 for null)");
	        try{
	            lineNumber1 = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	        System.out.print("Enter Line Number 2 (-1 for null)");
	        try{
	            lineNumber2 = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
		}
		if(args.length==1){
			fName=args[0];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter Line Number 1 (-1 for null)");
	        try{
	            lineNumber1 = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	        System.out.print("Enter Line Number 2 (-1 for null)");
	        try{
	            lineNumber2 = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
		}
		
		if(args.length==2){
			fName=args[0];
			try {
		        lineNumber1 = Integer.parseInt(args[1]);
		    } catch (NumberFormatException e) {
		        System.err.println("Argument" + " must be an integer");
		        System.exit(1);
		    }
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter Line Number 2 (-1 for null)");
	        try{
	            lineNumber2 = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
		}
		
		
		MyFileReader myFileReader=new MyFileReader(fName);
		if(lineNumber1==-1)
			lines=myFileReader.printLine(lineNumber2);
		if(lineNumber2==-1)
			lines=myFileReader.printLine(lineNumber1);
		if(lineNumber1!=-1 && lineNumber2!=-1)
			lines=myFileReader.printLine(lineNumber1, lineNumber2);
		System.out.println("Required line(s): "+ lines);
		}
	
}
