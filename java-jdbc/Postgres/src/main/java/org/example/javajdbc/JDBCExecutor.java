package org.example.javajdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.example.javajdbc.dao.CustomerDAO;
import org.example.javajdbc.dao.OrderDAO;
import org.example.javajdbc.model.Customer;
import org.example.javajdbc.model.Order;
import org.example.javajdbc.util.DatabaseConnectionManager;

public class JDBCExecutor {
  public static void main(String[] args) {
    /* Or Read from Application Properties

application.properties:
${DB_HOST}=hostname:portnumber
${DB_NAME}=db-name

username: ${DB_USER}
password: ${DB_PASS}

for ms sql example:
jdbc:sqlserver://hostname:portnumber;databaseName=database-name
For postgres nexample
jdbc:postgresql://hostname:portnumber;databaseName=database-name

     */
    DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost",
        "hplussport", "postgres", "password");

  }

  //Create Operation
  void createCustomer(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      CustomerDAO customerDAO = new CustomerDAO(connection);
      Customer customer = new Customer();
      customer.setFirstName("George");
      customer.setLastName("Washington");
      customer.setEmail("george.washington@wh.gov");
      customer.setPhone("(555) 555-6543");
      customer.setAddress("1234 Main St");
      customer.setCity("Mount Vernon");
      customer.setState("VA");
      customer.setZipCode("22121");

      customerDAO.create(customer);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //Read Operation
  void listCustomer(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      Statement statement = connection.createStatement();
      ResultSet resultSet =
          statement.executeQuery("SELECT COUNT(*) FROM CUSTOMER");
      while (resultSet.next()) {
        System.out.println(resultSet.getInt(1));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //Read Operation get by ID
  void getById(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      CustomerDAO customerDAO = new CustomerDAO(connection);
      Customer customer = customerDAO.findById(1000);
      System.out.println(
          customer.getFirstName() + " " + customer.getLastName());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  void updateCustomer(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      CustomerDAO customerDAO = new CustomerDAO(connection);
      Customer customer = customerDAO.findById(10000);
      System.out.println(
          customer.getFirstName() + " " + customer.getLastName() + " " +
              customer.getEmail());
      customer.setEmail("gwashington@wh.gov");
      customer = customerDAO.update(customer);
      System.out.println(
          customer.getFirstName() + " " + customer.getLastName() + " " +
              customer.getEmail());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  void deleteCustomer(DatabaseConnectionManager dcm, Customer customer,
                      CustomerDAO customerDAO) {
    Customer dbCustomer = customerDAO.findById(customer.getId());
    customerDAO.delete(dbCustomer.getId());
  }

  void orderFindById(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      OrderDAO orderDAO = new OrderDAO(connection);
      Order order = orderDAO.findById(1000);
      System.out.println(order);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  void getOrderForCustomer(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      OrderDAO orderDAO = new OrderDAO(connection);
      List<Order> orders = orderDAO.getOrdersForCustomer(789);
      orders.forEach(System.out::println);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  void getCustomerSortedAndLimit(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      CustomerDAO customerDAO = new CustomerDAO(connection);
      customerDAO.findAllSorted(20).forEach(System.out::println);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  void getCustomerPaged(DatabaseConnectionManager dcm) {
    try {
      Connection connection = dcm.getConnection();
      CustomerDAO customerDAO = new CustomerDAO(connection);
      customerDAO.findAllSorted(20).forEach(System.out::println);
      System.out.println("Paged");
      for (int i = 1; i < 3; i++) {
        System.out.println("Page number: " + i);
        customerDAO.findAllPaged(10, i).forEach(System.out::println);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
