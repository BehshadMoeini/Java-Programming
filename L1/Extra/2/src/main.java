public class main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.savingsBalance = 2000;
        saver2.savingsBalance = 3000;
        SavingsAccount.annualInterestRate = (float) 0.04;
        int i=0;
        System.out.println("Month " + i + "\t\tS1: " + saver1.savingsBalance + "\t\tS2: " + saver2.savingsBalance);
        for (i=1 ; i<10 ; i++)
            System.out.println("Month " + i + "\t\tS1: " + saver1.calculateMonthlyInterest() + "\tS2: " + saver2.calculateMonthlyInterest());
        for (i=10 ; i<13 ; i++)
            System.out.println("Month " + i + "\tS1: " + saver1.calculateMonthlyInterest() + "\tS2: " + saver2.calculateMonthlyInterest());
        SavingsAccount.annualInterestRate = (float) 0.05;
        System.out.println("Month " + i + "\tS1: " + saver1.calculateMonthlyInterest() + "\tS2: " + saver2.calculateMonthlyInterest());
    }
}