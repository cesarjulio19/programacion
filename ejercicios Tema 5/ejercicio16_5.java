import java.util.Scanner;
public class ejercicio16_5{
  
  public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int num;
    System.out.println("introduce el numero: ");
    num = x.nextInt();
    boolean primo = false;
    for(int i=2;i<num;i++){
      if(num%i ==0){
        i=num;
      }else{
        primo = true;
      }
    }
    if(primo == true){
      System.out.println(num+" es primo");
    }else{
      System.out.println(num+" no es primo");
    }
  }
}

