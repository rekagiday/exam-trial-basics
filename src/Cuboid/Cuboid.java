package Cuboid;

/**
 * Created by User on 2017. 04. 11..
 */
public class Cuboid {

  int height;
  int length;
  int depth;
  int volume;
  int surface;

  public Cuboid(int height, int length, int depth) {
    this.height = height;
    this.length = length;
    this.depth = depth;
  }

  private void calculateVolume() {
    volume = height * length * depth;
    System.out.println("The volume of your cuboid is: " + volume);
  }

  private void calculateSurface() {
    surface = ((height * length) + (height * depth) + (length * depth)) * 2;
    System.out.println("The surface of your cuboid is: " + surface);
  }

  public static void main(String[] args) {
    Cuboid cuboid = new Cuboid(5, 4, 7);
    cuboid.calculateSurface();
    cuboid.calculateVolume();
  }
}
