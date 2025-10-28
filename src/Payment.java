public class Payment {
    public Double amount;
    public String currency;
    public String status;

    public Payment(Double amount,String currency,String status){
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void processPayment(){
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt(){
        System.out.println("Receipt for amount "+ this.amount+" currency "+this.currency);
    }

    public void markAsCompleted(){
        this.status = "COMPLETED";
        System.out.println("Payment marked as COMPLETED.");
    }
}
