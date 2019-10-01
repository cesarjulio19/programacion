public class ejercicio3_4{
  
  public static void main(String[] args){
    
    int a;
    int b;
    int multiplicacion;
    int suma;
    int resta;
    int division;
    
    System.out.println("introduce 2 numeros enteros");
    
    a = Integer.parseInt(System.console().readLine());
    b = Integer.parseInt(System.console().readLine());
    
    multiplicacion = a*b;
    resta = a-b;
    suma = a+b;
     division = a/b;
    
    System.out.println("la suma,resta,multiplicacion y division son : "+suma+" "+resta+" "+multiplicacion+" "+division);
  }
}
    
