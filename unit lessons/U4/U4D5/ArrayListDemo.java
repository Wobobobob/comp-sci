//arrays are objects that represent a list of elements
// size of array cannot be changed once array is initialized (size is immutable)
//arrays do not have methods

//ArrayList class
//expandable list and has methods
//must import class before use

import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        //arrayLists by default reserve 10 empty slots in your memory
        names.add("Daniel");
        names.add("Matthew");
        names.add("Boyan");
        names.add("Jason");
        names.add("Ryan");
        names.add("Zayra");
        names.add("Crystal");
        names.add("Isabele");
        names.add("Ava");
        names.add("Morgan");
        names.add("Lopez");

        //reserves 15 slots in memory
        // 10 15 23 35
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(10));

        //drawback on arraylist is that we cannot use them on primitive datatypres

        //we can wrap the integer in the Integer wrapper class
        ArrayList<Integer> myFavNumbers = new ArrayList<Integer>();
        myFavNumbers.add(67);
        myFavNumbers.add(9);
        myFavNumbers.add(1);

        myFavNumbers.add(1,6);//index, value 67, 6, 9, 1

        System.out.println(myFavNumbers.set(2, 3));// 67, 8, 3, 1 returns the replaced value

        System.out.println(myFavNumbers.remove(1)); // 8,3,1 returns the removed value

        myFavNumbers.add(myFavNumbers.set(1, 40));
    }
}