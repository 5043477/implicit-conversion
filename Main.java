import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   System.out.println("what is a number for the integer?"); 
    int i = scan.nextInt();
    System.out.println("what is the long variable range");
    int l = scan.nextInt();
    System.out.println("what is the float variable range");
    int f = scan.nextInt();
    System.out.println("what is the boolean");
    String b = scan.next();
    System.out.println("what is a double number");
    int d = scan.nextInt();
    System.out.println(" what is a char case");
    String c = scan.next();
    System.out.println("what is a short");
    int s = scan.nextInt();
    System.out.println(" what is a btye");
    int tb = scan.nextInt();
  }
   { 
    int i = 100;

// automatic type conversion
    long l = i;

// automatic type conversion
    float f = l;

    // automatic type conversion
    boolean b = true;

    // automatic type conversion
    double d = 100.5455;

    // automatic type conversion
    char c = 5;

    // automatic type conversion
    short s = 5; 

   // automatic type conversion
   byte tb = 17;
    System.out.println("Int or integer Value" + i);
    System.out.println("Long Value " + l);
    System.out.println("float value " + f);
    System.out.println("boolean value " + b);
    System.out.println("double value " + d);
    System.out.println("char value " + c);
    System.out.println("short value " + s);
    System.out.println(" value " + tb);
    




  }
}