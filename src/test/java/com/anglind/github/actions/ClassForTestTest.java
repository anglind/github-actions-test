package com.anglind.github.actions;


import org.junit.Assert;
import org.junit.Test;

public class ClassForTestTest {

    @Test
    public void testDoSomething() {
        final ClassForTest classForTest = new ClassForTest();
        Assert.assertEquals("something", classForTest.doSomething());
    }

}