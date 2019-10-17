import java.util.Scanner;
public class ejercicio14_5{
  
  public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int base;
    int exponente;
    int resultado =1;;
    System.out.println("introduce la base: ");
    base=x.nextInt();
    System.out.println("introduce el exponente: ");
    exponente=x.nextInt();
   
    
    for(int a=1;a<=exponente;a++){
      
      resultado = resultado*base;
      
    }
    System.out.println("la potencia es: "+resultado);
  }
}

    
    
