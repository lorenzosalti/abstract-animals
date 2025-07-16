package org.lessons.java.animals;

public class Delfino extends AbstractAnimal {

  // CONSTRUCTOR
  public Delfino(String sound, String food) {
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
