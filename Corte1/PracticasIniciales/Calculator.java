package calculator;

import java.util.Scanner;

public class Calculator {
  public Calculator() {
    
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b) {
    return a - b;
  } 

  public int multiply(int a, int b) {
    return a*b;
  }

  public double divide(int a, int b) {
    return a/b;
  }

  public int modulo(int a, int b) {
    return a%b;
  }

  public static void main(String[] args) {
      Scanner digito = new Scanner(System.in);
      
      System.out.print("Escriba el primer digito: ");
      int A1 = digito.nextInt();
      
      System.out.print("Escriba el segundo digito: ");
      int A2 = digito.nextInt();
      
      
    Calculator myCalculator = new Calculator(); 
    System.out.println(myCalculator.add(A1,A2));
    System.out.println(myCalculator.substract(A1,A2));
    System.out.println(myCalculator.multiply(A1,A2));
  
  }
}
