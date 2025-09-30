import java.util.Scanner;
public class SumaInPositivos {
public static void main(String[] args) {
 Double numero, suma = 0.0;
 // create an object of Scanner
 Scanner input = new Scanner(System.in);
 for (int i = 1; i < 6; ++i) {
 System.out.print("Ingrese un Numero " + i + " : ");
 // takes input from the user
 numero = input.nextDouble();
 // if number is negative
 // continue statement is executed
 if (numero <= 0.0) {
 continue;
 }
 suma += numero;
 }
 System.out.println("La Suma es = " + suma);
 }
}
