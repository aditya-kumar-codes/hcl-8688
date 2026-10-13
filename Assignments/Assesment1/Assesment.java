import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class Assesment {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Create
        employees.add(new Employee(100, "Rahul", "Manager", 50000, 5800));
        employees.add(new Employee(101, "Anita", "Admin", 50000, 4500));
        employees.add(new Employee(102, "Vikram", "Engineer", 45000, 5000));
        employees.add(new Employee(103, "Neha", "Accountant", 60000, 4000));

        for (Employee employee : employees) {
            employee.calculateBonus();
        }

        // Read using Iterator
        System.out.println("Employees using Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            print(iterator.next());
        }

        // Update
        updateEmployee(employees, 101, "Anita Sharma");

        // Delete
        deleteEmployee(employees, 103);

        // Read using ListIterator in forward direction
        System.out.println("\nEmployees using ListIterator:");
        ListIterator<Employee> listIterator = employees.listIterator();
        while (listIterator.hasNext()) {
            print(listIterator.next());
        }

        // Read using ListIterator in backward direction
        System.out.println("\nEmployees in reverse order:");
        while (listIterator.hasPrevious()) {
            print(listIterator.previous());
        }

        // Increasing bonus order
        sortByBonus(employees, true);
        System.out.println("\nIncreasing bonus order:");
        iterator = employees.iterator();
        while (iterator.hasNext()) {
            print(iterator.next());
        }

        // Decreasing bonus order
        sortByBonus(employees, false);
        System.out.println("\nDecreasing bonus order:");
        listIterator = employees.listIterator();
        while (listIterator.hasNext()) {
            print(listIterator.next());
        }
    }

    static void updateEmployee(ArrayList<Employee> employees, int id, String newName) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                employee.name = newName;
            }
        }
    }

    static void deleteEmployee(ArrayList<Employee> employees, int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().id == id) {
                iterator.remove();
                return;
            }
        }
    }

    static void sortByBonus(ArrayList<Employee> employees, boolean increasing) {
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee first, Employee second) {
                if (increasing) {
                    return Double.compare(first.bonus, second.bonus);
                }
                return Double.compare(second.bonus, first.bonus);
            }
        });
    }

    static void print(Employee employee) {
        System.out.println("Emp_id: " + employee.id + ", Name: " + employee.name
                + ", Bonus: Rs. " + employee.bonus);
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
