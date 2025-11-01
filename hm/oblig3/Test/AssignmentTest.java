import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

class AssignmentTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    Assignment assignment = new Assignment();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testAddThreeNumbers() {
        assertTrue(assignment.addThreeNumbers(1, 2, 3) == 6);
    }

    @Test
    public void testIsNumberSmallMediumOrBig() {
        assertTrue(assignment.isNumberSmallMediumOrBig(99).equalsIgnoreCase("Small"));
        assertTrue(assignment.isNumberSmallMediumOrBig(100).equalsIgnoreCase("Medium"));
        assertTrue(assignment.isNumberSmallMediumOrBig(1001).equalsIgnoreCase("Big"));
    }

    @Test
    public void testPrintCourseName() {
        assignment.printCourseName("ADTS1600");
        assertEquals("Interaksjonsdesign og Prototyping", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        assignment.printCourseName("DAPE1400");
        assertEquals("Programmering", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        assignment.printCourseName("DATA1200");
        assertEquals("Webutvikling og inkluderende design", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        assignment.printCourseName("DATA1100");
        assertEquals("Teknologi og samfunn for programmerere", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        assignment.printCourseName("Non-existing code");
        assertEquals("Unknown", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testIsColorInNorwegianFlag() {
        assertTrue(assignment.isColorInNorwegianFlag("blue"));
        assertTrue(assignment.isColorInNorwegianFlag("red"));
        assertTrue(assignment.isColorInNorwegianFlag("white"));
        assertFalse(assignment.isColorInNorwegianFlag("green"));
    }

    @Test
    public void testCombinedLength() {
        assertTrue(assignment.combinedLength("red", "blue") == 7);
    }





    @Test
    public void testCheckIfStringIsWithinCorrectLength() {
        assertTrue(assignment.checkIfStringIsWithinCorrectLength("", 0, 0));
        assertFalse(assignment.checkIfStringIsWithinCorrectLength("This String is too damn long", 10, 5));
        assertTrue(assignment.checkIfStringIsWithinCorrectLength("This String is just right", 30, 2));
    }



    @Test
    public void testPrintAllStrings() {
        String[] strings = {"Coding", "is", "fun!"};
        assignment.printAllStrings(strings);
        assertEquals("Codingisfun!", outputStreamCaptor.toString().replaceAll("\\p{Cntrl}", ""));
    }

    @Test
    public void testArraySum() {
        int[] numbers = {5, 10, 16};
        assertTrue(assignment.arraySum(numbers) == 31);
    }

    @Test
    public void testPrintAllStringsNotCorona() {
        String[] strings = {"These", "are", "fun", "Corona", "times!"};
        assignment.printAllStringsNotCorona(strings);
        assertEquals("Thesearefuntimes!", outputStreamCaptor.toString().replaceAll("\\p{Cntrl}", ""));
    }

    @Test
    public void testFindAllIntsBelowNumberInArray() {
        int [] intArray = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> testList = assignment.findAllIntsBelowNumberInArray(intArray, 5);

        ArrayList<Integer> targetList = new ArrayList<>();
        targetList.add(1);
        targetList.add(2);
        targetList.add(3);
        targetList.add(4);

        boolean listsAreIdentical = true;
        if (testList.size() != targetList.size()) {
            listsAreIdentical = false;
        } else {
            for (int i = 0; i < targetList.size(); i++) {
                if (!testList.get(i).equals(targetList.get(i))) {
                    listsAreIdentical = false;
                    break;
                }
            }
        }
        assertTrue(listsAreIdentical);
    }

    @Test
    public void testMakeHashMapFromTwoArrays(){
        String[] keyArray = {"A", "B", "C", "D"};
        String[] valueArray = {"a", "b", "c", "d"};

        HashMap<String, String> testMap = assignment.makeHashMapFromTwoArrays(keyArray, valueArray);
        HashMap<String, String> targetMap = new HashMap<> (Map.of(
                "A", "a",
                "B", "b",
                "C", "c",
                "D", "d"
        ));

        boolean mapsAreIdentical = true;

        if ( ! targetMap.keySet().equals(testMap.keySet())) {
            mapsAreIdentical = false;
        } else {
            for (String key : targetMap.keySet()) {
                if (! targetMap.get(key).equals(testMap.get(key))) {
                    mapsAreIdentical = false;
                    break;
                }
            }
        }
        assertTrue(mapsAreIdentical);

    }

    @Test
    public void testFindFrequencyOfElementsInArrayListOfStrings() {
        String[] testStrings = {"A", "B", "B", "a", "A", "C"};
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(testStrings));

        HashMap<String, Integer> targetMap = new HashMap<String, Integer> (Map.of(
                "A", 2,
                "a", 1,
                "B", 2,
                "C", 1
        ));

        HashMap<String, Integer> testMap = assignment.findFrequencyOfElementsInArrayListOfStrings(stringList);

        boolean testMapIsCorrect = true;


        if ( ! targetMap.keySet().equals(testMap.keySet())) {
            testMapIsCorrect = false;
        } else {
            for (String key : targetMap.keySet()) {
                if (! targetMap.get(key).equals(testMap.get(key))) {
                    testMapIsCorrect = false;
                    break;
                }
            }
        }
        assertTrue(testMapIsCorrect);
    }

    // The following methods are Optional assignments:
    // additional optional assignments might be added later.

    @Test
    public void testAddNumbers() {
        assertTrue(assignment.addNumbers(1, 2, 3, 4) == 10);
        assertTrue(assignment.addNumbers(1, 2) == 3);
    }


    @Test
    public void testFirstOccurrence() {
        assertTrue(assignment.firstOccurrence("blue", 'l') == 1);
        assertTrue(assignment.firstOccurrence("blue", 'x') == -1);
    }

    @Test
    public void testEnsureOnlySingleSpaceAtEndOfString() {
        String string = "          In ancient times cats were worshipped as gods; they have not forgotten this.      ";
        assertEquals("In ancient times cats were worshipped as gods; they have not forgotten this. ", assignment.ensureOnlySingleSpaceAtEndOfString(string));
    }

    @Test
    public void testValidateString() {
        assertFalse(assignment.validateString("This is the first sentence. This is the second. This is the third!"));
        assertTrue(assignment.validateString("hello world! "));
        assertFalse(assignment.validateString("hello world!"));
        assertTrue(assignment.validateString("Real stupidity beats artificial intelligence every time. "));
    }

    @Test
    public void testPrintUpperCaseStrings() {
        String[] strings = {"These", "are", "fun", "Corona", "times!"};
        assignment.printUpperCaseStrings(strings);
        assertEquals("THESEAREFUNCORONATIMES!", outputStreamCaptor.toString().replaceAll("\\p{Cntrl}", ""));
    }

    @Test
    public void testPrintFirstSentence() {
        char[] chars = "This is the first sentence. This is the second. I even have a third!".toCharArray();
        assignment.printFirstSentence(chars);
        assertEquals("This is the first sentence.", outputStreamCaptor.toString());
    }

    @Test
    public void testPrintFirstSentenceNoDot() {
        char[] charsWithNoDot = "Hei!".toCharArray();
        assignment.printFirstSentence(charsWithNoDot);
        assertEquals("Hei!", outputStreamCaptor.toString());
    }



    @Test
    public void testPrintAllStringsNotCoronaCaseInsensitive() {
        String[] strings = {"These", "are", "fun", "cOrOna", "times!"};
        assignment.printAllStringsNotCoronaCaseInsensitive(strings);
        assertEquals("Thesearefuntimes!", outputStreamCaptor.toString().replaceAll("\\p{Cntrl}", ""));
    }
}