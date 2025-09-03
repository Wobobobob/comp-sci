// Solution: Unit 0 Exercises
public class Unit0Exercises {


    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();
        System.out.println(obj.diff21(19));

        // testing sleepIn() method
        // System.out.println(obj.sleepIn(false, false)); output: true
        // sleepIn(true, false) -> true
        // sleepIn(false, true) -> true

        // testing diff21() method
        System.out.println(obj.diff21(19)); // ouput: 2
        // diff21(10) -> 11
        // diff21(21) -> 0

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
        // flooringCalculator(0, 3.0) -> 0.0
        // flooringCalculator(100, -1.5) -> 0.0

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepIn;

        if (weekday == false || vacation == true) {
            sleepIn = true;
        } else {
            sleepIn = false;
        }
        return sleepIn;
    }

    public int diff21(int n) {
        if (n > 21) {
            n = Math.abs((21 - n) * 2);
        } else {
            n = Math.abs((21 - n));
        }
        return n;
    }

    public double flooringCalculator(int sqft, double pricePerSqft) h{
        if (sqft < 0 || pricePerSqft < 0) {
            return 0.0;
        } else {
            return sqft * pricePerSqft;
        }
    }

}
