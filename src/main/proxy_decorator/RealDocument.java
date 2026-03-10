package main.proxy_decorator;

public class RealDocument implements Document {

  private String documentId;

  public RealDocument(String documentId) {
    this.documentId = documentId;
    System.out.println(
        "Loading document with ID " + documentId + " from DB... (takes a lot of time)"
    );
  }

  @Override
  public String read() {
    return "<document (id: " + documentId + ") contents>";
  }
}
