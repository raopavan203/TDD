package fileRead;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileReadTestv2 {

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
}
