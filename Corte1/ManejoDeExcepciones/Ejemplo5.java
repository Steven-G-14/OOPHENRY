
package ejemplo5;

public class Ejemplo5 {
    public static void main(String[]args){
        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[1]);
        }catch (Exception e){
             System.out.println(" Algo Ocurrio. ");
            
        }finally {
             System.out.println(" El 'try catch' Finalizo. ");
        }
    }
}
 





    