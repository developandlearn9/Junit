package com.vicky.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({GreetingImplTest.class,GreetingImplTest1.class})
public class JunitTestSuite {
}
