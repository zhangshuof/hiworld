package exception.exercise.test;

public class CheckingAccount extends Account {
    private double overdraftProtection;
    public CheckingAccount(double balance) {
        super(balance);
    }
    public CheckingAccount(double balance,double overdraftProtection){
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double amt) throws OverDraftException2{
        if((this.balance + overdraftProtection) < amt){
            double deficit = amt - (this.balance + overdraftProtection);
            throw new OverDraftException2("透支超标",deficit);
        }
        this.balance -= amt;
    }

    public static void main(String[] args) {
        CheckingAccount a = new CheckingAccount(1000,50);
        a.deposit(300);
        System.out.println(a.getBalance());

        try{
            a.withdraw(1400);
        }catch(OverDraftException2 e){
            System.out.println("超过透支额度" + e.getDeficit());
            e.printStackTrace();
        }
    }
}
