public class Demo {
    public static void main(String[] args) {
        int age = 20;
        boolean isFelon = false;

        if (age >= 18 && !isFelon) {
            System.out.println("You can run for presidency and are eligible to vote.");
        } 

        age = 15;
        if (age < 35 || isFelon|| age > 101) {
            System.out.println("You cannot run for presidency ");
        }

        if (!(age < 18)) {
            System.out.println("print me.");
        }

        
        public String votereligible(){
            
            boolean isCitizen = true;
            boolean isregistered = true;
            if(!(isCitizen == true)){
                return;
            }
            

        }

    }

    @Override
    public String toString() {
        return "Demo []";
    }
     
}