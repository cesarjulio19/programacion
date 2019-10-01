public class ejercicio2_4{
  
  public static void main(String[] args){
    
    int hora;
    
    System.out.println("introduce una hora del dia(solo la hora,no minutos)");
    
        hora = Integer.parseInt(System.console().readLine());
        
      if(hora >= 6 && hora <= 12){
        
       System.out.println("buenos dias");
       
      }else{
        
      if(hora >= 13 && hora <=20){
        
        System.out.println("buenas tardes");
        
      }else{
        
        if(hora >= 21 || hora <=5){
        
        System.out.println("buenas noches");
        
      }else{
        System.out.println("no has introducido una hora");
        
        
      }
    }
  }
}
}
        
        
        
        
        
        

