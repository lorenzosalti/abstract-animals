package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.INuotante;
import org.lessons.java.animals.interfaces.IVolante;

public class Main {

  public void faiVolare(IVolante animale) {
    animale.vola();
  }

  public void faiNuotare(INuotante animale) {
    animale.nuota();
  }

  public void main(String[] args) {

    Cane lucky = new Cane("Woof!", "Croccantini");

    Passerotto alex = new Passerotto("Cip Cip!", "Insettini");

    Aquila donald = new Aquila("'Murica!", "Roditori");

    Delfino flipper = new Delfino("Gihgihgihgihgihgih gih gih gih!", "Pesci");

    lucky.dormi();
    alex.verso();
    donald.mangia();
    flipper.verso();

    System.out.println("----------");

    faiVolare(alex);
    faiNuotare(flipper);
    faiVolare(donald);
  }
}
