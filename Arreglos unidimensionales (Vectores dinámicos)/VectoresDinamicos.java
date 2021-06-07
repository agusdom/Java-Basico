import java.util.*;
public class VectoresDinamicos{
  public static void main(String args[]){
   Scanner entrada = new Scanner(System.in);
   int longitud = 0;

   System.out.print("Cual desea que sea la longitud del vector?");
   longitud = entrada.nextInt();

   int numeros[] = new int[longitud]; 

   for(int i=0; i<numeros.length; i++){
      System.out.println("Ingrese el dato para la posicion " + i);
      numeros[i]=entrada.nextInt();
   }
   for(int i=0; i<numeros.length; i++){
     System.out.print("["+ numeros[i] +"]");
   }
 }
}