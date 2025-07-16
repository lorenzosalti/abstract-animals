
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
  public String getSound() {
    return this.sound;
  }

  protected void setSound(String sound) {
    this.sound = sound;
  }

  public String getFood() {
    return this.food;
  }

  protected void setFood(String food) {
    this.food = food;
  }

  public void dormi() {
    System.out.println("Zzz");
  }

  public abstract void verso();

  public abstract void mangia();
}
