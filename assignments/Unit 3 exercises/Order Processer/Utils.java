public class Utils {
    public static double getItemPrice(Item item){
        return item.getPrice();
       
    }
    public static String getItemName(Item item){
       return item.getName();
    }

    public static int getItemQuantity(Item item){
        return item.getQuantity();
    }

    public static void isExpensive(Item[] items){
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;
        for (Item item : items) {
            if (getItemPrice(item) > 50.0) {
                    expensiveItemsTemp[premiumCount] = getItemName(item);
                    premiumCount += 1;
                System.out.println(getItemName(item) + " is a premium item at $" + getItemPrice(item));
                } else {
                    System.out.println(getItemName(item) + " is a regular item at $" + getItemPrice(item));
                }
        }

    }

    public static double calculateSubtotal(Item[] items){
        double subtotal = 0;
        for (Item item : items) {
            double itemTotal = getItemPrice(item) * getItemQuantity(item);
            subtotal += itemTotal;

        }
        return subtotal;

    }
}
