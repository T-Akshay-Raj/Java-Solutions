package java_essentials.model.record;

public class MainTest {
  public static void main(String[] args) {
    PersonRecord p=new PersonRecord("xyz",40,"F");
    EmployeeRecord er=new EmployeeRecord(p,"swjkn",122,12);
    System.out.println(er);//EmployeeRecord[PR=PersonRecord[name=xyz, age=40, gender=F], designation=swjkn, empId=122, deptId=12]
  }
}
