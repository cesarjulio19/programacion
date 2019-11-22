public class ejercicio6{
	
  public static void main (String[] args) {
 int[] numero=new int[15];
 int[] ayuda =new int[15];
 
 for(int i=0;i<15;i++){
      System.out.println("introduce la posicion "+(i+1)+" del array");
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    for(int j=0;j<15;j++){
      if(j==14){
        ayuda[0]=numero[14];
      }else{
      ayuda[j+1]=numero[j];
    }
  }
  for(int k=0;k<15;k++){
    System.out.print(ayuda[k]+" ");
  }
 }
}
    
