public class ejercicio14{
	
  public static void main (String[] args) {
    String[] color=new String[9];
    String[] original=new String[8];
    String[] fin=new String[8];
    int j=0;
    int cont=0;
    color[0]="verde";
    color[1]="rojo";
    color[2]="azul";
    color[3]="amarillo";
    color[4]="naranja";
    color[5]="rosa";
    color[6]="negro";
    color[7]="blanco";
    color[8]="morado";
    System.out.println("introduce palabras en el array,incluido colores(verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.)");
    for(int i=0;i<8;i++){
      System.out.println("introduce la palabra de la posicion "+i+" del array");
      original[i]=System.console().readLine();
    
    
      for(String c : color){
        if(original[i].equals(c)){
          fin[j++]=c;
        }
      }
    }
    
    for(int i=0;i<8;i++){
      boolean esColor=false;
      
      for(String c : color){
        
        if(original[i].equals(c)){
          esColor=true;
        }
      }
      if(!esColor){
        fin[j++]=original[i];
        
      }
    }
    System.out.println("este seria el array final");
    
    
    for(int i=0;i<8;i++){
      
      System.out.print(fin[i]+" ");
    }
  }
}
    
    
    
    
    
    
    
      
      
    
  
