public class Unit4ExercisesTester {
    public static void main(String[] args) {
        int[] nums = {5,6,7,5,6};
        System.out.println(Unit4Exercises.matchingEndSequences(nums, 1));
        System.out.println(Utils.intArrayToString(Unit4Exercises.generateNumberSequence(1, 10)));
        int[] hasThreeConsecutivetest = {2,4,6,7};
        System.out.println(Unit4Exercises.hasThreeConsecutive(hasThreeConsecutivetest));
        System.out.println(Utils.stringArrayToString(Unit4Exercises.fizzBuzz(0, 16)));
    }
}
