public class ejercicio3_10{
  
  public static void main(String[] args){
    double MB;
    double KB;
    
    System.out.println("introduce el numero de MB: ");
    
    MB = Double.parseDouble(System.console().readLine());
    
    KB = MB*1024;
    
    System.out.println(MB+" MB son: "+KB+" KB");
  }
}
