public class ejercicio_prueba3{
  
  public static void main(String[] args){
    
    int numero;
    
    System.out.println("indica digito del 0-2");
    numero = Integer.parseInt(System.console().readLine());
    
    switch(numero){
      case 0:
        System.out.println("zero");
         break;
      case 1:
        System.out.println("one");
         break;
       case 2:
        System.out.println("two");
         break;
      default:
      System.out.println("introduce un numero del 0-2");
      
       
         
       }
    
    
  }
}
