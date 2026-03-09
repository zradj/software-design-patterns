package main.proxy_decorator;

import main.proxy_decorator.decorator.DocumentDecorator;
import main.proxy_decorator.decorator.EncryptionDecorator;
import main.proxy_decorator.decorator.WatermarkDecorator;
import main.proxy_decorator.proxy.DocumentProxy;

import java.util.UUID;

public class Main {

  public static void main(String[] args) {
    DocumentProxy docProxy = new DocumentProxy(
        UUID.randomUUID().toString(), "ADMIN"
    );
    System.out.println("[After proxy] " + docProxy.read());

    DocumentDecorator decorator = new WatermarkDecorator(docProxy);
    System.out.println("[After watermark decorator] " + decorator.read());

    decorator = new EncryptionDecorator(decorator);
    System.out.println("[After encryption decorator] " + decorator.read());
  }
}
