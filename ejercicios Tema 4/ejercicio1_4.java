public class ejercicio1_4{
  
  public static void main(String[] args){
    
    String DiaSem;
    
    System.out.println("introduce un dia de la semana y diremos cual es la primera asignatura del dia ");
    
    DiaSem = System.console().readLine();
    
    switch (DiaSem) {
      
      case "lunes":
        System.out.println("EDD");
        break;
      case "martes":
        System.out.println("PRO");
        break;
      case "miercoles":
        System.out.println("PRO");
        break;
      case "jueves":
        System.out.println("PRO");
        break;
      case "viernes":
        System.out.println("FOL");
        break;
      default:
        System.out.println("el sabado y el domingo no es un dia laboral");
      }
    }
  }
        
