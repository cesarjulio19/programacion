public class ejercicio16{
	
  public static void main (String[] args) {
    
    int[] array=new int[20];
    
    int num;
    
    for(int i=0;i<20;i++){
      array[i]=(int)(Math.random()*401);
      System.out.print(array[i]+" ");
    }
    System.out.println("");
    System.out.print("Introduce el numero el cual quieres resaltar sus multiplos: ");
    num=Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.println("el array seria: ");
    
    for(int i=0;i<20;i++){
      if(array[i]%num==0){
        System.out.print("["+array[i]+"] ");
      }else{
        System.out.print(array[i]+" ");
      }
    }
  }
}
