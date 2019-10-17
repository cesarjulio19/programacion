import java.util.Scanner;
public class ejercicio15_5{
  
  public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int base;
    int exponente;
    System.out.println("introduce la base: ");
    base = x.nextInt();
    System.out.println("introduce el exponente: ");
    exponente = x.nextInt();
    
    for(int i=1;i<=exponente;i++){
      System.out.print(base+"^"+i+"  ");
      
    }
  }
}
    
