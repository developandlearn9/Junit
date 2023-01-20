package com.vicky.junit;

import com.vicky.junit.mockito.BusinessClass;
import com.vicky.junit.mockito.DataService;
import com.vicky.junit.mockito.StubDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusinessClassMockTest {

    @Mock
    DataService dataService;

    @InjectMocks
    BusinessClass businessClass;

    @Test
    public void testGetSumOfNumbers(){

        when(dataService.getSum(5,10)).thenReturn(15);
        //when(dataService.getSum(anyInt(),anyInt())).thenReturn(15);
        //when(dataService.getSum(anyInt(),anyInt())).thenReturn(15).thenReturn(20);
        //when(dataService.getSum(5,10)).thenReturn(15);
        //int sum = businessClass.getSumOfNumbers(5,10);
        assertEquals(15, businessClass.getSumOfNumbers(5,10));
        assertEquals(20, businessClass.getSumOfNumbers(10,10));
    }

}
