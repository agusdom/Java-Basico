public class Fibonacci{
  public static void main(String args[]){ 
  int a = 0, b = 1, c = 0, i = 0;
  System.out.println("Ciclo For");
  for(i = 0; i<9; i++){
  System.out.print(a + ",");
  c = a + b; 
  a = b;
  b = c;
  }
  System.out.print(a);
  System.out.println("");
  a = 0; b = 1; c = 0; i = 0;
  System.out.println("Ciclo While");
  while(i<9){
  System.out.print(a + ",");
  c = a + b; 
  a = b;
  b = c;
  i++;
  }
  System.out.print(a);
  System.out.println("");
  a = 0; b = 1; c = 0; i = 0;
  System.out.println("Ciclo DoWhile");
  do{
  System.out.print(a + ",");
  c = a + b; 
  a = b;
  b = c;
  i++;
  }while(i<9);
  System.out.print(a);
 }
}