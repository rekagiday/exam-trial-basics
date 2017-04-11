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

  private int getVolume() {
    volume = height * length * depth;
    System.out.println("The volume of your cuboid is: " + volume);
    return volume;
  }

  private int getSurface() {
    surface = ((height * length) + (height * depth) + (length * depth)) * 2;
    System.out.println("The surface of your cuboid is: " + surface);
    return surface;
  }

  public static void main(String[] args) {
    Cuboid cuboid = new Cuboid(5, 4, 7);
    cuboid.getSurface();
    cuboid.getVolume();
  }
}
