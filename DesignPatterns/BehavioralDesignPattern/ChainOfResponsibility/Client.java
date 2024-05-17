package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibility;

public class Client {
  public static void main(String[] args) {
    DocumentHandler wordDocumentHandler = new WordDocumentHandler(null);
    DocumentHandler excelDocumentHandler = new ExcelDocumentHandler(wordDocumentHandler);//Chaining Next handler
    DocumentHandler pptDocumentHandler = new PPTDocumentHandler(excelDocumentHandler);

    System.out.println("====================================");
    pptDocumentHandler.handleDocument("business plan", "ppt");

    System.out.println("====================================");
    pptDocumentHandler.handleDocument("business plan", "word");

    System.out.println("====================================");
    pptDocumentHandler.handleDocument("business plan", "excel");
  }
}
