public class ejercicio3_6{
  
  public static void main(String[] args){
    
    double base;
    double altura;
    double area;
    
    System.out.println("introduce la base y la altura de un triangulo: ");
    
    base = Double.parseDouble(System.console().readLine());
    altura = Double.parseDouble(System.console().readLine());
    
    area = (base*altura)/2;
    
    System.out.println(" el area del triangulo seria: "+ area);
    
  }
}
