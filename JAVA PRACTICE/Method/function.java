//static means that the method belongs to the Main class and not an object of the Main class.

public class Main {
  static void myMethod() {
    // code to be executed
  }
}


//call a method

public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"
