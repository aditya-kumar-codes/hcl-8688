package Assesment1;

import java.util.Arrays;

public class Assesment {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(100, "Rahul", "Manager", 50000, 5800),
                new Employee(101, "Anita", "Admin", 50000, 4500),
                new Employee(102, "Vikram", "Engineer", 45000, 5000),
                new Employee(103, "Neha", "Accountant", 60000, 4000)
        };

        for (Employee employee : employees) {
            employee.calculateBonus();
        }

        Arrays.sort(employees, (first, second) ->
                Double.compare(second.bonus, first.bonus));

        for (Employee employee : employees) {
            System.out.println("---------------------------------------------");
            System.out.println("Emp_id: " + employee.id);
            System.out.println("Name: " + employee.name);
            System.out.println("Bonus: Rs. " + employee.bonus);
        }
    }
}

class Employee {
    int id;
    String name;
    String role;
    double basic;
    double hra;
    double bonus;

    Employee(int id, String name, String role, double basic, double hra) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.basic = basic;
        this.hra = hra;
    }

    void calculateBonus() {
        double percentage = 0;

        switch (role) {
            case "Manager":
                percentage = 12;
                break;
            case "Engineer":
                percentage = 12;
                break;
            case "Admin":
                percentage = 10;
                break;
            case "Accountant":
                percentage = 8;
                break;
        }

        bonus = (basic + hra) * percentage / 100;
    }
}
