package Pirates;

/**
 * Created by User on 2017. 04. 11..
 */

import java.util.*;

public class PirateCounter {

  static List<Pirate> countPirates(List<Pirate> listOfPirates) {
    List<Pirate> selectedPirates = new ArrayList<>();
    for (Pirate pirate : listOfPirates) {
      if (pirate.hasWoodenLeg && pirate.gold > 15) {
        selectedPirates.add(pirate);
      }
    }
    return selectedPirates;
  }
}
