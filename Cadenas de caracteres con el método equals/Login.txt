import java.util.*;

public class Login{
  public static void main(String args[]){
  Scanner entrada = new Scanner(System.in);
  String User = "" , Pass = "";
  System.out.print("Ingrese su usuario:");
  User = entrada.nextLine();
  System.out.print("Ingrese su password:");
  Pass = entrada.nextLine();
  if(User.equals("Agusdom") && Pass.equals("agusdom2k142")){
  System.out.println("Login correcto");
  }else{
  System.out.println("El User o el Pass es incorrecto");
  }
 }
}