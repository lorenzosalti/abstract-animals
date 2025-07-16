package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.IVolante;

public class Passerotto extends AbstractAnimal implements IVolante {

  // CONSTRUCTOR
  public Passerotto(String sound, String food) {
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

  @Override
  public void vola() {
    System.out.println("Sto volando!!!");
  }
}
