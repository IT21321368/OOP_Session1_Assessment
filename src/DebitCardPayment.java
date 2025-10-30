public class DebitCardPayment extends CardPayment{
    public double availableBalance;

    public DebitCardPayment(Double amount,String currency,String status,String cardNumber,String cardHolderName,String expiryDate,double availableBalance){
        super(amount, currency, status, cardNumber, cardHolderName, expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public void processPayment(){
        System.out.println();
        System.out.println("Debiting from account balance "+this.availableBalance+" for amount "+this.amount);
    }

    public void checkSufficientBalance(){
        System.out.println("Checking if balance covers amount");
    }
}
