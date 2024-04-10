package Java8.Base64EncodeAndDecode;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncodeAndDecodeExample {
  public static void main(String[] args) {
    String encoded = Base64.getEncoder().encodeToString("Hello".getBytes(StandardCharsets.UTF_8));
    System.out.println(encoded);//SGVsbG8=

    String decoded = new String(Base64.getDecoder().decode(encoded));
    System.out.println(decoded);//Hello

  }
}
