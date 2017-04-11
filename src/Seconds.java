import java.util.ArrayList;
import java.util.Arrays;
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
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    for (int i = 0; i < list.size(); i++) {
      if (i % 2 == 1) {
        secondList.add(list.get(i));
      }
    }
    System.out.println(secondList);
    return secondList;
  }

  public static void main(String[] args) {

    List<Integer> mylist = new ArrayList<>();
    Seconds list = new Seconds(mylist);
    list.secondNumbers(mylist);
  }
}


