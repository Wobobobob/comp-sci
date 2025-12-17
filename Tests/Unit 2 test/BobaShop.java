public class BobaShop {
    private String shopName;
    private BobaShopMember[] registeredMembers;


    public BobaShopMember[] getRegisteredMembers() {
        return this.registeredMembers;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String newName) {
        this.shopName = newName;
    }

    public void setRegisteredMembers(BobaShopMember[] loyaltyCredits) {
        this.registeredMembers = loyaltyCredits;
    }

    public BobaShop(String shopname, BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
        this.shopName = shopname;
    }

    public BobaShop(String shopname, int initialcapacity) {
        this.shopName = shopname;
        this.registeredMembers = new BobaShopMember[initialcapacity];
    }

    public boolean isFull() {
        for (BobaShopMember s : this.registeredMembers) {
            if (s == null) {
                return false;
            }
        }
        return true;

    }

    public void increaseCapacity() {
        BobaShopMember[] biggerArray = new BobaShopMember[this.registeredMembers.length * 2];

        for (int i = 0; i < this.registeredMembers.length; i++) {
            biggerArray[i] = this.registeredMembers[i];
        }

        this.registeredMembers = biggerArray;
    }

    public void registerMember(BobaShopMember member) {
        for (int i = 0; i < this.registeredMembers.length; i++) {

            if (this.registeredMembers[i] == null) {
                this.registeredMembers[i] = member;
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("== ").append(this.shopName).append(" ==\n");

        for (int i = 0; i < this.registeredMembers.length; i++) {
            sb.append(i + 1).append(".) ");
            if (registeredMembers[i] == null) {
                sb.append("null");
            } else {
                sb.append(registeredMembers[i].toString());
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean deleteMember(BobaShopMember member) {
        for (int i = 0; i < this.registeredMembers.length; i++) {
            if (this.registeredMembers[i] == member) {
                this.registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
}
