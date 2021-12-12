package org.campus02.erfani;

public class FixCommissionEmployee extends Employee{
    private double additionalCommission;

    public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalCommission) {
        super(lastname, firstname, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    public double getFullSalary(){
        return this.additionalCommission + baseSalary;
    }
}
