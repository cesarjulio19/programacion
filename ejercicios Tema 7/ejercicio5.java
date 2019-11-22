public class ejercicio5{
	
  public static void main (String[] args) {
    int[]numero=new int[10];
    int max=0;
    int min=0;
    for(int i=0;i<10;i++){
      System.out.println("introduce la posicion "+(i+1)+" del array");
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    max=numero[0];
    min=numero[0];
    
    for(int j=1;j<=9;j++){
      if(numero[j]>max){
        max=numero[j];
      }else{
        if(numero[j]<min){
          min=numero[j];
        }
      }
    }
    for(int k=0;k<10;k++){
      if(numero[k]==max){
        System.out.println(numero[k]+ " maximo");
      }else{
        if(numero[k]==min){
          System.out.println(numero[k]+" minimo");
        }else{
          System.out.println(numero[k]);
        }
      }
    }
  }
}
    
    
    
    
