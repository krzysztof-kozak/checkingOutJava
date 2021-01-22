class Main {
  public static void main(String[] args) {
    
    // kontekst statyczny
    // odwołuję się bezpośrednio do klasy, a nie do obiektu
    MyClass.myStaticMethod();

    // kontekst nie-statyczny
    // muszę najpierw stworzyć obiekt, a dopiero potem odwołać się do metody
    MyOtherClass myObject = new MyOtherClass();
    myObject.myNonStaticMethod();

    // metoda, która coś zwraca (czyli w klasie zamiast void mam np. int)
    int myNumber = MyClass.returSomeNumber();
    System.out.println(myNumber);
  }
}