public class MatrixFunTester {
    public static void main(String[] args) {
        int[][] mat2 = {{1, 9, 7}, {9, 2, 3},{7,6,4}};
        MatrixFun matrix = new MatrixFun(mat2);
        System.out.println(matrix.toString());
        
        System.out.println(matrix.equals(matrix));
        
        
        System.out.println(matrix.equals(mat2));
        MatrixFun mat = new MatrixFun(new int[][]{{1, 2, 3},{4, 1, 6}});
        mat.replaceMatrix(1, 9);
        System.out.println(mat);

    }
}
