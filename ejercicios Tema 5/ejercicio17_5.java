import java.util.Scanner;
public class ejercicio17_5{
  
  public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int num;
    int suma=0;
    do{
      System.out.println("introduce un numero,recuerda que tiene que ser positivo: ");
      num=x.nextInt();
      
    }while(num<0);
    num++;
    
    for(int i=0;i<100;i++){
      suma=suma+num;
      num++;
    }
    System.out.println("la suma de los 100 primeros numeros es: "+suma);
  }
}
      
