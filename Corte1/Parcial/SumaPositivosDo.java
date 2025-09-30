import java.util.Scanner;
class Main {
public static void main(String[] args) {

 int suma = 0;
 int numero = 0;
 // create an object of Scanner class
 Scanner input = new Scanner(System.in);

 // do...while loop continues
 // until entered number is positive
 do {
 // add only positive numbers
 suma += numero;
 System.out.println("Ingrese Un Numero");
 numero = input.nextInt();
 } while(numero >= 0);

 System.out.println("La Suma es = " + suma);

 }
}