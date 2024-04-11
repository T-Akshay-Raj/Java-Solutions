package Java8.FunctionalInterfaces.Supplier;

import java.util.Date;
import java.util.function.Supplier;
import sun.plugin2.main.server.JVMHealthData;

public class SupplierExample {
  public static void main(String[] args) {
    Supplier s= Date::new;
    System.out.println(s.get());//date

    Supplier s1= JVMHealthData::new;
    System.out.println(s1.get());
  }
}
