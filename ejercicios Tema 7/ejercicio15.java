public class ejercicio15{
	
  public static void main (String[] args) {
    int[] mesa=new int[10];
    int[] ocupacion=new int[10];
    int cuantos;
    int aux=0;
    for(int i=0;i<10;i++){
      mesa[i]=i+1;
    }
    for(int i=0;i<10;i++){
      ocupacion[i]=(int)(Math.random()*5);
    }
System.out.println("MESA");
for(int i=0;i<10;i++){
      System.out.print(mesa[i]+" ");
    }
    System.out.println("");
    System.out.println("OCUPACION");
for(int i=0;i<10;i++){
      System.out.print(ocupacion[i]+" ");
    }
    do{
      System.out.println("");
      System.out.print("¿cuantos son?introduce -1 para salir del programa");
      cuantos=Integer.parseInt(System.console().readLine());
      if(cuantos>4){
        System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
      }else{
        if(cuantos>=0 && cuantos!=-1){
        while(aux<=9){
          if((ocupacion[aux]+cuantos)<=4){
            ocupacion[aux]=(ocupacion[aux]+cuantos);
            System.out.println("Por favor, siéntense en la mesa número "+(aux+1));
            aux=10;
          }else{
            aux++;
          }
        }
        aux=0;
      
      for(int i=0;i<10;i++){
      System.out.print(mesa[i]+" ");
    }
    
    System.out.println("");
    System.out.println("OCUPACION");
     for(int i=0;i<10;i++){
      System.out.print(ocupacion[i]+" ");
    }
     }
   }   
    }while(cuantos!=-1);
 }
}
    
