

// Creaetd by Shivam Shukla.

class Account {
    private float balance;
    public int acc_no;

    Account(int ac,float amt){
        acc_no=ac;
        balance=amt;
    }



    // synchronised is used to prevent critical section .
    // No withdraw can be made until deposit is going on and vice versa.
    synchronized void deposite(float amount){
        balance+=amount;
        System.out.println("Deposited amount : "+amount);
        System.out.println("Account No. : "+acc_no+"\tBalance after Deposit : "+balance);
    }
    synchronized   void withdraw(float amount){
        balance-=amount;
        System.out.println("Withdrawn amount : "+amount);
          System.out.println("Account No. : "+acc_no+"\tBalance after Withdrawal : "+balance);
    }
}

class TransactionDeposite implements Runnable{

    float amount;
    Account ac;
    TransactionDeposite(Account acc,float amount){
        ac=acc;
        this.amount=amount;

        // Running the thread.
        new Thread(this).start();
    }

    @Override
    public void run() {
        ac.deposite(amount);
    }
}
class TransactionWithdraw implements Runnable{

    float amount;
    Account ac;
    TransactionWithdraw(Account acc,float amount){
        ac=acc;
        this.amount=amount;

        // Running the thread.
        new Thread(this).start();
    }

    @Override
    public void run() {
        ac.withdraw(amount);
    }
}


class Main{

    public static void main(String[] args){

        Account vision=new Account(5433,10000.00f);

        // Depositing 500.00.
        TransactionDeposite t1=new TransactionDeposite(vision,500.00f);

        //Withdrawing 200.00

        TransactionWithdraw t2=new TransactionWithdraw(vision,200.00f);



    }

}


/*

OUTPUT ->



Without Synchronised keyword :


Deposited amount : 500.0
Withdrawn amount : 200.0
Account No. : 5433	Balance after Withdrawal : 10300.0
Account No. : 5433	Balance after Deposit : 10300.






With synchronised keyword :

Deposited amount : 500.0
Account No. : 5433	Balance after Deposit : 10500.0
Withdrawn amount : 200.0
Account No. : 5433	Balance after Withdrawal : 10300.0


 */