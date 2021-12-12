package org.campus02.erfani;

public class PercentCommissionEmployee extends Employee{
    private double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    public double getFullSalary(){

        return ( percentCommission * baseSalary ) / 100 + baseSalary;
    }
}
