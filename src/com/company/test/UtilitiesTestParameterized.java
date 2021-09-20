package com.company.test;

import com.company.Utilities;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities util;
    private String input;
    private String output;

    public UtilitiesTestParameterized(String input,String output){
        this.input=input;
        this.output=output;
    }

    @Before
    public void setUp(){
        util = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                { "AB88EFFG" , "AB8EFG"},
                {"112345666", "123456"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairs() throws Exception {
        assertEquals(output,util.removePairs(input));
    }

}
