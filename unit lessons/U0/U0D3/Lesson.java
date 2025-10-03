public class Lesson {

    public static void main(String[] args) {
        int number = 5; // assignment operator
        //different from == which is a comparison operator
        //different assignment operators
        number += 3; // equivalent to number = number + 3
        number -= 2; // equivalent to number = number - 2
        number *= 4; // equivalent to number = number * 4
        number /= 2; // equivalent to number = number / 2
        number %= 3; // equivalent to number = number % 3

        //increment and decrement operators
        number++; // equivalent to number = number + 1
        number--; // equivalent to number = number - 1  
        
        // boolean operators
        //YOU CANNOT USE THESE FOR OBJECTS, ONLY PRIMITIVE DATA TYPES
        /* 
        number == 5;  equality operator
        number != 3;  not equal operator
        number > 2;  greater than operator
        number < 10;  less than operator
        number >= 5;  greater than or equal to operator
        number <= 7;  less than or equal to operator
        */
    }
}