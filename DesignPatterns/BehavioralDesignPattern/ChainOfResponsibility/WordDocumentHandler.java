package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibility;

public class WordDocumentHandler extends DocumentHandler{
  public WordDocumentHandler(
      DocumentHandler nextHandler) {
    super(nextHandler);
  }
  public void handleDocument(String filename, String fileType) {
    if (fileType.equals("word")) {
      System.out.println("A Word document is handled by WordDocumentHandler");
    } else {
      super.handleDocument(filename, fileType);
    }
  }
}
