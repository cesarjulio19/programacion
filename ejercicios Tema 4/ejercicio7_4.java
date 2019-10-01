public class ejercicio7_4{
  
  public static void main(String[] args){
    
    double a;
    double b;
    double c;
    double m;
    
    System.out.println("programa que realiza la media de 3 notas");
    System.out.println("introduce el valor de las 3 notas");
    
    a = Double.parseDouble(System.console().readLine());
    b = Double.parseDouble(System.console().readLine());
    c = Double.parseDouble(System.console().readLine());
    
    if(a<0 || b<0 || c<0){
      
      System.out.println("las notas no pueden ser negativas");
      
    }else{
      
      m=(a+b+c)/3;
      System.out.println("la nota media es: "+m);
    }
  }
}
      
      


    
