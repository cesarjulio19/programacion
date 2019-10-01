public class ejercicio4_4{
  
  public static void main(String[] args){
  
  
    int salario_sem;
    int horas_sem;
    
    System.out.println("introduce las horas a la semana: ");
    
    horas_sem = Integer.parseInt(System.console().readLine());
    
   if(horas_sem <= 40 && horas_sem >= 0){
     
   salario_sem = horas_sem*12;
   
   System.out.println("el salario semanal seria: "+ salario_sem);
   
 }else{
   
   if(horas_sem >= 41 && horas_sem <= 120){
     
     salario_sem = (40*12)+((horas_sem - 40)*16);
     System.out.println("el salario seria: "+salario_sem);
     
   }else{
     
     System.out.println("has introducido mas horas de las que puedes ya que suponemos que el sabado y el domingo no se trabaja");
     
   }
 }
}
 }
 
