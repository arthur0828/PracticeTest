package Practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.Utility.addStrings;

//test classes can be referred to as test cases
public class PracticeTest {
//this is the unit
    public int add (int x, int y){
        return x + y;
    }
    //unit is any small piece of testable code
    //think about a block of code that tests anything
    //this would be the unit test

    @Test
    void test(){
        int expected = 4;
       // int actual = Math.addExact(2, 2);
        int actual = add(2, 2);
       // fail("Not yet implemented");
        assertEquals(expected, actual);
    }

    //i want to test a string
    //have a method that takes two strings and puts them together
    @Test
    void testString(){
        //addString is just a reference in order to serve as a reference
        String expected = addStrings("Scooby ", "Doo");
        String actual = "Scooby" + "Doo";
        assertEquals(expected, actual);
    }

    //when do you stop testing is subjective
    //there is this idea of definition of done in agile development
    //teams have to define what "done on their own terms

    //try your best to find as many edge cases as you can
    //edge cases are any snerarios that are probable but not necessarily common
}
