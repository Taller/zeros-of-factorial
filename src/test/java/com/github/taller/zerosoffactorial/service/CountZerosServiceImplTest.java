package com.github.taller.zerosoffactorial.service;

import com.github.taller.zerosoffactorial.data.Result;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountZerosServiceImplTest {

    private CountZerosService countZerosService;

    @Before
    public void setUp() {
        countZerosService = new CountZerosServiceImpl();
    }

    @Test
    public void testWhenParameterCorrect() throws Exception {
        Result result = countZerosService.countZerosOfFactorialFrom(7);
        assertEquals(1, result.getResult());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWhenParameterLessThanZero() throws Exception {
        Result result = countZerosService.countZerosOfFactorialFrom(-5);
    }

}