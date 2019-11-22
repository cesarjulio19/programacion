public class ejercicio9{
	
  public static void main (String[] args) {
    int[] numero=new int[8];
    
    for(int i=0;i<8;i++){
      System.out.println("introduce el "+(i+1)+" numero entero: ");
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    
    for(int j=0;j<8;j++){
      if((numero[j]%2)==0){
        System.out.println(numero[j]+" par");
      }else{
        
          System.out.println(numero[j]+" impar");
      }
    }
  }
}


