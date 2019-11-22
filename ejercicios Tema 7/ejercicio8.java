public class ejercicio8{
	
  public static void main (String[] args) {
    
    int[] temperatura=new int[12];
    
    for(int i=0;i<12;i++){
      System.out.println("introduce la temperatura media de cada mes: ");
      temperatura[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.println("el diagrama de barras seria: ");
    for(int j=0;j<12;j++){
      
      for(int k=0;k<temperatura[j];k++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}

        
