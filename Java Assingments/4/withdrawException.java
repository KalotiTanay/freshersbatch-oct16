package myExceptionPkg;

class IllegalBankTransactionException extends RuntimeException{

    public IllegalBankTransactionException(){
        super();
    }
    public IllegalBankTransactionException(String message){
        super(message);
    }

}
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){
        super();
    }
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
class savingAccount{
    long id;
    private double balance;
    void withdraw(double amount){
        if (amount>balance||balance==0){
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        else if (amount<0)
            throw new IllegalBankTransactionException("Illegal Bank Transaction..!");
        else{
            this.balance-=amount;

        }
    }
    void deposit(double amount){
        System.out.println("depositing amount");
        balance+=amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class withdrawException {
    public static void main(String[] args) {

        savingAccount SA = new savingAccount();
        SA.deposit(10000);

        try {
            SA.withdraw(2000);
            System.out.println("withdrawal successful new balance is: "+SA.getBalance());
            SA.withdraw(-30000);
            System.out.println("withdrawal successful new balance is: "+SA.getBalance());

        } catch (IllegalBankTransactionException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                SA.withdraw(10000);
                System.out.println("withdrawal successful new balance is: "+SA.getBalance());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
