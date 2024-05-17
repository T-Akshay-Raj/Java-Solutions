package java_essentials.Interface;

public class Library {
  public static void main(String[] args) {
    Book book = new Book();
    book.name = "Java learning";
    System.out.println(book.getName());//Book{name='Java learning', price=0.0, publisher='', author=''}
    System.out.println(book.getDetails());

    Product p = new Book();
    System.out.println(p.getDetails());//Book{name='', price=0.0, publisher='', author=''} Since getDetails is overridden in the Book Class
    System.out.println(p.getName());

  }
}
