public class ejercicio20{
	
  public static void main (String[] args) {
    String[] rey;
    int num;
    int cont=1;
    
    System.out.println("introduce el numero de reyes: ");
    num=Integer.parseInt(System.console().readLine());
    rey=new String[num];
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    
    for(int i=0;i<num;i++){
      rey[i]=System.console().readLine();
    }
    
    for(int i=0;i<num;i++){
      for(int j=0;j<i;j++){
        if(rey[i].equals(rey[j])){
          cont++;
        }
      }
      System.out.println(rey[i]+cont+"º");
      cont=1;
    }
  }
}
      
      
    
