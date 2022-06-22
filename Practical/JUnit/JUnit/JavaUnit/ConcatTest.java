package JavaUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatTest {
	
	@Test
	 void ConCattest()
	{
		// creating object  of the class 
		MyJUnit junit = new MyJUnit();
	    String result=junit.ConCat("Newton's", "Force");
	    assertEquals("NewtonsForce", result);
	}
}
