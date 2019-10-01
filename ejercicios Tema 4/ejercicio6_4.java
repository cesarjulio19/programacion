public class ejercicio6_4{
  
  public static void main(String[] args){
    
    double t;
    double h;
    double g = 9.81;
    double x;
    
    System.out.println("programa que calcula el tiempo que tardará en caer un objeto desde una altira h");


System.out.println("introduce el valor de h: ");

h = Double.parseDouble(System.console().readLine());

x = (2*h)/g;

t = Math.sqrt(x);

if (x < 0){
  
  System.out.println("no tiene solucion");
  
}else{
  
  System.out.println(" el tiempo sera: "+t);
  
}
}
}


