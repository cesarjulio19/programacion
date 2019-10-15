public class ejercicio7_5{
  
  public static void main(String[] args){
    int a;
    int b = 5647;
    
   for(int i = 0; i<4;i++){
     
     System.out.println("introduce la conbinacion de 4 digitos de la caja fuerte.Solo tienes 4 intentos");
     a = Integer.parseInt(System.console().readLine());
     
     if(a==b){
       
       System.out.println("La conbinacion es correcta");
       i =4;
       
     }else{
       
       System.out.println("La conbinacion no es correcta,vuelve a intentarlo.");
       
     }
   }
 }
}
     
