public class Unit2ExercisesTester {
    public static void main(String[] args) {
        System.out.println(Unit2Exercises.doubleChar("hello"));
        System.out.println(Unit2Exercises.countHi(""));
        System.out.println(Unit2Exercises.catDog(""));
        System.out.println(Unit2Exercises.mixString("sehncry", "tpe ur"));
        System.out.println(Unit2Exercises.repeatEnd("for three ", 10));
        System.out.println(Unit2Exercises.endOther("charles eclair", "eclair"));
        System.out.println(Unit2Exercises.countCode("cooecokecodenotcodecoce"));
        int[] testarray = { 3, 2, 3, 4, 3 };
        System.out.println(Utils.printIntArray(Unit2Exercises.fizzArray(10)));
        System.out.println(Utils.printIntArray(testarray));
        System.out.println(Unit2Exercises.haveThree(testarray));
        System.out.println(Utils.printStringArray(Unit2Exercises.fizzArray2(5)));
    }
}
