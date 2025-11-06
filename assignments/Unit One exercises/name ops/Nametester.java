public class Nametester {
    public static void main(String[] args) {
        System.out.println(NameOps.generateLastFirstMidInitial("john alan doe"));
        System.out.println(NameOps.printMethodCall(NameOps.whoIsAwesome("bob"), "bob"));
        System.out.println(NameOps.findFirstName("ryan bobington"));
    }
}
