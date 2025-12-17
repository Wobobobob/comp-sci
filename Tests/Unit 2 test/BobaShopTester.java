public class BobaShopTester {
    public static void main(String[] args) {
        BobaShopMember bob = new BobaShopMember("bob");
        System.out.println(bob.getLoyaltyCredits());
        System.out.println(bob.determineMembershipStatus());
    }
}
