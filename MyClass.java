public class MyClass {

  public static void myStaticMethod() {
    System.out.println("Hello from MyOtherClass (non static)");
  }

  // zamiast void, daję int
  // czyli komunikuję Javie, że ta metoda zwróci wartośc typu int
  public static int returSomeNumber() {
    return 10;
  }

}