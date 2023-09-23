public class app {

    // Declaración de Constantes:
    public static final int LADO = 5;

    public static void main(String[] arg){

        /*Escribe un programa en Java (Cuadrado) que calcule y muestre el área
        de un cuadrado de lado igual a 5. Haz una versión sin emplear constantes
        y otra con constantes.*/

        // Versión con constante
        int areaCuadrado = LADO * LADO;
        System.out.println(areaCuadrado);
        System.out.printf("El area del cuadrado con lado %s es: %s %n", LADO, areaCuadrado);

        // Versión sin constante
        int lado = 6;
        areaCuadrado = lado * lado;
        System.out.printf("El area del cuadrado con lado %s es: %s %n", lado, areaCuadrado);

    } // public static void main(String[] arg)
} // public class app
