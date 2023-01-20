package com.vicky.junit.mockito;

public class BusinessClass {
    DataService dataService;

    public BusinessClass() {
    }


    public BusinessClass(DataService dataService) {
        this.dataService = dataService;
    }


    public int getSumOfNumbers(int c, int d){
       int sum =  dataService.getSum(c,d);
       return sum;
    }
}
