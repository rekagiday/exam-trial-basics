import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 11..
 */
public class Seconds {

  List<Integer> myList;

  public Seconds(List<Integer> myList) {
    this.myList = myList;
  }

  public List<Integer> secondNumbers(List<Integer> list) {
    List<Integer> secondList = new ArrayList<>();

    for (int i = 1; i < 20; i++) {
      list.add(i);
    }
    for (int i = 0; i < list.size(); i++) {
      if (i % 2 == 1) {
        secondList.add(list.get(i));
      }
    }
    System.out.println(secondList);
    return secondList;
  }

  public static void main(String[] args) {

    List<Integer> myList = new ArrayList<>();
    Seconds list = new Seconds(myList);
    list.secondNumbers(myList);
  }
}

