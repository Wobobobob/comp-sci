public class DogTester {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Alice Smith", 3, 693);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Max", "John Doe", 5, 123);
        Dog dog1Copy = new Dog("Buddy", "Alice Smith", 4, 693);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println(dog1Copy.toString());
        dog1.setAge(4);
        dog2.setName("Charlie");
        dog3.setOwnerName("Jane Smith");
        System.out.println("Updated Dog 1 Age: " + dog1.getAge());
        System.out.println("Updated Dog 2 Name: " + dog2.getName());
        System.out.println("Updated Dog 3 Owner: " + dog3.getOwnerName());
        System.out.println(dog1.getDogChar());
        System.out.println(dog3.getDogChar());
        System.out.println(PawesomeUtils.generateDogTag(dog1.getDogId(), dog1.getDogChar()));
        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(332));
        System.out.println(PawesomeUtils.generateDogChar(777));
        System.out.println(PawesomeUtils.generateDogTag(dog1.getDogId(), dog1.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(dog3.getDogId(), dog3.getDogChar()));
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println(dog1Copy.toString());
        System.out.println(dog1.equals(dog3));
        System.out.println(dog1.equals(dog1Copy));
        dog1.setStillInFacility(false);
        System.out.println(dog1.toString());
        dog1.setStillInFacility(true);
        System.out.println(PawesomeUtils.pickup(dog1, "Alice Smith"));
        System.out.println(dog1.isStillInFacility());
        System.out.println(PawesomeUtils.pickup(dog1, "bobbo"));
        System.out.println(PawesomeUtils.pickup(dog2, "king woofers the 3rd"));
        System.out.println(dog2.isStillInFacility());

        PawesomeUtils.checkin(dog1, "bawwuh");
        System.out.println(dog1.getOwnerName());
        System.out.println(dog1.isStillInFacility());


    }

}
