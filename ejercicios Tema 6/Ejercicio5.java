public class Ejercicio5{
	
  public static void main (String[] args) {
    int num;
    int sum=0;
    double media;
    int max=100;
    int min=199;
    
    for(int i=0;i<50;i++){
      num=(int)(Math.random()*100)+100;
      sum=sum+num;
      if(num<min){
        min=num;
      }else{
      if(num>max){
        max=num;
      }
    }
      System.out.print(num+" ");
  }
  media=(double)sum/(double)50;
  System.out.println("");
  System.out.println("el maximo es: "+max);
  System.out.println("el minimo es: "+min);
  System.out.println("la media es: "+media);
 }
}

        
        
        
      
