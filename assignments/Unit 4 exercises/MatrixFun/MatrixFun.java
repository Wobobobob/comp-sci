public class MatrixFun{
    private int[][] matrix;

    public MatrixFun(int rownum, int colnum){
        this.matrix = new int[rownum][colnum];
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = Utils.generateRandomNum(); 
            }
        }
    }

    public MatrixFun(int[][] starterMatrix){
        this.matrix = starterMatrix;
    }

    public MatrixFun(){
        this.matrix = new int[3][3];
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = Utils.generateRandomNum(); 
            }
        }
    }

    @Override
    public String toString(){
        int colnum = this.matrix[0].length;
        String output = "";
        for(int i = 0; i <colnum; i++){
            if(i+1 != colnum){
                output += "==";
            }else{
                output += "=";
            }
            
        }
        output += "\n";
        for(int[] array: matrix){
            for(int i : array){
                output += i+ " ";
            }
            output += "\n";
        }
        for(int i = 0; i <colnum; i++){
            if(i+1 != colnum){
                output += "==";
            }else{
                output += "=";
            }
            
        }
        return output;
   
    }

    public boolean equals(MatrixFun matrix){
        String matrixString1 = this.toString();
        String matrixString2 = matrix.toString();
        return matrixString1.equals(matrixString2);
    }

    public boolean equals(int[][] matrix){
        String matrixString1 = this.toString();
        String matrixString2 = Utils.matrixToString(matrix);
        return matrixString1.equals(matrixString2);
    }

    public void replaceMatrix(int a, int b){
        for(int i = 0; i< this.matrix.length; i++){
            for(int y = 0; y<matrix[i].length; y++){
                if(matrix[i][y] == a){
                    matrix[i][y] = b;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }
}