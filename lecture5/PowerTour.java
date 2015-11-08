import java.io.IOException;
// Experimenttion with integers


public class PowerTour {
  private static void powerTour(int x) throws IOException {
    int acc = x;
    while (true) {
      System.out.println(acc);
      System.in.read();
      acc = acc * x;
    }
  }

  public static void main(String[] args) throws IOException {
  	powerTour(5);
  }
}