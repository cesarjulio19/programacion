public class ejercicio17{
	
  public static void main (String[] args) {
    int[] array=new int[10];
    int[] aux=new int[10];
    int num;
    boolean esta=false;
    
    for(int i=0;i<10;i++){
      array[i]=(int)(Math.random()*100)+1;
      System.out.print(array[i]+" ");
    }
    
    do{
      System.out.println("\nIntroduce un numero entre el 0 y el 100 que este en el array: ");
      num=Integer.parseInt(System.console().readLine());
      for(int i=0;i<10;i++){
        if(array[i]==num){
          esta=true;
        }
      }
    }while(!esta);
    
    for(int i=0;i<10;i++){
      if(i==9){
        aux[0]=array[9];
      }else{
        aux[i+1]=array[i];
      }
    }
    
  while((aux[0]!=num) && (array[0]!=num)){
    for(int i=0;i<10;i++){
      if(i==9){
        array[0]=aux[i];
      }else{
      array[i+1]=aux[i];
    }
  }
  if(array[0]!=num){
    for(int i=0;i<10;i++){
      if(i==9){
        aux[0]=array[i];
      }else{
      aux[i+1]=array[i];
      }
     }
    }
   }
   
   if(aux[0]==num){
     System.out.println("el array resultante seria: ");
     for(int i=0;i<10;i++){
       System.out.print(aux[i]+" ");
     }
   }else{
    for(int i=0;i<10;i++){
      System.out.print(array[i]+" ");
    }
  }
 }
}
   
   

     
    
      
      
    
        
    
  


