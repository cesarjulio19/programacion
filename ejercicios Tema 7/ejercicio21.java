public class ejercicio21{
	
  public static void main (String[] args) {
    int[] array=new int[15];
    
    System.out.println("Array original:");
    for(int i=0;i<15;i++){
      array[i]=(int)(Math.random()*501);
      System.out.print(array[i]+" ");
    }
     for(int k=0;k<15;k++){
       if(array[k]%5!=0){
         do{
           array[k]=array[k]+1;
           
         }while(array[k]%5!=0);
       }
     }
     System.out.println("");
     System.out.println("Array final:");
     
     for(int i=0;i<15;i++){
       System.out.print(array[i]+" ");
     }
   }
 }
 
       

      
