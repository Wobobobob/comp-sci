public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        
        // Calculate item total
        double subtotal = Utils.calculateSubtotal(items);

        // Check if expensive
            Utils.isExpensive(items);

        // Trim premium items to exact size
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }

        // Calculate tax and total
        double tax;
        double total;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
        } else {
            tax = 0;
            total = 0;
        }

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }
}