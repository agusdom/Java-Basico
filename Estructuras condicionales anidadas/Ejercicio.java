import java.util.*;

public class Ejercicio{
 public static void main(String args[]){
   int operacion;
   float numero_uno;
   float numero_dos;
   float resultado;
   Scanner entrada = new Scanner(System.in);
System.out.println("Ingrese valor para operacion:");
     operacion = entrada.nextInt();
         if(operacion == 1){
    System.out.println("Ingrese valor para numero_uno:");
    numero_uno = entrada.nextInt();
    System.out.println("Ingrese valor para numero_dos:");
    numero_dos = entrada.nextFloat();
    resultado = numero_uno + numero_dos;
    System.out.println("El resultado de la suma es:" + resultado);
   }else if(operacion == 2){
    System.out.println("Ingrese valor para numero_uno:");
    numero_uno = entrada.nextInt();
    System.out.println("Ingrese valor para numero_dos:");
    numero_dos = entrada.nextFloat();
    resultado = numero_uno - numero_dos;
    System.out.println("El resultado de la resta es:" + resultado);
   }else if(operacion == 3){
    System.out.println("Ingrese valor para numero_uno:");
    numero_uno = entrada.nextInt();
    System.out.println("Ingrese valor para numero_dos:");
    numero_dos = entrada.nextFloat();
    resultado = numero_uno * numero_dos;
    System.out.println("El resultado de la multiplicación es:" + resultado);
    }else if(operacion == 4){
    System.out.println("Ingrese valor para numero_uno:");
    numero_uno = entrada.nextInt();
    System.out.println("Ingrese valor para numero_dos:");
    numero_dos = entrada.nextFloat();
    resultado = numero_uno / numero_dos;
    System.out.println("El resultado de la suma es:" + resultado);
    }else{
    System.out.println("La operacion elegida no existe");  
    }
  }
}