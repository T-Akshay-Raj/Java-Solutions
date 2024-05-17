package java_essentials.records;

public class AccessRecord {
  public static void main(String[] args) {
    RecordExample example = new RecordExample(10,"abc");

    System.out.println("id : "+example.id()+" , name: "+example.name());//id : 10 , name: abc
    System.out.println(example.toString());//RecordExample[id=10, name=abc]
  }
}
