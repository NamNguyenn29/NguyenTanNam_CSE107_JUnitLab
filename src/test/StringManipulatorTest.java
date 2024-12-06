package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
    StringManipulator stringManipulator = new StringManipulator();

    @Test
    public void testReverse() {
       assertEquals("dcba", stringManipulator.reverse("abcd"));
       assertEquals("mannatneyugn", stringManipulator.reverse("nguyentannam"));  
    }

    @Test
    public void testIsPalindrome() {
       assertEquals(true, stringManipulator.isPalindrome("abccba"));
       assertEquals(false, stringManipulator.isPalindrome("abcd"));
    }

    @Test
    public void testIsContained() {
       assertEquals(true, stringManipulator.isContained("abcdef", "abcd"));
       assertEquals(false, stringManipulator.isContained("abcdef", "ghi"));
    }

    @Test
    public void testNumberRemoved() {
       assertEquals("abcd", stringManipulator.numberRemoved("a1b2c3d5"));
       assertEquals("Nam@", stringManipulator.numberRemoved("Na22m@1"));
    }

    @Test
    public void testUpperString() {
       assertEquals("ABCDE", stringManipulator.upperString("abCdE"));
    }

    @Test
    public void testLowerString() {
       assertEquals("example", stringManipulator.lowerString("ExAmPLE"));
    }

    @Test
    public void testCapitalString() {
       assertEquals("Tan Nam", stringManipulator.capitalString("tAn naM"));
    }

    @Test
    public void testCountVowels() {
      assertEquals(3, stringManipulator.countVowels("ExamPle"));
    }

    @Test
    public void testCountWords() {
       assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
    }

    @Test
    public void testFindSubstringIndex() {
       assertEquals(5, stringManipulator.findSubstringIndex("Java programming", "programming"));
       assertEquals(-1, stringManipulator.findSubstringIndex("Java programming", "Programming"));
    }

    @Test(timeout = 1000)
    public void testReverseWords() {
       assertEquals("Hello World How Are You", stringManipulator.reverseWords("You Are How World Hello"));
    }    
}
