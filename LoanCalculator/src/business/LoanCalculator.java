package business;

public class LoanCalculator
{
    public static final int MONTHS_IN_YEAR = 12;

    public static double calculateMonthlyPayment(double loanAmount,
    double annualInterestRate, int years)
    {
        int months = years * MONTHS_IN_YEAR;
        double monthlyInterestRate = annualInterestRate/MONTHS_IN_YEAR/100;
                       
        double monthlyPayment = loanAmount * monthlyInterestRate/
                        (1 - 1/Math.pow(1 + monthlyInterestRate, months));

        return monthlyPayment;
    }
}