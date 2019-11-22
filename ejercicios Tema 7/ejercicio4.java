public class ejercicio4{
	
  public static void main (String[] args) {
    int[] numero=new int[20];
    int[] cuadrado=new int[20];
    int[] cubo=new int[20];
    
    for(int i=0;i<20;i++){
      numero[i]=(int)(Math.random()*99)+1;
    }
    for(int j=0;j<20;j++){
      cuadrado[j]=(numero[j]*numero[j]);
    }
     for(int k=0;k<20;k++){
      cubo[k]=(numero[k]*numero[k]*numero[k]);
    }
    for(int l=0;l<20;l++){
      System.out.printf("%-10d %-10d %-10d\n",numero[l],cuadrado[l],cubo[l]);
    }
  }
}

    
