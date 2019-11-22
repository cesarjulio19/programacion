
public class ejercicio4BI {
  public static void main (String[] args) {
   throws InterruptedException;
   int[][] num=new int[4][5];
   int sumaT=0;
   int sumaF=0;
   int sumaC=0;
   
   for(int i=0;i<4;i++){
     for(int k=0;k<5;k++){
      num[i][k]=(int)(Math.random()*899)+100;
      sumaT=sumaT+num[i][k];
      sumaF=sumaF+num[i][k];
      System.out.print(num[i][k]+" ");
      
    }
    System.out.print("| ");
    Thread.sleep(100);
    System.out.print(sumaF);
    Thread.sleep(100);
    sumaF=0;
    System.out.println("");
  }
  System.out.print("--------------------------");
  System.out.println("");
  for(int i=0;i<5;i++){
    for(int k=0;k<4;k++){
      sumaC=sumaC+num[k][i];
    }
    Thread.sleep(100);
    System.out.print(sumaC+" ");
    Thread.sleep(100);
    sumaC=0;
  }
  System.out.print("| ");
  Thread.sleep(100);
  System.out.print(sumaT);
    
  
 }
}
      
       
