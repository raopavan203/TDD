package fileRead;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FileReadTester {

	@Test
	public void testLine() {
		MyFileReader myFileReader=new MyFileReader("C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt");
		assertEquals("Line 1 of input.txt == Hello","Hello\n",myFileReader.printLine(1));
	}
	@Test
	public void testLineNotPresent() {
		MyFileReader myFileReader=new MyFileReader("C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt");
		assertEquals("Line 10 of input.txt == NULL","",myFileReader.printLine(10));
	}
	@Test
	public void testFileNotFoundException() {
		MyFileReader myFileReader=new MyFileReader("C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/NoSuchFile.txt");
			try{
				 String s=myFileReader.printLine(10);
			   }
		    catch(Exception e){
			     assertEquals("File not found",e.getMessage());
			     //throw new RuntimeException("File not found");
		       }
		}
	@Test
	public void testTwoLines() {
		MyFileReader myFileReader=new MyFileReader("C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt");
		assertEquals("Line 1 of input.txt == Hello","Hello\nBye!\n",myFileReader.printLine(1,4));
	}
	
	@Test 
	public void testThreeCommandLineArgs() throws IOException {
		MyFileReader myFileReader=new MyFileReader();
		myFileReader.main(new String []{"C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt","1","4"});
	}
	
	@Test 
	public void testOneCommandLineArgs() throws IOException {
		MyFileReader myFileReader=new MyFileReader();
		myFileReader.main(new String []{"C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt"});
	}
	
	@Test 
	public void testTwoCommandLineArgs() throws IOException {
		MyFileReader myFileReader=new MyFileReader();
		myFileReader.main(new String []{"C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt","3"});
	}
	@Test 
	public void testFourCommandLineArgs() throws IOException {
		MyFileReader myFileReader=new MyFileReader();
		myFileReader.main(new String []{"C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt","3","4","C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/output.txt"});
	}
}

