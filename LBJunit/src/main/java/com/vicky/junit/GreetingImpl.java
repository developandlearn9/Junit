package com.vicky.junit;

public class GreetingImpl implements Greating {

	@Override
	public String greet(String name) {
		if(name == null || name.length() == 0){
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

}
