public class ejercicio3_12{
  
  public static void main(String[] args){
    
    double nota1;
    double nota2;
    double nota_trim;
    
  System.out.println("introduce la nota del primer examen: ");
  
  nota1 = Double.parseDouble(System.console().readLine());
  
  System.out.println("¿que nota quieres conseguir en el trimestre?");
  
    nota_trim = Double.parseDouble(System.console().readLine());
  
  nota2 = (nota_trim - (0.6*nota1))/0.4;
  
  System.out.println("para sacar un "+nota_trim+" en el trimestre necesitas "+nota2+" en el segundo examen");
  
}
}
  
  
