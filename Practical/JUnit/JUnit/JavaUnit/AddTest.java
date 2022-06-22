package JavaUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
    void Addtest()
	{
		// creating object  of the class 
		MyJUnit junit = new MyJUnit();
	    int result=junit.add(11, 20);
	    assertEquals(55, result);
	}
}
