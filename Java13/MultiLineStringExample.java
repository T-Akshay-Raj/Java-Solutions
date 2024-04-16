package Java13;
//multiline string is a string that spans multiple lines of source code
//multiline string is enclosed in three double quotes (""")
//multiline string is useful for writing HTML, SQL, JSON, etc.
//multiline string is a preview feature in Java 13
//multiline string is a standard feature in Java 15

public class MultiLineStringExample {
  public static void main(String[] args) {

    //Example 1: Multiline String
    String html = """
        <html>
            <body>
                <p>Hello, World</p>
            </body>
        </html>
        """;
    System.out.println(html);

    //Example 2: Multiline String
    String query = """
        SELECT *
        FROM users
        WHERE id = 1
        """;
    System.out.println(query);

    //Example 3: Multiline String with expressions
    String name = "John";
    String message = """
        Hello, %s
        How are you?
        """.formatted(name);
    System.out.println(message);


    //multiline string before java 13
    String htmlBeforeJava13 = "<html>\n" +
        "    <body>\n" +
        "        <p>Hello, World</p>\n" +
        "    </body>\n" +
        "</html>";
  }
}
