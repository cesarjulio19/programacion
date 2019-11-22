public class ejercicio13{
	
  public static void main (String[] args) {
    int[] numero=new int[100];
    int max=0;
    int min=500;
    int pregunta;
    
     for(int i=0;i<100;i++){
      numero[i]=(int)(Math.random()*501);
      if(numero[i]>max){
        max=numero[i];
      }else{
        if(numero[i]<min){
          min=numero[i];
        }
      }
      System.out.print(numero[i]+" ");
    }
    System.out.println("");
    
      
      System.out.println("introduce si quieres desacartar: ");
      System.out.println("1-minimo"+"("+min+")");
      System.out.println("2-maximo"+"("+max+")");
      pregunta=Integer.parseInt(System.console().readLine());
    
    
    if(pregunta==1){
      for(int k=0;k<100;k++){
        if(numero[k]==min){
          System.out.print("**"+numero[k]+"** ");
        }else{
          System.out.print(numero[k]+" ");
        }
      }
    }else{
      for(int j=0;j<100;j++){
        if(numero[j]==max){
          System.out.print("**"+numero[j]+"** ");
        }else{
          System.out.print(numero[j]+" ");
        }
      }
    }
  }
}
      
    
    
    
