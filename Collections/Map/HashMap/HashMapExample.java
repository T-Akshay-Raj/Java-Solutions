package Collections.Map.HashMap;

import Collections.Employee;
import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    // Create a HashMap object called employees
    HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();

    // Create Employee objects
    Employee johnDoe = new Employee(101, "John Doe", "Engineering", 120000);
    Employee janeSmith = new Employee(102, "Jane Smith", "Human Resources", 100000);
    Employee jackBlack = new Employee(103, "Jack Black", "Sales", 80000);

    // Add the Employee objects to the employees HashMap
    employees.put(johnDoe.getId(), johnDoe);
    employees.put(janeSmith.getId(), janeSmith);
    employees.put(jackBlack.getId(), jackBlack);

    // Print the employees HashMap
    System.out.println(employees);

    //Get the Employee object with the key 102
    Employee employee = employees.get(102);
    if(employee != null) {
      System.out.println("Employee name: "+employee.getName()+" is from department :"+employee.getDepartment());
    } else {
      System.out.println("Employee not found");
    }
  }
}
