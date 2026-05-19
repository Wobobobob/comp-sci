
import java.util.ArrayList;

public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        int f = 1;
        for (int i = n; i > 0; i--) {
            f = f * i;
        }

        return f;
    }

    public static int factorialRecursive(int n) {
        if (n < 0) {
            return 0;
        }
        if (n <= 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        for (int i = 1; i < n; i++) {
            int f = sequence.get(i - 1) + sequence.get(i);
            sequence.add(f);
        }
        return sequence.get(sequence.size() - 1);
    }

    public static int fibonacciRecursive(int n) {

        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        if (n < 0) {
            return 0;
        }
        int total = 0;
        String nonString = Integer.toString(n);
        for (int i = 0; i < nonString.length(); i++) {
            int add = 0;
            add = Integer.parseInt(nonString.substring(i, i + 1));
            total += add;

        }
        return total;
    }

    public static int sumDigitsRecursive(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigitsRecursive(n / 10);
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        int total = 0;
        for (int i = 0; i <= str.length(); i++) {
            String check = "";
            if (i > 0) {
                check = str.substring(i - 1, i).toLowerCase();
            } else {
                check = str.substring(0).toLowerCase();
            }
            if (check.equals("x")) {
                total++;
            }

        }
        return total;
    }

    public static int countXRecursive(String str) {
        if (str.length() <= 1) {
            String strSubString = str.substring(0).toLowerCase();
            if (strSubString.equals("x")) {
                return 1;
            }
            return 0;
        }
        String strSubString = str.substring(str.length() - 1, str.length()).toLowerCase();
        if (strSubString.equals("x")) {
            return 1 + countXRecursive(str.substring(0, str.length() - 1));
        } else {
            return countXRecursive(str.substring(0, str.length() - 1));
        }

    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        StringBuilder string = new StringBuilder();
        for (int i = str.length(); i > 0; i--) {
            string.append(str.charAt(i - 1));
        }
        return string.toString();
    }

    public static String reverseStringRecursive(String str) {
        System.out.println("bob");
        if (str.length() == 0) {
            return "";

        }
        return str.charAt(str.length() - 1)
                + reverseStringRecursive(str.substring(0, str.length() - 1));
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * powerRecursive(base, exponent - 1);
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str) {
        str = str.toLowerCase();
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        int total = 0;
        for (int i = 1; i <= bunnies; i++) {
            if (i % 2 != 0) {
                total += 2;
            } else {
                total += 3;
            }
        }
        return total;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies <= 0) {
            return 0;
        }
        int ears = 0;
        if (bunnies % 2 != 0) {
            ears = 2;
        } else {
            ears = 3;
        }
        return ears + bunnyEarsRecursive(bunnies - 1);
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        int newlow = low;
        int newhigh = high;
        if (arr[(low + high) / 2] == key) {
            return (low + high) / 2;
        } else if (low >= high) {
            return -1;
        }
        if (key > arr[(low + high) / 2]) {
            newlow = ((low + high) / 2) + 1;
        } else {
            newhigh = ((low + high) / 2) - 1;
        }
        return 0 + binarySearchRecursiveHelper(arr, key, newlow, newhigh);
    }

    // DO NOT EDIT! Work on the helper version above this method. This method is to be used for
    // testing purposes only.
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1); // Element not found
    }


}
