import java.util.*;
public class Operaciones{
  public static void main(String args[]){
   int opcion;
   Float num_uno,num_dos,resultado;
   Scanner entrada = new Scanner(System.in);

  System.out.println("Ingrese la opcion ha elegir:1-Suma,2-Resta,3-Multiplicacion,4-Division");
  opcion = entrada.nextInt();

  switch(opcion){
  case 1:
    System.out.println("Ingrese el valor para num_uno");
    num_uno = entrada.nextFloat();
    System.out.println("Ingrese el valor para num_dos");
    num_dos = entrada.nextFloat();
    resultado = num_uno + num_dos;
    System.out.println("El resultado de la suma es:" + resultado);
  break;
  case 2:
    System.out.println("Ingrese el valor para num_uno");
    num_uno = entrada.nextFloat();
    System.out.println("Ingrese el valor para num_dos");
    num_dos = entrada.nextFloat();
    resultado = num_uno - num_dos;
    System.out.println("El resultado de la resta es:" + resultado);
  break;
  case 3:
    System.out.println("Ingrese el valor para num_uno");
    num_uno = entrada.nextFloat();
    System.out.println("Ingrese el valor para num_dos");
    num_dos = entrada.nextFloat();
    resultado = num_uno * num_dos;
    System.out.println("El resultado de la multiplicacion es:" + resultado);
  break;
  case 4:
    System.out.println("Ingrese el valor para num_uno");
    num_uno = entrada.nextFloat();
    System.out.println("Ingrese el valor para num_dos");
    num_dos = entrada.nextFloat();
    resultado = num_uno / num_dos;
    System.out.println("El resultado de la division es:" + resultado);
  break;
  default:
  System.out.println("La opcion ingresada es incorrecta");
  break;
  }
 } 
}