package com.vicky.junit.hamcrest;

public class Cat extends Animal{

    public Cat() {
        super("cat", "meow");
    }

    public String makeSound() {
        return getSound();
    }
}
