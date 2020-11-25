public class SavingsAccount {
    public static float annualInterestRate;
    public float savingsBalance;
    public float calculateMonthlyInterest () {
        savingsBalance += savingsBalance*annualInterestRate/12;
        return savingsBalance;
    }
}