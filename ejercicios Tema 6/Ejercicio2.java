public class Ejercicio2{
	
  public static void main (String[] args) {
    
    int numPalo;
    int PaloN;
    String palo="";
    int numPalo2=0;
    String NuPalo="";
    
    numPalo=(int)(Math.random()*13)+1;
    PaloN=(int)(Math.random()*4)+1;
    
    switch(numPalo){
      
      case 1:
      NuPalo=NuPalo+"A";
      System.out.print(NuPalo+" de ");
      break;
      case 2:
      numPalo2=2;
      System.out.print(numPalo2+" de ");
      break;
      case 3:
      numPalo2=3;
      System.out.print(numPalo2+" de ");
      break;
      case 4:
      numPalo2=4;
      System.out.print(numPalo2+" de ");
      break;
      case 5:
      numPalo2=5;
      System.out.print(numPalo2+" de ");
      break;
      case 6:
      numPalo2=6;
      System.out.print(numPalo2+" de ");
      break;
      case 7:
      numPalo2=7;
      System.out.print(numPalo2+" de ");
      break;
      case 8:
      numPalo2=8;
      System.out.print(numPalo2+" de ");
      break;
      case 9:
      numPalo2=9;
      System.out.print(numPalo2+" de ");
      break;
      case 10:
      numPalo2=10;
      System.out.print(numPalo2+" de ");
      break;
      case 11:
      NuPalo=NuPalo+"J";
      System.out.print(NuPalo+" de");
      break;
      case 12:
      NuPalo=NuPalo+"Q";
      System.out.print(NuPalo+" de ");
      break;
      case 13:
      NuPalo=NuPalo+"K";
      System.out.print(NuPalo+" de ");
      break;
    }
    switch(PaloN){
      case 1:
      palo=palo+"Picas";
      System.out.print(palo);
      break;
      case 2:
      palo=palo+"Corazones";
      System.out.print(palo);
      break;
      case 3:
      palo=palo+"Diamantes";
      System.out.print(palo);
      break;
      case 4:
      palo=palo+"Tréboles";
      System.out.print(palo);
      break;
    }
  }
}
      
      
      
      
      
      
    
    
    
    
    
    
    
