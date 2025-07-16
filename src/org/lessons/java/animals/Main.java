package org.lessons.java.animals;

public class Main {
  public static void main(String[] args) {

    Cane lucky = new Cane("Woof!", "Croccantini");

    Passerotto alex = new Passerotto("Cip Cip!", "Insettini");

    Aquila donald = new Aquila("'Murica!", "Roditori");

    Delfino flipper = new Delfino("Gihgihgihgihgihgih gih gih gih!", "Pesci");

    lucky.dormi();
    alex.verso();
    donald.mangia();
    flipper.verso();
  }
}
