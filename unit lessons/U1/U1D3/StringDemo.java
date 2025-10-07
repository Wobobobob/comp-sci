import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class StringDemo{
    // in the AP only use the methods of this class

    public static void main(String[] args){
        //Strings are objects
        String fullname = "Mathew Chen";
        String fullname2 = "Mathew Chen";
        //this is just one object in memory
        fullname2 = "Mathew C.";
        //new object in memory created
        String fullname3 = new String("Mathew Chen");
        //new object in memory created
        //Strings are immutable any change is a new object
        fullname2 += " Jr.";

        System.out.println(fullname == fullname3); //false
        System.out.println(fullname.equals(fullname3)); //true

        System.out.println(fullname.indexOf("C")); //7


        int firstSpace = fullname.indexOf(" ");
        String middleLastName = fullname.substring(firstSpace + 1);
        System.out.println(middleLastName.indexOf("n")); //Chen
        System.out.println(middleLastName.indexOf("y")); //-1


        String abc = "abc";
        String def = "def";
        String abd = "abd";
        System.out.println(abc.compareTo(def)); //negative if abc before def
        System.out.println(def.compareTo(abc)); //positive if def after abc

    }
}