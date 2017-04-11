package Pirates;

/**
 * Created by User on 2017. 04. 11..
 */

import java.util.*;

public class PirateCounter {

  static class Pirate {

    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }

  private List<Pirate> countPirates(List<Pirate> listOfPirates) {
    List<Pirate> selectedPirates = new ArrayList<>();
    for (Pirate pirate : listOfPirates) {
      if (pirate.hasWoodenLeg && pirate.gold > 15) {
        selectedPirates.add(pirate);
      }
    }
    return selectedPirates;
  }

  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
  }
}
