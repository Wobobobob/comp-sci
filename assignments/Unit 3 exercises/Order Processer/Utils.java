public class Utils {
    public static String[] expensiveItems;
    public static int premiumCount = 0;

    
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
        
        for (Item item : items) {
            if (getItemPrice(item) > 50.0) {
                    expensiveItemsTemp[premiumCount] = getItemName(item);
                    premiumCount ++;
                    System.out.println(getItemName(item) + " is a premium item at $" + getItemPrice(item));
                    
                } else {
                    System.out.println(getItemName(item) + " is a regular item at $" + getItemPrice(item));
                }
        }
        Utils.expensiveItems = expensiveItemsTemp;
        
    }

    public static double calculateSubtotal(Item[] items){
        double subtotal = 0;
        for (Item item : items) {
            double itemTotal = getItemPrice(item) * getItemQuantity(item);
            subtotal += itemTotal;

        }
        return subtotal;

    }
    public static double calculateTax(double taxRate, double subtotal){
        double tax;
        if(subtotal > 0){
            tax = subtotal * taxRate;
        }else{
            tax = 0;
        }
        return tax;
        
        
    }
    public static double calculateTotal(double tax, double subtotal){
        
        double total;
        if (subtotal > 0) {
            total = subtotal + tax;
        } else {
            
            total = 0;
        }
        return total;
    }

    
}
