 public class Ejercicio3{
	
  public static void main (String[] args) {
 int numPalo;
    int PaloN;
    String palo="";
    int numPalo2=0;
    String NuPalo="";
    
    numPalo=(int)(Math.random()*10)+1;
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
      NuPalo=NuPalo+"Sota";
      System.out.print(NuPalo+" de ");
      break;
      case 9:
      NuPalo=NuPalo+"Caballo";
      System.out.print(NuPalo+" de ");
      break;
      case 10:
      NuPalo=NuPalo+"Rey";
      System.out.print(NuPalo+" de ");
      break;
    }
    switch(PaloN){
      case 1:
      palo=palo+"Oro";
      System.out.print(palo);
      break;
      case 2:
      palo=palo+"Bastos";
      System.out.print(palo);
      break;
      case 3:
      palo=palo+"Espadas";
      System.out.print(palo);
      break;
      case 4:
      palo=palo+"Copas";
      System.out.print(palo);
      break;
    }
  }
}
