public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby");
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        // 1.added new keyword to create new Cat object
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName());
        // 2.added system.out.println to print the return value of equals method


        System.out.println("Are the cat's equal?" + myCat.equals(otherCat));
        // 3.added system.out.println to print the return value of getIsHungry method instead of
        // attempting to return a value

        System.out.println("Is my cat hungry? " + myCat.getIsHungry());
        // 4.changed print to sysoutprintln

        String firstName = "Tiger";
        String lastName = "Beast";
        // 5.changed from == to =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}
