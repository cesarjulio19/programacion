public class ejercicio3_7{
  
  public static void main(String[] args){
    
    double prod1;
    double prod2;
    double prod3;
    double factura;
    double factura_Iva;
    
    System.out.println("introduce el precio de los 3 productos: ");
    
    prod1 = Double.parseDouble(System.console().readLine());
    prod2 = Double.parseDouble(System.console().readLine());
    prod3 = Double.parseDouble(System.console().readLine());
    
    factura = prod1 + prod2 +prod3;
    factura_Iva = (prod1 + prod2 +prod3)*(1.21);
    
    System.out.println("la facura sin IVA seria: "+factura);
        System.out.println("la facura con IVA seria: "+factura_Iva);
        
      }
    }

    
    
    
    
