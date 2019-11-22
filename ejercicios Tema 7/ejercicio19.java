public class ejercicio19{
	
  public static void main (String[] args) {
    int[] original=new int[12];
    int cont=0;
    int num;
    int pos;
    for(int i=0;i<12;i++){
      original[i]=(int)(Math.random()*201);
    }
    System.out.println("");
    System.out.println("Indice");
    for(int j=0;j<12;j++){
      System.out.printf("%3d ",j);
    }
    System.out.println("");
    System.out.println("Valor");
    for(int s=0;s<12;s++){
      System.out.printf("%3d ",original[s]);
    }
    System.out.println("introduce el numero que quieres insertar: ");
    num=Integer.parseInt(System.console().readLine());
    System.out.println("introduce la posicion(0-11): ");
    pos=Integer.parseInt(System.console().readLine());
    
    for(int i=11;i>pos;i--){
      
      original[i]=original[i-1];
    }
    original[pos]=num;
    
    System.out.println("");
    System.out.println("Indice");
    for(int j=0;j<12;j++){
      System.out.printf("%3d ",j);
    }
    System.out.println("");
    System.out.println("Valor");
    for(int s=0;s<12;s++){
      System.out.printf("%3d ",original[s]);
    }
  }
}
    
    
      
      
        
          
        
    
    
    
    
    
        
    
  


