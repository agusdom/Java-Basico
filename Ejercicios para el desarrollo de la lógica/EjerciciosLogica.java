public class EjerciciosLogica{
  public static void main(String args[]){
   int i = 1;
   int z = 99;
   System.out.println("Ciclo For");
   for(i=1;i<10;i++){
   System.out.print(i + ",");
   }
   System.out.print(i);
   System.out.println("");
      for(i=1;i<=5;i++){
      if(i<5){
   System.out.print(i + ",");
   System.out.print(z + ",");
    }else{
       System.out.print(i + ",");
       System.out.print(z);
    }
   z--;
   }
   System.out.println("");
   System.out.println("Ciclo While");
   i = 1;
   while(i<10){
   System.out.print(i+",");
   i++;
   }
   System.out.print(i);
   System.out.println("");
   i = 1;
   z = 99;
     while(i<=10 && z>95){
   System.out.print(i + ",");
   System.out.print(z + ",");
   i++;
   z--;
   }
   System.out.print(i + ",");
   System.out.print(z);
   System.out.println("");
   i = 1;
   z = 99;
   
  System.out.println("Ciclo Do-while");
  do{
   System.out.print(i + ",");
   i++;
  }while(i<10);
   System.out.print(i);
  System.out.println("");
   i = 1;
   z = 99;
  do{
   System.out.print(i + ",");
   System.out.print(z + ",");
   i++;
   z--;
  }while(i<=10 && z>95);
   System.out.print(i + ",");
   System.out.print(z);
  System.out.println("");
 }
}