import java.util.*;
public class Cadena{
  public static void main(String args[]){
  String cad_original = "", cad_substraccion = "";
  int num_caracteres = 0, desde = 0, hasta = 0;
  Scanner entrada = new Scanner(System.in);

  System.out.print("Introduce una cadena de caracteres:");
  cad_original = entrada.nextLine();

  num_caracteres = cad_original.length();
  System.out.println("La cadena de caracteres" + " cadena_original " + num_caracteres + " caracteres.");

   System.out.print("Desde que caracter desea obtener la nueva cadena?");
   desde = entrada.nextInt();


   System.out.print("Hasta que caracter desea obtener la nueva cadena?");
   hasta = entrada.nextInt();


  cad_substraccion = cad_original.substring(desde,hasta);
  System.out.println("La nueva cadena es " +  cad_substraccion);
  

  
 }
}