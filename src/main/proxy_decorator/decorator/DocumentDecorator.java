package main.proxy_decorator.decorator;

import main.proxy_decorator.Document;

public abstract class DocumentDecorator implements Document {

  protected Document document;

  public DocumentDecorator(Document document) {
    this.document = document;
  }
}
