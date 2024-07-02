package com.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.string.code.StrReverse;

/**
 * @author Naveen K Wodeyar
 * @date 01-Jul-2024
 */
public class StringReverseTest {
	
	StrReverse s1 = new StrReverse();

	@Test
	public void reverseTest() {
			String st = "ab";
			s1 = new StrReverse();
			assertEquals("ba", s1.reverseString(st));	
		}
	
	@Test
	public void removeOthers() {
		s1 = new StrReverse();
		assertNull(s1);
	}
}
