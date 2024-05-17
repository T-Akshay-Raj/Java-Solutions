package java_essentials;

import java.util.List;

public class ImmutableListExamples {
  private final List<String> items;

  public ImmutableListExamples(List<String> items) {
    this.items = items;
  }

  public List<String> getItems() {
    return items;
  }
}
