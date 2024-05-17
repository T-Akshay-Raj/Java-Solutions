package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibility;

public abstract class DocumentHandler {
  private DocumentHandler nextHandler;

  public DocumentHandler(DocumentHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handleDocument(String filename, String fileType) {
    if (nextHandler != null) {
      nextHandler.handleDocument(filename, fileType);
    }
  }
}
