
public class Utils {
    public static int generateRandomNum(){
        int num = (int)(Math.random() * 9) + 1;
        return num;
    }

    public static String matrixToString(int[][] mat) {
    int colnum = mat[0].length;
    String output = "";

    for (int i = 0; i < colnum; i++) {
        if (i + 1 != colnum) output += "==";
        else output += "=";
    }
    output += "\n";

    for (int[] row : mat) {
        for (int val : row) {
            output += val + " ";
        }
        output += "\n";
    }

    for (int i = 0; i < colnum; i++) {
        if (i + 1 != colnum) output += "==";
        else output += "=";
    }

    return output;
}


}
