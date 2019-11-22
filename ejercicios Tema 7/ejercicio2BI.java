public class ejercicio2BI {
	
  public static void main (String[] args) {
   
   int[][] num=new int[4][5];
   int sumaT=0;
   int sumaF=0;
   int sumaC=0;
   System.out.println("introduce numeros en el array: ");
   for(int i=0;i<4;i++){
     for(int k=0;k<5;k++){
    num[i][k]=Integer.parseInt(System.console().readLine());
       }
     }

       
   
   for(int i=0;i<4;i++){
     for(int k=0;k<5;k++){
      sumaT=sumaT+num[i][k];
      sumaF=sumaF+num[i][k];
      System.out.print(num[i][k]+" ");
      
    }
    System.out.print("| ");
    
    System.out.print(sumaF);
    sumaF=0;
    System.out.println("");
  }
  System.out.print("--------------------------");
  System.out.println("");
  for(int i=0;i<5;i++){
    for(int k=0;k<4;k++){
      sumaC=sumaC+num[k][i];
    }
    System.out.print(sumaC+" ");
    sumaC=0;
  }
  System.out.print("| ");
  System.out.print(sumaT);
    
  
 }
}
          
        
