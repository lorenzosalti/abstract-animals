package org.lessons.java.animals;

public class Cane extends AbstractAnimal {

  // CONSTRUCTOR
  public Cane(String sound, String food) {
    super(sound, food);
  }

  // METHODS
  @Override
  public void verso() {
    System.out.println(getSound());
  }

  @Override
  public void mangia() {
    System.out.println(getFood());
  }
}
