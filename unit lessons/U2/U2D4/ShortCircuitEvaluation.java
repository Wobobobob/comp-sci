public class ShortCircuitEvaluation{
    public static void main(String[] args) {
        String[] names = {"Henry", "Crystal", "Daniel", "Boyan", null};

        int count = 0;
        for (int i = 0; i< names.length; i++){
            if (names[i] != null&& names[i].length() >0 ){
                count++;
            }
        }
        System.out.println(count);

    }
}