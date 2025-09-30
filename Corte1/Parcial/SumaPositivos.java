
import java.util.Scanner;
public class SumaPositivos {
    public static void main(String[] args) {
        int suma = 0;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Ingrese Un Numero ");
          int numero = input.nextInt();
          
          while (numero >= 0){
              
              suma += numero;
              
              System.out.println("Ingrese un Numero");
               numero = input.nextInt();
          }
          
          System.out.println("La Suma es = " + suma);
        
    }
    
    
}
