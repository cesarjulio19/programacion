public class ejercicio3_5{
  
  public static void main(String[] args){
    
    double base;
    double altura;
    double area;
    
    System.out.println("introduce la base y la altura de un rectangulo: ");
    
    base = Double.parseDouble(System.console().readLine());
    altura = Double.parseDouble(System.console().readLine());
    
    area = base*altura;
    
    System.out.println(" el area del rectangulo seria: "+ area);
    
  }
}
    
    
    
    
