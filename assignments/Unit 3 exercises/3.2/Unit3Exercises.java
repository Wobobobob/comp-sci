import java.util.Arrays;

public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        while (i < strs.length) {
            if (strs[i] != null) {
                sum += strs[i].length();
                counted++;
            }
            i++;
        }

        return sum / counted;
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        // cannot have a null element
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
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

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]);
        }
        return new String(chars);
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

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] == max && i % 2 == 0) {
                max = max + 1;
            }
        }
        return max;
    }

    public static void testFindMaxValue() {
        int[] test1 = { 1, 2, 3, 4, 5 };
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(test1));
        int[] test2 = { 0, -2, 6, 7, 69, -5 };
        System.out.println("Expected 69: " + Unit3Exercises.findMaxValue(test2));
        int[] test3 = { -18, -22, -4, -6, -12345 };
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

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length();
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right - 1);
            if (a != b) {
                return false;
            }
            left++;// 1234
            right--;// 6543
        }

        return true;
    }

    public static void testIsPalindrome() {
        String test1 = "racecar";
        System.out.println("expected true:" + isPalindrome(test1));
        String test2 = "paveldurov";
        System.out.println("expected false:" + isPalindrome(test2));
        String test3 = null;

        try {

            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(test3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
        String test4 = "";
        System.out.println("expected true: " + isPalindrome(test4));
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        return sum;
    }

    public static void testSumEvenNumbers() {
        int[] test1 = { 1, 2, 3, 4, 5, 3, 8 };
        System.out.println("Expected 14:" + sumEvenNumbers(test1));
        int[] test2 = { -6, -8, -3, -4, -2, -3, -4 };
        System.out.println("Expected -24:" + sumEvenNumbers(test2));
        int[] test3 = { -1, 3, -8, 10, 21 };
        System.out.println("Expected 2:" + sumEvenNumbers(test3));
        int[] test4 = null;
        try {

            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(test4));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static void testCalculateSumOfSquares() {
        int test1[] = { 1, 10, 3, 2 };
        System.out.println("expected 114: " + calculateSumOfSquares(test1));
        int test2[] = null;
        try {

            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(test2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static int getNthFibonacci(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("cannot have a number less than or equal to 0");
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;

    }

    public static void testGetNthFibonacci() {
        int test1 = 4;
        System.out.println("expected 3: " + getNthFibonacci(test1));
        int test2 = -4;
        try {
            System.out.println("Expected exception: " + getNthFibonacci(test2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the int was negative, as intended");
        }

    }

    public static void sortArrayDescending(int[] arr) {
        if(arr == null){
            throw new IllegalArgumentException("cannot have a null array");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void testSortArrayDescending() {
        int[] test1 = { 5, 8, 3, 2, 6 };
        sortArrayDescending(test1);
        System.out.println("Expected: [8, 6, 5, 3, 2]");
        System.out.println("Actual:   " + Arrays.toString(test1));
        int[] test2 = {-2, -8, 3,5,123};
        sortArrayDescending(test2);
        System.out.println("Expected [123, 5, 3, -2, -8]");
        System.out.println("Actual: "+ Arrays.toString(test2));
        int[] test3 = null;
        try{
            sortArrayDescending(test3);
   
        }catch(Exception e){
            System.out.println(e.toString());
            System.out
                .println("the method threw an exception when array was null as intended");
        }
        
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void testFindLongestWord(){
        
    }
}
