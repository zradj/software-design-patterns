package main.proxy_decorator.proxy;

import java.util.Objects;

public class DocumentProxy implements Document {

  private Document document;
  private String documentId;
  private String userRole;

  public DocumentProxy(String documentId, String userRole) {
    this.documentId = documentId;
    this.userRole = userRole;
  }

  @Override
  public String read() {
    if (!Objects.equals(userRole, "ADMIN"))
      throw new RuntimeException("Access denied");

    if (document == null) {
      this.document = new RealDocument(documentId);
    }

    return document.read();
  }
}
