public class ejercicio7{
	
  public static void main (String[] args) {
    int[]numero=new int[100];
    int x;
    int y;
    for(int i=0;i<100;i++){
      numero[i]=(int)(Math.random()*21);
      System.out.print(numero[i]+" ");
    }
    System.out.println("");
    System.out.println("introduce 2 valores del 0 al 20");
    x=Integer.parseInt(System.console().readLine());
    y=Integer.parseInt(System.console().readLine());
    
    for(int j=0;j<100;j++){
      if(numero[j]==x){
        System.out.print("'"+y+"' ");
      }else{
        System.out.print(numero[j]+" ");
      }
    }
  }
}
    
