package main.proxy_decorator.decorator;

import main.proxy_decorator.proxy.Document;

public class WatermarkDecorator extends DocumentDecorator implements Document {

  public WatermarkDecorator(Document document) {
    super(document);
  }

  @Override
  public String read() {
    String contents = this.document.read();
    return contents + " (Confidential)";
  }
}
