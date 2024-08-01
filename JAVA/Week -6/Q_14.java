import java.util.Scanner;
interface Gross {
    double calculateGross();
}
interface Employee {
    void getEmployeeDetails();
}
class Salary implements Gross, Employee {
    private String name;
    private double basicSalary;
    private double allowances;
    public void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();
        System.out.print("Enter allowances: ");
        allowances = sc.nextDouble();
    }
    public double calculateGross() {
        return basicSalary + allowances;
    }
    public void displayDetails() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowances: " + allowances);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class Q_14 {
    public static void main(String[] args) {
        Salary employee = new Salary();
        employee.getEmployeeDetails();
        employee.displayDetails();
    }
}
