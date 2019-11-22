public class ejercicio12 {
public static void main(String[] args) {
String[] color = {
"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
};
String[] palabra = new String[8];
String[] resultado = new String[8];
System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.");
int j = 0;
for (int i = 0; i < 8; i++) {

palabra[i] = System.console().readLine();
// Si la palabra introducida es un color, la guarda en el array resultado.
for (String c : color) {
if (palabra[i].equals(c)) {
resultado[j++] = c;
}
}
}
// Mete las palabras que no son colores al final del array resultado.
for (int i = 0; i < 8; i++) {
boolean esColor = false;
for (String c : color) {
if (palabra[i].equals(c)) {
esColor = true;
}
}
if (!esColor) {
resultado[j++] = palabra[i];
}
}
for(int i=0;i<8;i++){
  System.out.print(resultado[i]+" ");
}
}
}

