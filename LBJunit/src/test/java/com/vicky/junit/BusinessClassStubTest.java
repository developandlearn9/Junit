package com.vicky.junit;
import com.vicky.junit.mockito.BusinessClass;
import com.vicky.junit.mockito.StubDataService;
import org.junit.Test;

import static org.junit.Assert.*;
public class BusinessClassStubTest {

    @Test
    public void testGetSumOfNumbers(){
        //BusinessClass businessClass = new BusinessClass();
        //for stub
        BusinessClass businessClass = new BusinessClass(new StubDataService());
        int sum = businessClass.getSumOfNumbers(5,10);
        assertEquals(7, sum);
        //assertEquals(15, sum);
    }

}
