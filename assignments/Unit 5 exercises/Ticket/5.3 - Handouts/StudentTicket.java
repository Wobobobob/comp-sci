import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StudentTicket extends Ticket{

    private static final double STUDENT_DISCOUNT = 0.50;
    public StudentTicket(Date date, int ticketCount){
        super(date, ticketCount);
    }


    public double getTotalPrice() {
        return (getBasePrice() + getBasePrice() * getTax()) * ticketCount * (1 - STUDENT_DISCOUNT);
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }

    public void printPrice() {
        double totalPrice = getTotalPrice();
        BigDecimal decimalFormatter = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue());
    }

    

    
}
