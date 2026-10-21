public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("--- JUEGO ADIVINA NÚMERO ---");
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        juego1.juega();

        System.out.println("\n--- JUEGO ADIVINA PAR ---");
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        juegoPar.juega();

        System.out.println("\n--- JUEGO ADIVINA IMPAR ---");
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        juegoImpar.juega();
    }
}