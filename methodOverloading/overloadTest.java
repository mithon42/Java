package methodOverloading;

public class overloadTest {
  public static void main(String[] args) {
    Overload ob = new Overload();
    ob.add();
    ob.add(5, 10);
    ob.add(6.5, 5.5);
    ob.add(5, 10, 20);
  }
}
