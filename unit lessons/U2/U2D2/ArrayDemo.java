public class ArrayDemo {
    public static void main(String[] args) {
        // pokemon
        // you can have a team of 6
        // {0,1,2,3,4,5}
        // Pokemon[] box = new Pokemon[30];

        int[] myFavoriteNumbers = new int[4];
        myFavoriteNumbers[0] = 6;
        myFavoriteNumbers[1] = 7;
        myFavoriteNumbers[2] = 67;
        myFavoriteNumbers[3] = 61;
        myFavoriteNumbers[4] = 41;

        myFavoriteNumbers[0] = 6;
        // {6,8,13,5}

        for (int i = 0; i < myFavoriteNumbers.length; i++){
            System.out.println(myFavoriteNumbers[i]);
        }

        System.out.println(myFavoriteNumbers.length);

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCartney";

        String[] beatles = {"John Lennon", "Paul McCartney","Ringo Starr", "George Harrison"};

        String[] beatles2 = new String[5];
        for (int i = 0; i <beatles.length; i++){
            beatles2[i] = beatles[i];
        }

    }
}
