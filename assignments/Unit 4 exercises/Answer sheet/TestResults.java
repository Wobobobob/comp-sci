import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null) {
            throw new IllegalArgumentException("parameter cannot be null");
        }

        if (submissions == null) {
            throw new IllegalArgumentException("parameter cannot be null");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void gradeTests() {
        for (int i = 0; i < submissions.size(); i++) {
            this.submissions.get(i).setTestScore(this.submissions.get(i).getGrade(this.answerKey));

        }
    }

    public String highestScoringStudent() {
        String bestStudent = "";
        double bestScore = 0.0;
        for (int i = 0; i < submissions.size(); i++) {

            double score = this.submissions.get(i).getGrade(this.answerKey);
            if (score > bestScore) {
                bestScore = score;
                bestStudent = submissions.get(i).getName();
            }
        }

        return bestStudent;
    }
}
