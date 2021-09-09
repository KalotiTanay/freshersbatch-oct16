//Parent Class
class bankAcc {
    int accNo;
    String holderName;
    String AccType;
    private double balance;

    //Default class constructor
        public void bankAcc(){
        accNo=0;
        holderName="default";
        AccType="null";
        balance=0;
    }

    public bankAcc(int accNo, String holderName, double balance){
         this.accNo=accNo;
         this.holderName=holderName;
         this.AccType="AccType";
         this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
}

//Savings account class
class SavingsAcc extends bankAcc {
    double fixedDeposit;

    public SavingsAcc(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
        this.AccType="Savings";
        fixedDeposit=20000;
    }

    @Override
    public double getBalance() {                        //method overriding to get total balance
        return (super.getBalance()+fixedDeposit);
    }
}

//Current account class
class CurrentAcc extends bankAcc {
    double cashCredit;

    public CurrentAcc(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
        this.AccType="Current";
        if (balance>10000)
            cashCredit=(.10*balance);
        else
            cashCredit=(.5*balance);
    }

    @Override
    public double getBalance() {
        return (super.getBalance()+cashCredit);
    }
}

public class totalCash {
    public static void main(String[] args) {

        bankAcc s1= new SavingsAcc(1001,"Sumit",15000);
        bankAcc c1= new CurrentAcc(1002,"Sayali",30000);
        System.out.println("balance of s1 = : " + s1.getBalance());
        System.out.println("balance of c1 = : " + c1.getBalance());
        System.out.println("\nTotal cash in the bank: " +(s1.getBalance()+c1.getBalance()));

    }
}

