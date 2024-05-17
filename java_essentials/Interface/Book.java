package java_essentials.Interface;

public class Book implements Price {
  String name;
  double price;
  String publisher;
  String author;

  public Book() {
    this.name = "";
    this.price = 0.0;
    this.publisher = "";
    this.author = "";
  }

  @Override
  public double getprice() {
    return this.price;
  }

  @Override
  public String getName() {
    return this.name;
  }


  @Override
  public String getDetails() {
    return "Book{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", publisher='" + publisher + '\'' +
        ", author='" + author + '\'' +
        '}';
  }
}
