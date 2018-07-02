package exception.exercise;

public class Account {
    protected double balance;

    public Account(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        this.balance += amt;
    }
    public void withdraw(double amt) throws OverDraftException {
        if(amt > this.balance) throw new OverDraftException("余额不足", amt - this.balance);
        this.balance -= amt;
    }

    public static void main(String args[]){
        Account a = new Account(1000);
        a.deposit(100);
        System.out.println(a.getBalance());

        try{
            a.withdraw(1200);
        }catch(OverDraftException e){
            System.out.println("透支金额" + e.getDeficit());
            e.printStackTrace();
        }

    }
}
