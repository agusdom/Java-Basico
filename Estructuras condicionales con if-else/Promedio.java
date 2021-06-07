public class Promedio{
  public static void main(String args[]){
   
  float biologia = 5;
  float matematicas = 5;
  float quimica = 7;

  float promedio = 0;

 promedio = (biologia + matematicas + quimica) / 3;

 if(promedio>= 6) System.out.println("Has aprobado con un promedio de:" + promedio);
 else System.out.println("Has reprobado con un promedio de:" + promedio);
   
 }
}