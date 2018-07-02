package exception.exercise.test;

public class Account {
    protected double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public void withdraw(double amt) throws OverDraftException2{
        if(amt > balance){
            throw new OverDraftException2("超支",amt-balance);
        }
        balance -= amt;
    }

    public static void main(String[] args) {
        Account a = new Account(1000);
        a.deposit(1000);
        System.out.println(a.getBalance());

        try{
            a.withdraw(2100);
        }catch(OverDraftException2 e){
            System.out.println("超支了" + e.getDeficit());
            e.printStackTrace();
        }
    }
}
