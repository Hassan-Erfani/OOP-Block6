package org.campus02.erfani;

public class EmployeeDemoApp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Doe", "John", "IT", 2000.00);
        FixCommissionEmployee f1 = new FixCommissionEmployee("Sorglos", "Susi", "Management", 2000, 300);
        PercentCommissionEmployee p1 = new PercentCommissionEmployee("Mustermann", "Max", "Lager", 2000, 10);
        System.out.println("Employee basesalary: " + e1.getFullSalary() + "€" );
        System.out.println("Employee basesalary with 300€ fixcommission: " + f1.getFullSalary() + "€" );
        System.out.println("Employee basesalary with 10% Percentcommission: " + p1.getFullSalary() + "€" );
    }
}
