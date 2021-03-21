package com.dogancancoskun.DistinctLettersCount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.nio.file.Paths;

import org.junit.Test;

public class BufferedReaderTest {
	
	public static final String VALID_INPUT_PATH_FILE = "./src/main/java/testInput.txt";
	public static final String INVALID_INPUT_PATH_FILE = "";
	
	BufferedReader bufferedReaderWithValidPath = new BufferedReader(Paths.get(VALID_INPUT_PATH_FILE));
	BufferedReader bufferedReaderWithInvalidPath = new BufferedReader(Paths.get(INVALID_INPUT_PATH_FILE));
	
	@Test
    public void shouldBeReturnListWhenSendValidPath()
    {
		bufferedReaderWithValidPath.getLinesFromFile();
        assertEquals(bufferedReaderWithValidPath.getAllLines().size(),1);
    }
	
	@Test
    public void shouldBeReturnNullWhenSendInvalidPath()
    {
		bufferedReaderWithInvalidPath.getLinesFromFile();
        assertNull(bufferedReaderWithInvalidPath.getAllLines());
    }
	
	@Test
    public void pathIsnotNullWhenPathIsSetted()
    {
		bufferedReaderWithValidPath.setPath(Paths.get(VALID_INPUT_PATH_FILE));
		assertNotNull(bufferedReaderWithValidPath);
    }
	

}
