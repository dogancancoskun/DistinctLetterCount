package com.dogancancoskun.DistinctLettersCount;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistinctLettersCountTest {
  
	@Test
    public void shouldBeOneElementDeletedWhenSendSameFrequency()
    {
        assertEquals(DistinctLettersCount.getDistinctLettersCount("abab"),1);
    }
	
	@Test
    public void shouldBeTwoElementDeletedWhenSendSameFrequency()
    {
        assertEquals(DistinctLettersCount.getDistinctLettersCount("aabbabccc"),3);
    }
	
	@Test
    public void shouldBeTElementDeletedWhenElementFrequencyIsOne()
    {
        assertEquals(DistinctLettersCount.getDistinctLettersCount("exae"),1);
    }
}
