public class CastingDemo {
    public static void main(String[] args) {
        // implicit casting
        // storing smaller data types into larger ones
        // happens automatically
        int smallNumber = 100;
        long bignumber = smallNumber;
        float decimalnum = bignumber;
        double largeDecimal = decimalnum;

        // explicit casting
        // were manually converting a data type, ussually to a different data type that may incur
        // data loss
        double pi = 3.14150;
        int engineeerPi = (int) pi;
        System.out.println(engineeerPi);
        pi = engineeerPi;
        System.out.println(engineeerPi);

        long population = 30000000000L;
        int limitedpopulation = (int) population;
        System.out.println("population: " + limitedpopulation);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int letterA = 'a';
    

        System.out.println(letterA + 3);

        // there is no implicit or explicit casting between booleans
        
       
    }
}
