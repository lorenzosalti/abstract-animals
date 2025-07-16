
package org.lessons.java.animals;

public abstract class AbstractAnimal {

  // ATTRIBUTES
  private String sound;
  private String food;

  // CONSTRUCTOR
  public AbstractAnimal(String sound, String food) {
    this.sound = sound;
    this.food = food;
  }

  // METHODS
  private String getSound() {
    return this.sound;
  }

  private void setSound(String sound) {
    this.sound = sound;
  }

  private String getFood() {
    return this.food;
  }

  private void setFood(String food) {
    this.food = food;
  }

  public void dormi() {
    System.out.println("Zzz");
  }

  public abstract void verso();

  public abstract void mangia();
}
