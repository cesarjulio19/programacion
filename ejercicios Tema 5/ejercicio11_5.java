public class ejercicio11_5{
  
  public static void main(String[] args){
    int a;
    System.out.println("introduce un numero: ");
    a = Integer.parseInt(System.console().readLine());
    
    for(int i = 1;i<=5;i++){
      
      a++;
      
      System.out.printf("%-5d %-5d %-5d\n",a,(a*a),(a*a*a));
    }
  }
}

