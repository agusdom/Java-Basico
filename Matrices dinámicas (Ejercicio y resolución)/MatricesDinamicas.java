import java.util.*;
public class MatricesDinamicas{
  public static void main(String args[]){
  int filas,columnas,contador = 1;
  Scanner entrada = new Scanner(System.in);
  System.out.println("Ingrese la cantidad de filas que desea en la matriz?");
  filas = entrada.nextInt();
  System.out.println("Ingrese la cantidad de columnas que desea en la matriz?");
  columnas = entrada.nextInt();
  int matriz[][] = new int[filas][columnas];

  for(int i=0;i<filas; i++){
    for(int j=0;j<columnas; j++){
  matriz[i][j]=contador;
  contador++;
  System.out.print("["+ matriz[i][j] +"]");
  }
  System.out.println("");
  }
 }
}