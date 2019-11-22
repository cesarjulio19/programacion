public class ejercicio3{
	
  public static void main (String[] args) {
    int[] x=new int[10];
    for(int i=0;i<10;i++){
      System.out.println("introduce la posicion "+(i+1)+" del array");
      x[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.println("el array mostrado al reves seria: ");
    for(int j=9;j>=0;j--){
      System.out.print(x[j]+" ");
    }
  }
}
    
