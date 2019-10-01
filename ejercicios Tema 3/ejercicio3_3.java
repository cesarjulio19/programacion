public class ejercicio3_3{
  
  public static void main(String[] args){

double euros;
    double pesetas;
    
    System.out.println("introduce una cantidad en pesetas: ");
    
   pesetas = Double.parseDouble(System.console().readLine());
   euros = pesetas * 0.006;
    
    System.out.println("la conversion seria: "+euros);
    
  }
}
