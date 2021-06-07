import java.util.*;

public class Vacaciones{
  public static void main(String args[]){
   Scanner entrada = new Scanner(System.in);
   int clave = 0,antiguedad = 0;
   String nombre = "";

   System.out.println("----------------------------------------------------");
   System.out.println("-- Bienvenidos al sistema vacacional de Coca Cola --");  
   System.out.println("----------------------------------------------------");

   System.out.println("Ingrese su nombre:");
   nombre = entrada.nextLine();

   System.out.println("Ingrese su clave:");
   clave  = entrada.nextInt();

   System.out.println("Ingrese su antiguedad:");
   antiguedad  = entrada.nextInt();
  if(clave == 1){
   if(antiguedad<1){
   System.out.println("El empleado " + nombre + " no tiene derecho a vacaciones.");
   }else if(antiguedad == 1){
   System.out.println("El empleado " + nombre + " tiene derecho a 6 dias de vacaciones.");
   }else if(antiguedad>2 && antiguedad<=6){
   System.out.println("El empleado " + nombre + " tiene derecho a 14 dias de vacaciones.");
   }else if(antiguedad>7){
   System.out.println("El empleado " + nombre + " tiene derecho a 20 dias de vacaciones.");
    }    
   }else if(clave == 2){
   if(antiguedad<1){
   System.out.println("El empleado " + nombre + " no tiene derecho a vacaciones.");
   }else if(antiguedad == 1){
   System.out.println("El empleado " + nombre + " tiene derecho a 7 dias de vacaciones.");
   }else if(antiguedad>2 && antiguedad<=6){
   System.out.println("El empleado " + nombre + " tiene derecho a 14 dias de vacaciones.");
   }else if(antiguedad>7){
   System.out.println("El empleado " + nombre + " tiene derecho a 22 dias de vacaciones.");
    }    
   }else if(clave == 3){
   if(antiguedad<1){
   System.out.println("El empleado " + nombre + " no tiene derecho a vacaciones.");
   }else if(antiguedad == 1){
   System.out.println("El empleado " + nombre + " tiene derecho a 10 dias de vacaciones.");
   }else if(antiguedad>2 && antiguedad<=6){
   System.out.println("El empleado " + nombre + " tiene derecho a 20 dias de vacaciones.");
   }else if(antiguedad>7){
   System.out.println("El empleado " + nombre + " tiene derecho a 30 dias de vacaciones.");
    }    
   }else{
     System.out.println("La clave ingresada no es correcta.");
  }
 }
}