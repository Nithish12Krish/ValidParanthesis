package com.nithish.validparanthesis;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class ValidParanthesisTest 
{
	@Test
	public void isValidOrNot() {
	
		ValidParanthesis vp=mock(ValidParanthesis.class);
		
		when(vp.isValid("({})")).thenReturn(true);
		
		assertTrue(vp.isValid("({})"));
	}
	
	@Test
	public void isValidOrNot2() {
	
		ValidParanthesis vp=mock(ValidParanthesis.class);
		
		when(vp.isValid("()[]{)}")).thenReturn(false);
		
		assertFalse(vp.isValid("()[]{)}"));
	}
	
}
