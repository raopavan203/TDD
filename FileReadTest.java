package fileRead;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileReadTest {
	@Test
	public void testLine() {
		FileReaderMy myFileReader=new FileReaderMy("C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt");
		assertEquals("Line 1 of input.txt == Hello","Hello",myFileReader.printLine(1));
	}
	@Test
	public void testLineNotPresent() {
		FileReaderMy myFileReader=new FileReaderMy("C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/input.txt");
		assertEquals("Line 10 of input.txt == NULL","",myFileReader.printLine(10));
	}
	@Test
	public void testFileNotFoundException() {
		FileReaderMy myFileReader=new FileReaderMy("C:/Users/Pavan Rao/workspace/fileRead/src/fileRead/NoSuchFile.txt");
			try{
				 String s=myFileReader.printLine(10);
			   }
		    catch(Exception e){
			     assertEquals("File not found",e.getMessage());
			     //throw new RuntimeException("File not found");
		       }
		}
	
	}


