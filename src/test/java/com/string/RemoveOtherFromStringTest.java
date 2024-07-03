package com.string;
/**
 * @author Naveen K Wodeyar
 * @date 03-Jul-2024
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.string.code.RemoveFromString;

public class RemoveOtherFromStringTest {

	RemoveFromString r = new RemoveFromString();
	
	@Test
	public void removeDigitsTest() {
		r = new RemoveFromString();
		assertEquals("OneTwo", r.removeWhiteSpaces("One12Two"));
		
	}
	
}
