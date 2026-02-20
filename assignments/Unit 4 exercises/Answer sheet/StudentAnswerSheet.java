import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private ArrayList<String> answers;
    private double testScore;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (answers == null) {
            throw new IllegalArgumentException("parameter cannot be null");
        }

        if (name == null) {
            throw new IllegalArgumentException("parameter cannot be null");
        }
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the answers
     */
    public ArrayList<String> getAnswers() {
        return answers;
    }

    /**
     * @param answers the answers to set
     */
    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    /**
     * @return the testScore
     */
    public double getTestScore() {
        return testScore;
    }

    /**
     * @param testScore the testScore to set
     */
    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("parameter cannot be null");
        }

        double correctAnswers = 0;
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).equals(this.answers.get(i))) {
                correctAnswers++;
            } else if (this.answers.get(i) == null) {
                correctAnswers += 0;
            } else if (this.answers.get(i).equals("")) {
                correctAnswers += 0;
            } else if (this.answers.get(i).equals("?")) {
                correctAnswers += 0;
            } else {
                correctAnswers -= 0.25;
            }
        }
        return correctAnswers;
    }
}
