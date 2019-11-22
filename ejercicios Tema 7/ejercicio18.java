public class ejercicio18{
	
  public static void main (String[] args) {
    int[] original=new int[10];
    int[] resultante=new int[10];
    int[] max=new int[10];
    int[] min=new int[10];
    int contM=0;
    int contMi=0;
    int contR=0;
    
    for(int i=0;i<10;i++){
      original[i]=(int)(Math.random()*201);
    }
    System.out.println("Indice");
    for(int j=0;j<10;j++){
      System.out.printf("%3d ",j);
    }
    System.out.println("");
    System.out.println("Valor");
    for(int s=0;s<10;s++){
      System.out.printf("%3d ",original[s]);
    }
    for(int i=0;i<10;i++){
      if(original[i]<=100){
        min[contMi]=original[i];
        contMi++;
      }else{
        max[contM]=original[i];
        contM++;
      }
    }
    
    for(int i=0;i<10;i++){
      if(min[i]!=0){
        resultante[contR]=min[i];
        contR++;
      }
      if(max[i]!=0){
        resultante[contR]=max[i];
        contR++;
      }
    }
    System.out.println("");
    System.out.println("el array resultante es: ");
    
    System.out.println("Indice");
    for(int j=0;j<10;j++){
      System.out.printf("%3d ",j);
    }
    System.out.println("");
    System.out.println("Valor");
    for(int s=0;s<10;s++){
      System.out.printf("%3d ",resultante[s]);
    }
  }
}

      
    

    
          
          
        
      
    
  


