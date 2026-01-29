import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        // to-do: implement the method
        return result;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        int[] nums = generateNumberSequence(start, end);
        String[] newnums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 == 0 && nums[i] % 3 == 0) {
                newnums[i] = "FizzBuzz ";
            } else if (nums[i] % 5 == 0) {
                newnums[i] = "Buzz ";
            } else if (nums[i] % 3 == 0) {
                newnums[i] = "Fizz ";
            } else {
                newnums[i] = nums[i] + " ";
            }
        }

        // to-do: implement the method
        return newnums;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] result = new int[nums.length];
        int a = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                result[a] = nums[i];
                a++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 != 0){
                result[a] = nums[i];
                a++;
            }
        }
        return result;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
