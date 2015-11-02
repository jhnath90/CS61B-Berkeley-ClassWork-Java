public class InDemo {
  public static void main(String[] args) {
    In in = new In("InDemo.java");
    String s = in.readAll();
    System.out.println(s);
  }
}