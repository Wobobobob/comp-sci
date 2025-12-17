public class BobaShopMember {
    private String name;
    private boolean[] loyaltyCredits;

    public BobaShopMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public boolean[] getLoyaltyCredits() {
        return this.loyaltyCredits;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < this.loyaltyCredits.length; i++) {
            if (this.loyaltyCredits[i] == false) {
                this.loyaltyCredits[i] = true;
            }
        }

    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < this.loyaltyCredits.length; i++) {
            if (this.loyaltyCredits[i] == true) {
                count++;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int count = 0;
        for (int i = 0; i < this.loyaltyCredits.length; i++) {
            if (this.loyaltyCredits[i] == true) {
                count++;
            }
        }

        if (count >= 6) {
            return "Gold Member";
        } else if (count >= 3) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String printArray = "[";
        for (int i = 0; i < this.loyaltyCredits.length; i++) {
            if (i != 0 || i != loyaltyCredits.length) {
                printArray += ", ";
            }
            if (loyaltyCredits[i] == true) {
                printArray += "X";
            } else {
                printArray += "-";
            }
        }
        printArray += "]";
        return printArray;
    }

    public String toString() {

        return this.name + "(" + this.determineMembershipStatus() + "), Loyalty History: "

                + this.loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        if (this.name.equals(other.getName())
                && this.getLoyaltyCredits().equals(other.getLoyaltyCredits())) {
            return true;
        }
        return false;
    }

}
