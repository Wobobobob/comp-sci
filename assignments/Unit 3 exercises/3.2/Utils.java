import java.util.Arrays;

public class Utils {

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = {"abc", "cde", "efg", "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        // cannot have a null element
        letters = new String[] {"abc", "cde", "efg", null, "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }

        System.out.println("finished task one");
    }


    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testFindMaxValue() {

        
        int[] test1 = {1, 2, 3, 4, 5};
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(test1));
        int[] test2 = {0, -2, 6, 7, 69, -5};
        System.out.println("Expected 69: " + Unit3Exercises.findMaxValue(test2));
        int[] test3 = {-18, -22, -4, -6, -12345};
        System.out.println("Expected -4: " + Unit3Exercises.findMaxValue(test3));
        int[] test4 = null;
        try {

            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(test4));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }

    }

    public static void testIsPalindrome() {
        String test1 = "racecar";
        System.out.println("expected true:" + Unit3Exercises.isPalindrome(test1));
        String test2 = "paveldurov";
        System.out.println("expected false:" + Unit3Exercises.isPalindrome(test2));
        String test3 = null;

        try {

            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(test3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
        String test4 = "";
        System.out.println("expected true: " + Unit3Exercises.isPalindrome(test4));
    }

    public static void testSumEvenNumbers() {
        int[] test1 = {1, 2, 3, 4, 5, 3, 8};
        System.out.println("Expected 14:" + Unit3Exercises.sumEvenNumbers(test1));
        int[] test2 = {-6, -8, -3, -4, -2, -3, -4};
        System.out.println("Expected -24:" + Unit3Exercises.sumEvenNumbers(test2));
        int[] test3 = {-1, 3, -8, 10, 21};
        System.out.println("Expected 2:" + Unit3Exercises.sumEvenNumbers(test3));
        int[] test4 = null;
        try {

            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(test4));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testCalculateSumOfSquares() {
        int test1[] = {1, 10, 3, 2};
        System.out.println("expected 114: " + Unit3Exercises.calculateSumOfSquares(test1));
        int test2[] = null;
        try {

            System.out
                    .println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(test2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testGetNthFibonacci() {
        int test1 = 4;
        System.out.println("expected 3: " + Unit3Exercises.getNthFibonacci(test1));
        int test2 = -4;
        try {
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(test2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the int was negative, as intended");
        }

    }
    public static void testSortArrayDescending() {
        int[] test1 = {5, 8, 3, 2, 6};
        Unit3Exercises.sortArrayDescending(test1);
        System.out.println("Expected: [8, 6, 5, 3, 2]");
        System.out.println("Actual:   " + Arrays.toString(test1));
        int[] test2 = {-2, -8, 3, 5, 123};
        Unit3Exercises.sortArrayDescending(test2);
        System.out.println("Expected [123, 5, 3, -2, -8]");
        System.out.println("Actual: " + Arrays.toString(test2));
        int[] test3 = null;
        try {
            Unit3Exercises.sortArrayDescending(test3);

        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("the method threw an exception when array was null as intended");
        }

    }
    
    public static void testFindLongestWord() {
        String test1 = "hello my name is bob. I like pancakes";
        System.out.println("expected pancakes: " + Unit3Exercises.findLongestWord(test1));
        String test2 = "hello my name is bob. I enjoy the park";
        System.out.println("expected hello: " + Unit3Exercises.findLongestWord(test2));
        String test3 = null;
        try {

            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(test3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }

    }
    
    public static void testCalculateInterest() {
        System.out.println("expected 121: " + Unit3Exercises.calculateInterest(100, 10, 2));
        System.out.println("expected 1157.625 " + Unit3Exercises.calculateInterest(1000, 5, 3));
        try {
            Unit3Exercises.calculateInterest(-100, 5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }
        try {
            Unit3Exercises.calculateInterest(100, -5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }
        try {
            Unit3Exercises.calculateInterest(100, 5, -2);
        } catch (IllegalArgumentException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }

    }
    
    public static void testParsePositiveInteger() {
        System.out.println("expected 567:" + Unit3Exercises.parsePositiveInteger("567"));
        try {
            Unit3Exercises.parsePositiveInteger("-567");
        } catch (NumberFormatException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }
    }
    
    public static void testGetArrayElement(){
        String arr[] = {"null"};
        int index = 1;
        try {
            Unit3Exercises.getArrayElement(arr, index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }
    }

    public static void testCalculateSquareRoot(){
        try {
            Unit3Exercises.calculateSquareRoot(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }
    }

    public static void testSumArrayElements(){
        int[] array = null;
        try {
            Unit3Exercises.sumArrayElements(array);
        } catch (IllegalArgumentException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }
    }

    public static void testCalculatePower(){
        try {
            Unit3Exercises.calculatePower(3, -67);
        } catch (IllegalArgumentException e) {
            System.out.println("exception was thrown as expected " + e.getMessage());
        }
    }

    

    
}
