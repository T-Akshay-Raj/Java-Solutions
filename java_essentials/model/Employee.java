package java_essentials.model;

public class Employee extends Person {
  private int empId;
  private int departmentId;
  private String designation;

  public Employee(String name, int age, String gender, int empId,
                  int departmentId, String designation) {
    super(name, age, gender);
    this.empId = empId;
    this.departmentId = departmentId;
    this.designation = designation;
  }

  public Employee() {
    super();
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "empName=" + getName() +
        "empAge=" + getAge() +
        "empGender=" + getGender() +
        "empId=" + empId +
        ", departmentId=" + departmentId +
        ", designation='" + designation + '\'' +
        '}';
  }

}
