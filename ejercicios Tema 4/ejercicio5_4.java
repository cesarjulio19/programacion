public class ejercicio5_4{
  
  public static void main(String[] args){

  double a;
  double b;
  double x; 

System.out.println("Realiza la ecuacion ax + b = 0 ");
System.out.println("introduce los valores de a y b : ");

a = Double.parseDouble(System.console().readLine());
b = Double.parseDouble(System.console().readLine());

x = (-b)/a;

if(a ==0){
  
  System.out.println("la ecuacion no tiene resultado ");
  
}else{
  
System.out.println("la ecuacion tiene como resultado x = "+x); 

}

}
} 







  
  
