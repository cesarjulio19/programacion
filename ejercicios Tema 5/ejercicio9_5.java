public class ejercicio9_5{
  
  public static void main(String[] args){
    
    int n;
    int c = 0;
    int i =1;
    System.out.println("introduce un numero: ");
    n = Integer.parseInt(System.console().readLine());
    
    do{
      
      i = i*10;
      c++;
      
    }while(n>=i);
    
    System.out.println(c);
  }
}
    
    
      
      
    
    
