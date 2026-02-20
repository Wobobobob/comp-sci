import java.util.ArrayList;


public class ArrayVersusArrayList {

    public static void main(String[] args) {

        System.out.println("== Testing Arrays lastComesFirst() ==");
        testLastComesFirst1();
        System.out.println();

        System.out.println("== Testing ArrayLists lastComesFirst() ==");
        testLastComesFirst2();
        System.out.println();

        System.out.println("== Testing Arrays firstComesLast() ==");
        testFirstComesLast1();
        System.out.println();

        System.out.println("== Testing ArrayLists firstComesLast() ==");
        testFirstComesLast2();

    }

    // modifies the given array by moving the last element to the first index, and
    // shifting all
    // other elements to the right.
    public static void lastComesFirst(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("cannot enter a null array");
        }
        String[] temp = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr.length) {
                temp[0] = arr[arr.length - 1];
            } else {
                temp[i + 1] = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    // modifies the given array by moving the last element to the first index, and
    // shifting all
    // other elements to the right.
    public static void lastComesFirst(ArrayList<String> arrList) {
        if (arrList == null) {
            throw new IllegalArgumentException("cannot enter a null array");
        } else if (arrList.size() == 0) {
            return;
        }
        String last = arrList.remove(arrList.size() - 1);
        arrList.add(0, last);

    }



    // modifies the given array by moving the first element to the last index, and
    // shifting all
    // other elements to the left.
    public static void firstComesLast(String[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        String[] temp = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                temp[arr.length - 1] = arr[0];
            } else {
                temp[i - 1] = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

    }

    // modifies the given array by moving the first element to the last index, and
    // shifting all
    // other elements to the left.
    public static void firstComesLast(ArrayList<String> arrList) {
        if (arrList == null || arrList.isEmpty()) {
            throw new IllegalArgumentException("cannot enter a null array");
        }

        String first = arrList.remove(0);
        arrList.add(first);

    }

    // Test Methods
    // method to print an array
    public static String printArray(String[] arr) {
        String arrayStr = "[";
        for (int k = 0; k < arr.length; k++) {
            if (k < arr.length - 1) {
                arrayStr += arr[k] + ", ";

            } else {
                arrayStr += arr[k] + "]";
            }
        }

        return arrayStr;
    }

    public static void testLastComesFirst1() {
        String[] strArray = {"first", "second", "third", "fourth", "fifth"};
        String[] expectedArray = {"fifth", "first", "second", "third", "fourth"};

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        lastComesFirst(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast1() {
        String[] strArray = {"one", "two", "three", "four", "five"};
        String[] expectedArray = {"two", "three", "four", "five", "one"};

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        firstComesLast(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));
    }

    public static void testLastComesFirst2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("fifth");
        expectedList.add("first");
        expectedList.add("second");
        expectedList.add("third");
        expectedList.add("fourth");

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        lastComesFirst(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("two");
        expectedList.add("three");
        expectedList.add("four");
        expectedList.add("five");
        expectedList.add("one");

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        firstComesLast(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

}
