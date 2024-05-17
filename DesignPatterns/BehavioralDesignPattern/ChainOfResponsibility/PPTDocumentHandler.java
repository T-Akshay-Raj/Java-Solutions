package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibility;

public class PPTDocumentHandler extends DocumentHandler{
  public PPTDocumentHandler(
      DocumentHandler nextHandler) {
    super(nextHandler);
  }
  public void handleDocument(String filename, String fileType) {
    if (fileType.equals("ppt")) {
      System.out.println("A PPT document is handled by PPTDocumentHandler");
    } else {
      super.handleDocument(filename, fileType);
    }
  }
}
