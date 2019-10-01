public class ejercicio3_2{
  
  public static void main(String[] args){
    
    double euros;
    double pesetas;
    
    System.out.println("introduce una cantidad en euros: ");
    
   euros = Double.parseDouble(System.console().readLine());
   pesetas = euros * 166.386;
    
    System.out.println("la conversion seria: "+pesetas);
    
  }
}

