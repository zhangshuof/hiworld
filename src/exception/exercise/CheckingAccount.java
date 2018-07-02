package exception.exercise;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance,double overdraftProtection){
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double amt) throws OverDraftException{
        if(amt > (this.balance + overdraftProtection)){
            double deficit = amt - (this.balance + overdraftProtection);
            throw new OverDraftException("透支额度超标",deficit);
        }
        this.balance -= amt;
    }

    public static void main(String[] args) {
        CheckingAccount caccount = new CheckingAccount(1000,500);
        caccount.deposit(100);

        System.out.println(caccount.getBalance());

        try {
            caccount.withdraw(1000);
            System.out.println(caccount.getBalance());
            caccount.withdraw(1000);
            System.out.println(caccount.getBalance());
        }catch(OverDraftException e){
            System.out.println("透支超额：" + e.getDeficit());
            e.printStackTrace();
      }
    }
}
