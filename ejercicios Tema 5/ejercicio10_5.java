public class ejercicio10_5{
  
  public static void main(String[] args){
    int a;
    int suma = 0;
    int c =0;
    
    do{
      
       System.out.println("introduce un numero: ");
          a = Integer.parseInt(System.console().readLine());
          if(a>=0){
          suma = suma + a;
          c++;
        }else{
          System.out.println("la media seria: "+suma/c);
          
        }
          
      }while(a>=0);
        
        
    }
  }
  
