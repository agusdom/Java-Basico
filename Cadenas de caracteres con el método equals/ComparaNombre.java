import java.util.*;

public class ComparaNombre{
  public static void main(String args[]){
  Scanner entrada = new Scanner(System.in);
  String nom1 = "" , nom2 = "";
  System.out.print("Ingrese valor para nom1:");
  nom1 = entrada.nextLine();
  System.out.print("Ingrese valor para nom2:");
  nom2 = entrada.nextLine();
  if(nom1.equalsIgnoreCase(nom2)){
  System.out.println("Los nombre son iguales");
  }else{
  System.out.println("Los nombre no son iguales");
  }
 }
}