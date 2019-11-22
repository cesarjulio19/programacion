public class ejercicio10{
	
  public static void main (String[] args) {
    int[] numero=new int[20];
    int[] aux=new int[20];
    int cont=0;
    
    
    for(int i=0;i<20;i++){
      numero[i]=(int)(Math.random()*99)+1;
      if(numero[i]%2==0){
        aux[cont]=numero[i];
        cont++;
      }
    }
    
    for(int j=0;j<20;j++){
      if((numero[j]%2)==1){
        aux[cont]=numero[j];
        cont++;
      }
    }
    for(int k=0;k<20;k++){
      System.out.print(numero[k]+" ");
  }
  System.out.println("");
    for(int k=0;k<20;k++){
      System.out.print(aux[k]+" ");
  }
 }
}
    
    
    
