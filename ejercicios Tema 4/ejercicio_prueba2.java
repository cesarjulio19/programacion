public class ejercicio_prueba2{
  
  public static void main(String[] args){
    int numero1;
    int numero2;
    
    System.out.println("introduce 2 numeros");
    
    numero1 = Integer.parseInt(System.console().readLine());
    numero2 = Integer.parseInt(System.console().readLine());
    
    if((numero1%2 == 0) && (numero2%2==0)){
      
      System.out.println("los dos numeros son pares");
      
    }else{
      
    System.out.println("uno o los 2 numeros no son pares");  
    
    }
  }
}
