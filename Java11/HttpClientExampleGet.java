package Java11;

import java.io.IOException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExampleGet {
  public static void main(String[] args) {
    //Http client example for get call using java 11 feature example
    System.out.println("HttpClient Example in Java 11");
    try {
      System.out.println(sendGet());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int sendGet() throws IOException, Exception {
    var client = HttpClient.newHttpClient();
    var url = new URL("https://www.w3schools.com/");
    var request = HttpRequest.newBuilder()
        .GET().uri(url.toURI()).build();

    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response);
    return response.statusCode();
  }
}
