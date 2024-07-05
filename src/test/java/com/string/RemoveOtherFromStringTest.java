package com.string;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.string.code.RemoveFromString;

/**
 * @author Naveen K Wodeyar
 * @date 03-Jul-2024
 */
public class RemoveOtherFromStringTest {
	
	@Test
	public void removeDigitsTest() {
		assertEquals("OneTwo", RemoveFromString.removedigits("One12Two"));
		assertEquals("OneTwo", RemoveFromString.removedigits("One12Two"));	
	}
}
