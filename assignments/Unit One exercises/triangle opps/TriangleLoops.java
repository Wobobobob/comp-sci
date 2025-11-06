public class TriangleLoops {
    public static String createLetterTriangleUp(int numrows, char letter) {
        String output = "";
        for (int i = 0; i <= numrows; i++) {
            for (int a = 0; a < i; a++) {
                output += letter;
            }
            if (i > 0) {
                output += "\n";
            }

        }
        return output;
    }

    public static String createLetterTriangleDown(int numrows, char letter) {
        String output = "";
        for (int i = numrows; i >= 0; i--) {
            for (int a = i; a > 0; a--) {
                output += letter;
            }

            output += "\n";
        }
        return output;
    }

    public static String createNumbersTriangle(int numrows) {
        String output = "";
        for (int i = 0; i <= numrows; i++) {
            for (int a = i; a > 0; a--) {
                output += i + "*";
            }

            output += "\n";
        }
        return output;
    }

    public static String createAlphabetTriangle(int numrows) {
        if (numrows > 26) {
            numrows = 26;
        }
        String output = "";
        for (int i = 0; i <= numrows - 1; i++) {
            for (int a = numrows - i - 2; a >= 0; a--) {
                // spaces
                output += "*";
            }
            for (int b = 0; b < i; b++) {
                char letter = (char) ('B' + b - 1);
                output += letter;
            }

            for (int c = i; c >= 0; c--) {
                char letter = (char) ('B' + c - 1);
                output += letter;
            }

            output += "\n";
        }
        return output;
    }
}
