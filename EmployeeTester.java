import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeTester
{
    public static void main(String[] args)
    {

        //collection of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ankit", 50000));
        employees.add(new Employee(2, "Bashir", 60000));
        employees.add(new Employee(3, "Rahul", 75000));
        employees.add(new Employee(4, "Aditya", 55000));

        // finding maximum salary using Stream API
        Employee maxSalaryEmployee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        Employee secondHighest = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
                .findFirst().orElse(null);


        System.out.println("Employee with maximum salary: " +maxSalaryEmployee);
        System.out.println("Employee with maximum salary: " +secondHighest);
    }
}
