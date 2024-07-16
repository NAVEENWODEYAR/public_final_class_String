package com.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import com.string.code.StrReverse;
import com.string.code.StringSplit;

/**
 * @author Naveen K Wodeyar
 * @date 01-Jul-2024
 */
public class StringReverseTest {
	
	StrReverse s1 = new StrReverse();
	StringSplit s2 = new StringSplit();

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
	
	@Test
	public void reverseStringTest() {
		s1 = new StrReverse();
		assertEquals("ab", s1.reverseString("ba"));
	}
	
	@Test
	public void reverseStringTest1() {
		s1 = new StrReverse();
		assertEquals("string", s1.reverseString("gnirts"));
	}
	
	@Test
	public void splitString() {
		s2 = new StringSplit();
		assertEquals("[null]", s2.stringSplit("null"));
	}
}
