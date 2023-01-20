package com.vicky.junit.mockito;

public class StubDataService implements DataService{
    @Override
    public int getSum(int a, int b) {
        return 7;
    }
}
