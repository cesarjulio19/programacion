public class ejercicio3_8{
  
  public static void main(String[] args){
    
    int horas_dia;
    int salario_sem;
    int horas_sem;
    
    System.out.println("introduce las horas al dia: ");
    
    horas_dia = Integer.parseInt(System.console().readLine());
    
   horas_sem = horas_dia*5;
   salario_sem = horas_sem*12;
   
   System.out.println("el salario semanal seria: "+ salario_sem);
   
 }
}
    
