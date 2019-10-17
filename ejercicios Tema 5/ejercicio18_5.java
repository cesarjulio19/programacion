import java.util.Scanner;
public class ejercicio18_5{
  
  public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int a;
    int b;
    int menor;
    int mayor;
    do{
    System.out.println("introduce dos numeros enteros que no sean iguales: ");
    a=x.nextInt();
    b=x.nextInt();
  }while(a==b);
    
    if(a<b){
      menor=a;
      mayor=b;
    }else{
      menor=b;
      mayor=a;
    }
    System.out.println("");
    for(int i = menor+7;i<mayor;i=i+7){
      System.out.print(i+" ");
    }
  }
}

