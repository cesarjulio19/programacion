public class ejercicio_prueba{
  
  public static void main(String[] args){
    
    int numero;
    int resto;
    
    System.out.println("introduce un numero entero,despues te diremos si es par o impar: ");
    
    numero = Integer.parseInt(System.console().readLine());
    resto = numero % 2;
    
    if(resto == 0){
      
      System.out.println(numero+" es par");
      
    } else {
      
      System.out.println(numero+" es impar");
      
    }
    
  }
  
}
  
      
      
      
      
    
    
