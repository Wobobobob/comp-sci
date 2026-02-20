public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        
        // Calculate item total
        double subtotal = Utils.calculateSubtotal(items);

        // Check if expensive
            Utils.isExpensive(items);

        // Trim premium items to exact size
       
        

        // Calculate tax and total
        double tax = Utils.calculateTax(10, subtotal);
        double total = Utils.calculateTotal(tax, subtotal);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + Utils.premiumCount);

        return new OrderSummary(total, subtotal, tax, Utils.expensiveItems);
    }
}