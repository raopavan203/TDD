package fileRead;

import static org.junit.Assert.*;

import org.junit.Test;

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

}
