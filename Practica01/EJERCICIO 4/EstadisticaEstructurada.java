import java.util.Scanner;
public class EstadisticaEstructurada {
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma / numeros.length;
    }
    public static double desviacion(double[] numeros) {
        double media = promedio(numeros);
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + Math.pow(numeros[i] - media, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            String numero = entrada.next();
            numero = numero.replace(',', '.');
            numeros[i] = Double.parseDouble(numero);
        }
        System.out.println("El promedio es " + promedio(numeros));
        System.out.println("La desviacion estandar es "
                + desviacion(numeros));
    }
}