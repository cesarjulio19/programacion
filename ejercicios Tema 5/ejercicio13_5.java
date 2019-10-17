import java.util.Scanner;
public class ejercicio13_5{
  
  public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int a;
    int cp=0;
    int cn=0;
    System.out.println("Escribe 10 numeros y te diremos si es positivo o negativo");
    
    for(int i =1;i<=10;i++){
      
      System.out.println("introduce un numero: ");
      a=x.nextInt();
      if(a<0){
       cn++;
      }else{
        cp++;
      }
      
    }
    System.out.println("de los 10 numeros "+cn+" son negativos y "+cp+" son positivos");
  }
}

