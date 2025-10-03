

public class HelloWorld{
    // Main = the main console of the code AKA the entry point of the computer
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("my name is daniel");
        System.out.print("My favorite pizza topping is prosscuito");
        System.out.print("my favorite caffinated drink is white monster");
        int number = 5;
    char letter = 'a';
    boolean istrue = true;
    float numbertwo = 3.14f;
    double decimal = 3.14;
    byte age = 25;
    short population = 1200;
    long bigint = 120000;
    String name = "daniel";
    //string is a collection of characters to describe text
    System.out.println(name.length());

    //conditional statement aka if statements
    if(name == "daniel"){
        System.out.print(name);
    }

    boolean iscompscifun = true;

    if (iscompscifun == false) {
        System.out.println("comp sci sucks");

    }   else if(iscompscifun == true){
        System.out.println("comp sci is fun");
    }
    if (iscompscifun){
        System.out.println("comp sci is really fun");
    }else{
        System.out.println("Comp sci is stresses me out");
    }

    //challenge write a conditional if else statement where you do something where if you ate 5 apples vs 10 should print something if neither is true
    int appleCount = 10;
    if(appleCount == 10){
        System.out.println("wow thats like a multiple of 5 less than 11 and that is also not 5");

    }else if(appleCount == 5){
        System.out.println("wow thats like a multiple of 5 and is less than 11 and is 5 and is also a prime number and is an odd number");
    }else{
        System.out.println("wow man really you dont have 5 or 10 apples not cool dude not cool");
    }

}
}
    
    
