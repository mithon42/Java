package overloading;

public class OverloadingConstrotor {
  public static void main(String[] args) {
    Overloading overloading1 = new Overloading();

    Overloading overloading2 = new Overloading("Mithon", "Mail");
    overloading2.displayInformation();
    Overloading overloading3 = new Overloading("Likhon", "Femail", 584854);
    overloading3.displayInformation();
  }
}
