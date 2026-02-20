public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        if (numRows <= 0 || numCols <= 0) {
            throw new IllegalArgumentException("numRows and numCols must be > 0");
        }
        if (scanned == null || scanned.length != numRows * numCols) {
            throw new IllegalArgumentException("scanned array is too small");
        }

        view = new double[numRows][numCols];

        int index = 0;
        for (int r = 0; r < numRows; r++) {
            if (r % 2 == 0) {
                // even row: left -> right
                for (int c = 0; c < numCols; c++) {
                    view[r][c] = scanned[index++];
                }
            } else {
                // odd row: right -> left
                for (int c = numCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[index++];
                }
            }
        }
    }

    /**
     * @return the view
     */
    public double[][] getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(double[][] view) {
        this.view = view;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                sb.append(view[r][c]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }



    public boolean equals(SkyView other) {

        if (other.view == null || this.view == null) {
            return false;
        }
        if (this.view.length != other.view.length) {
            return false;
        }
        for (int i = 0; i < this.view.length; i++) {
            if (other.view[i].length != this.view[i].length) {
                return false;
            }
            for (int j = 0; j < this.view[i].length; j++) {
                if (other.view[i][j] != this.view[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || startCol < 0 || endRow >= view.length || endCol >= view[0].length
                || startRow > endRow || startCol > endCol) {
            throw new IllegalArgumentException("Invalid range");
        }
        double sum = 0;
        double count = 0;

        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                count++;
            }
        }
        return sum / count;
    }
}
