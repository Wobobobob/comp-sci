public class MatricesDemo {
    public static void main(String[] args) {
        int[][] table = new int[4][5];
        table[1][2] = 50;
        for (int[] row : table) {
            for (int num : row) {
                System.out.println(num);
            }
        }


        int[][] fun = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

        int[][][] funpremium = new int[3][3][3];
    }
}
