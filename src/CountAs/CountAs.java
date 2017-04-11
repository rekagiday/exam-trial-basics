package CountAs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by User on 2017. 04. 11..
 */
public class CountAs {

  public int countA(String taskPath) {
    Path path = Paths.get("countas/afile.txt");
    int counter = 0;
    try {
      List<String> lines = Files.readAllLines(path);

      for (String line : lines) {
        String[] letters = line.split("");
        for (String letter : letters) {
          if (letter.contains("a")) {
            counter++;
          }
        }
      }
    } catch (
        IOException e) {
      counter = 0;
    }
    System.out.println(counter);
    return counter;
  }

  public static void main(String[] args) {
    CountAs text = new CountAs();
    text.countA("countas/afile.txt");
  }
}
