public class ejercicio11{
	
  public static void main (String[] args) {
    int[]numero=new int[10];
    int[]aux=new int[10];
    int contP=0;
    int cont=0;
    
    for(int i=0;i<10;i++){
      System.out.println("introduce el "+(i+1)+" numero entero: ");
      numero[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.println("");
    System.out.printf("%-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s\n ","Indice","0","1","2","3","4","5","6","7","8","9");
    System.out.printf("%-2s %-2d %-2d %-2d %-2d %-2d %-2d %-2d %-2d %-2d %-2d\n","Valor",numero[0],numero[1],numero[2],numero[3],numero[4],numero[5],numero[6],numero[7],numero[8],numero[9]);
    for(int j=0;j<10;j++){
      for(int k=1;k<=numero[j];k++){
        if(numero[j]%k==0){
          contP++;
        }
      }
      if(contP==2 || contP==1){
        aux[cont]=numero[j];
        cont++;
      }
      contP=0;
    }
    for(int l=0;l<10;l++){
      for(int m=1;m<=numero[l];m++){
        if(numero[l]%m==0){
          contP++;
        }
      }
      if(contP>2){
        aux[cont]=numero[l];
        cont++;
      }
      contP=0;
    }
    System.out.println("");
    System.out.printf("%-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s %-2s\n ","Indice","0","1","2","3","4","5","6","7","8","9");
    System.out.printf("%-2s %-2d %-2d %-2d %-2d %-2d %-2d %-2d %-2d %-2d %-2d\n","Valor",aux[0],aux[1],aux[2],aux[3],aux[4],aux[5],aux[6],aux[7],aux[8],aux[9]);
    
  }
}
    
    
    
    
