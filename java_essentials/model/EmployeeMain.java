package java_essentials.model;

public class EmployeeMain {
  public static void main(String[] args) {
    Person p=new Person("xyz",30,"M");
    Employee emp=new Employee("xyz",30,"M",10,10,"abc");
    System.out.println(emp);//Employee{empName=xyzempAge=30empGender=MempId=10, departmentId=10, designation='abc'}

  }
}
