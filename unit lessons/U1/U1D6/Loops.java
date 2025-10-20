public class Loops {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int count = 0;
        while (count<10) {
           System.out.println(count);
           count++;
        }


        boolean isRunning = true;

        while(isRunning){
            count++;
            if(count == 100){
                isRunning = false;
            }
            
        }
        for(int count2 = 0; count2 < 10; count2++){
        System.out.println(count2);
        }

        do { 
            System.out.println("do this first");
            System.out.println("then check condition");
        } while (isRunning);


        while(isRunning){
            System.out.println("do this first");
            System.out.println("then check condition");
        }

        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
            System.out.println("bob");
            }
        }
    }



}
