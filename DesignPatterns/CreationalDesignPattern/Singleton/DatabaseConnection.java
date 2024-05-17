package DesignPatterns.CreationalDesignPattern.Singleton;


// complete and modify this code making it a singleton
public class DatabaseConnection {
  private static volatile DatabaseConnection instance;
  private String databaseURL;

  private DatabaseConnection(String databaseURL) {
    if (instance != null) {
      throw new IllegalStateException("Instance already created");
    }
    this.databaseURL = databaseURL;
  }

  public static DatabaseConnection getInstance() {
    if (instance == null) {
      synchronized (DatabaseConnection.class) {
        if (instance == null) {
          instance= new DatabaseConnection(
              "jdbc:mysql://localhost:3306/mydatabase");
        }
      }
    }
    return instance;

  }

  // dummy implementation of executing a query
  public void executeQuery(String query) {
    System.out.println("Executing query on " + databaseURL + ": " + query);
  }

  // dummy implementation of closing the connection
  public void close() {
    System.out.println("Closing connection with: " + databaseURL);
  }
}

