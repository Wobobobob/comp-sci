public class Utils {
    public static int generateRandomnumberbetween(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
