package main.proxy_decorator.decorator;

import main.proxy_decorator.proxy.Document;

public class EncryptionDecorator extends DocumentDecorator implements Document {

  public EncryptionDecorator(Document document) {
    super(document);
  }

  @Override
  public String read() {
    String contents = this.document.read();
    StringBuilder res = new StringBuilder();
    res.append(contents);
    res.reverse();
    return res.toString();
  }
}
