package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibility;

public class ExcelDocumentHandler extends DocumentHandler{
  public ExcelDocumentHandler(
      DocumentHandler nextHandler) {
    super(nextHandler);
  }
  public void handleDocument(String filename, String fileType) {
    if (fileType.equals("excel")) {
      System.out.println("An Excel document is handled by ExcelDocumentHandler");
    } else {
      super.handleDocument(filename, fileType);
    }
  }
}
