public class ejercicio3_9{
  
  public static void main(String[] args){
    
    double r;
    double h;
    double V;
    
    System.out.println("introduce el radio y la altura de un cono: ");
    
    r = Double.parseDouble(System.console().readLine());
    h = Double.parseDouble(System.console().readLine());
    
    V = (3.14*(r*r)*h)/3;
    
    System.out.println("el volumen del cono es: "+ V);
    
  }
}
