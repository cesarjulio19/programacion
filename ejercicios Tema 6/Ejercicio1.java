public class Ejercicio1{
	
  public static void main (String[] args) {
    int suma=0;
    int tirada;
    System.out.println("tirada de tres dados");
    
    for(int i=1;i<=3;i++){
      tirada=(int)(Math.random()*6)+1;
      System.out.print(tirada+" ");
      suma=suma+tirada;
    }
    System.out.println("la suma de las tiradas es: "+suma);
  }
}

