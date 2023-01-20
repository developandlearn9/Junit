package com.vicky.junit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsMapContaining.hasValue;
import static org.hamcrest.object.HasToString.hasToString;
import static org.hamcrest.object.IsCompatibleType.typeCompatibleWith;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

import com.vicky.junit.hamcrest.*;

import java.util.*;

public class HamcrestTest {

    @Test
    public void testEqualToIgnoringCase() {
        String a = "foo";
        String b = "FOO";
        assertThat(a, equalToIgnoringCase(b));
    }

    @Test
    public void testHasToString(){
        Person person=new Person("Barrack", "Washington");
        String str=person.toString();
        assertThat(person,hasToString(str));
    }
    @Test
    public void testTypeCompatibleWith(){
        assertThat(Cat.class,typeCompatibleWith(Animal.class));
    }

    @Test
    public void testEmpty() {
        List<String> emptyList = new ArrayList();
        assertThat(emptyList, empty());
    }

    @Test
    public void testHasSize() {
        List<String> hamcrestMatchers = Arrays.asList(
                "collections", "beans", "text", "number");
        assertThat(hamcrestMatchers, hasSize(4));
    }

    @Test
    public void testHasItemInArray() {
        String[] hamcrestMatchers = { "collections", "beans", "text", "number" };
        assertThat(hamcrestMatchers, hasItemInArray("text"));
    }

    @Test
    public void testHasValue() {
        Map<String, String> map = new HashMap();
        map.put("blogname", "baeldung");
        assertThat(map, hasValue("baeldung"));
    }

    //Number Matcher

    @Test
    public void testGreaterThan() {
        assertThat(1, greaterThan(0));
    }

    @Test
    public void testGreaterThanOrEqualTo() {
        assertThat(5, greaterThanOrEqualTo(5));
    }

    // Text Matcher

    @Test
    public void testIsEmptyString() {
        String str = "";
        assertThat(str, isEmptyString());
    }

    @Test
    public void testIsEmptyOrNullString() {
        String str = null;
        assertThat(str, isEmptyOrNullString());
    }
    public class Person {
        String name;
        String address;

        public Person(String personName, String personAddress) {
            name = personName;
            address = personAddress;
        }
    }
}
