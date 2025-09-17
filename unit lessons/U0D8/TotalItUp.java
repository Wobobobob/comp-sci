public class TotalItUp {
    private int numOne, numTwo, answer;

    public void setNums(int n1, int n2) {
        this.numOne = n1;
        this.numTwo = n2;
    }

    // method add totals up numOne and numTwo
    public void add() {
        this.answer = this.numOne + this.numTwo;
    }

    // method print displays the sum of numOne and numTwo
    public void print() {
        System.out.println(this.numOne + " + " + this.numTwo + " = " + this.answer);
    }
}
