package day03_variables;

public class SalaryCalculator {


    public static void main(String[] args) {

        double salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;

        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        // now we have 2 variables, and we just need to find sum of it to get total Tax to pay
        totalTax = stateTax + federalTax; // result total tax to pay for year
        salaryAfterTax = salary - totalTax;

        System.out.println("Values: ");
        System.out.println("salary: " + salary);
        System.out.println("State tax rate: " +stateTaxRate);
        System.out.println("Federal tax rate: " + federalTaxRate);

        System.out.println();

        System.out.println("Total tax amount were : ");
        System.out.println("State tax: " + stateTax);
        System.out.println("Federal tax: " + federalTax);
        System.out.println("Salary after tax: " + salaryAfterTax);




    }


}
