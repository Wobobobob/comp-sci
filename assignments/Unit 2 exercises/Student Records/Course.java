public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String newName) {
        this.courseName = newName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return this.enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] newRecords) {
        this.enrolledStudents = newRecords;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("== ").append(this.courseName).append(" ==\n");
        if (this.enrolledStudents != null) {
            for (int i = 0; i < this.enrolledStudents.length; i++) {
                StudentRecord student = this.enrolledStudents[i];
                sb.append(i + 1).append(".) ");
                if (student == null) {
                    sb.append("null");
                } else {
                    sb.append(student.toString());
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String findBestStudent() {
        double bestavg = 0;
        String beststudent = "";
        for (int i = 0; i < this.enrolledStudents.length; i++) {
            if (this.enrolledStudents[i] != null) {
                if (this.enrolledStudents[i].getFinalAverage() > bestavg) {
                    bestavg = this.enrolledStudents[i].getFinalAverage();
                    beststudent = this.enrolledStudents[i].getName();
                }
            }
        }
        return beststudent;
    }

    public double calculateTestAverage(int testnum) {
        int addedscores = 0;
        for (int i = 0; i < this.enrolledStudents.length; i++) {
            addedscores += this.enrolledStudents[i].getTestScore(testnum);
        }
        return addedscores / this.enrolledStudents.length;
    }
}
