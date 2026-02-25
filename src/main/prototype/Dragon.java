package main.prototype;

import java.util.Arrays;

public class Dragon implements Cloneable {

  private String name;
  private String color;
  private byte[] texture;

  public Dragon(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void displayTexture() {
    System.out.println("Texture displayed");
  }

  public void loadTexture() throws InterruptedException {
    System.out.println("Loading texture from DB... (takes a lot of time!)");
    Thread.sleep(2000);
    texture = new byte[] {};
  }

  @Override
  public String toString() {
    return "Dragon(name = \"" + this.name + "\", color = \"" + this.color + "\")";
  }

  @Override
  public Dragon clone() {
    try {
      Dragon clone = (Dragon) super.clone();
      clone.texture = this.texture.clone();
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Dragon dragon1 = new Dragon("Kaidou", "blue");
    dragon1.loadTexture();

    Dragon dragon2 = dragon1.clone();

    System.out.println(dragon1);
    System.out.println(dragon2);

    System.out.println("dragon1 == dragon2: " + (dragon1 == dragon2));
    System.out.println("dragon1.name == dragon2.name: " + (dragon1.name == dragon2.name));
    System.out.println("dragon1.color == dragon2.color: " + (dragon1.color == dragon2.color));
    System.out.println(
        "dragon1.texture == dragon2.texture: " + (dragon1.texture == dragon2.texture));
    System.out.println("dragon1.name.equals(dragon2.name): " + dragon1.name.equals(dragon2.name));
    System.out.println(
        "dragon1.color.equals(dragon2.color): " + dragon1.color.equals(dragon2.color));
    System.out.println(
        "Arrays.equals(dragon1.texture, dragon2.texture): "
            + Arrays.equals(dragon1.texture, dragon2.texture));
  }
}
