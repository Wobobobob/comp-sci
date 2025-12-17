public class Utils {
    public static String printIntArray(int[] array) {
        String arrayPrint = "";
        for (int number : array) {
            arrayPrint += number;
        }
        return arrayPrint;
    }

    public static String printStringArray(String[] array) {
        String arrayPrint = "";
        for (String word : array) {
            arrayPrint += word;
        }
        return arrayPrint;
    }

    public static int average(int[] array, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += array[i];
        }

        return sum / (end - start);
    }

    public static boolean isMultipleOf10(int num) {
        return num % 10 == 0;
    }
}
