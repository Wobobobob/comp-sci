public class BankAccount{
    public double balance;

    public BankAccount(){
        balance = 100;
    }


    public void withdraw(double withdraw){
    if (balance - withdraw < 0){
        throw new IllegalArgumentException("You have no funds. ");
    }if(withdraw < 0){
        throw new IllegalArgumentException("yo gang ur not smart. Ur not him");
    }


        balance -= withdraw;
    }
}