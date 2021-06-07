import java.util.*;

public class Suma{
  public static void main(String args[]){
   Scanner entrada = new Scanner(System.in);
   String nombre = "";
   int numero_uno = 0,numero_dos = 0,resultado = 0;

   System.out.println("Ingrese su nombre:");
   nombre = entrada.nextLine();

   System.out.println("Ingrese valor para numero_uno:");
   numero_uno  = entrada.nextInt();

   System.out.println("Ingrese valor para numero_dos:");
   numero_dos  = entrada.nextInt();

   resultado = numero_uno + numero_dos;

   System.out.println("Tu nombre es " + nombre + ", el valor de la suma es:" + resultado);
   
       
  }
}