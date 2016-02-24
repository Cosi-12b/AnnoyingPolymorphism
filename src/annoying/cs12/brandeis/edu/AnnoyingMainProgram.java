package annoying.cs12.brandeis.edu;

public class AnnoyingMainProgram {

  public static void main(String[] args) {
    example1();
    example2();
    example3();
  }
  
  static void example1() {
    Snow var1 = new Sleet();
    var1.method2();
  }
  
  static void example2() {
    Snow var2 = new Rain();
    //var2.method1();
  }

   static void example3() { 
    Snow var3 = new Rain();
    ((Sleet) var3).method3();
  }
}

class Snow {
  public void method2() {
    System.out.println("Snow 2");
  }

  public void method3() {
    System.out.println("Snow 3");
  }
}

class Rain extends Snow {
  public void method1() {
    System.out.println("Rain 1");
  }

  public void method2() {
    System.out.println("Rain 2");
  }
}

class Sleet extends Snow {
  public void method2() {
    System.out.println("Sleet 2");
    super.method2();
    method3();
  }

  public void method3() {
    System.out.println("Sleet 3");
  }
}

class Fog extends Sleet {
  public void method1() {
    System.out.println("Fog 1");
  }

  public void method3() {
    System.out.println("Fog 3");
  }
}




