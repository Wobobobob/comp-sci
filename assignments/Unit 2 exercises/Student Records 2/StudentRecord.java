public class StudentRecord {
    private String name;
    private int[] scores;

    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameString) {
        this.name = nameString;
    }

    public int[] getScores() {
        return this.scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("'s scores: [");
        if (this.scores != null && this.scores.length > 0) {
            for (int i = 0; i < this.scores.length; i++) {
                sb.append(this.scores[i]);
                if (i < this.scores.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(StudentRecord other) {
        if (this.scores == other.scores && this.name.equals(other.name)) {
            return true;
        } else {
            return false;
        }
    }

    public double getAverage(int first, int last) {
        int addedscores = 0;
        for (int i = first; i < last; i++) {
            addedscores += this.scores[i];
        }
        return (double) addedscores / (last - first);
    }

    public int getTestScore(int testnum) {
        return scores[testnum];
    }

    public boolean hasImproved() {
        if (this.scores == null || this.scores.length < 2) {
            return false;
        }
        for (int i = 1; i < this.scores.length; i++) {
            if (this.scores[i] <= this.scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public double getFinalAverage() {
        if (hasImproved()) {
            return getAverage(scores.length / 2, scores.length);
        } else {
            return getAverage(0, scores.length);
        }
    }

}
