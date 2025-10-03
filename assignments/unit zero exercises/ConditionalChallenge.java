public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here
        double temperature = 55;
        boolean isCold = true;
        if(isCold == true){
            temperature -= 15;
        }else{
            temperature += 10;
        }


        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        
        // Part 2: Grade Calculator
        int score = 67;
        if(score >= 70){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        
        // Part 3: Season Determiner
        int temperature2 = 48;
        if (temperature2 >= 80){
            System.out.println("Summer");
        }else if( temperature2 >= 60 ){
            System.out.println("Spring");
        }else if(temperature >= 60){
            System.out.println("Fall");
        }else{
            System.out.println("winter");
        }

        
        // Part 4: Number Classifier
        int number = -5589808;
        if(number >= 0){
            System.out.println("positive");
        }else if(number <= 0){
            System.out.println("Negative");
        }else if(number == 0){
            System.out.println("Zero");
        }else if(number >= 100){
            System.out.println("Large");
        }else if(number <= -100){
            System.out.println("Large Negative");
        }
        
    }
}