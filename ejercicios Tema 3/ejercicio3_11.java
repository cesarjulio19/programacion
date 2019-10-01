public class ejercicio3_11{
  
  public static void main(String[] args){
    double MB;
    double KB;
    
    System.out.println("introduce el numero de KB: ");
    
    KB = Double.parseDouble(System.console().readLine());
    
    MB = KB/1024;
    
    System.out.println(KB+" KB son: "+MB+" MB");
  }
}

