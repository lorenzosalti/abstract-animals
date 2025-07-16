package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.INuotante;

public class Delfino extends AbstractAnimal implements INuotante {

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

  @Override
  public void nuota() {
    System.out.println("Sto nuotando!!!");
  }
}
