import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        this.numeroAAdivinar = rand.nextInt(11);
        
        Scanner scanner = new Scanner(System.in);
        boolean acerto = false;

        while (this.numeroDeVidas > 0 && !acerto) {
            System.out.print("Adivina un número entre el 0 y el 10: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número fuera de rango.");
                continue;
            }

            if (intento == this.numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                acerto = true;
            } else {
                boolean aunTieneVidas = quitaVida();
                if (aunTieneVidas) {
                    if (intento < this.numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor.");
                    } else {
                        System.out.println("El número a adivinar es menor.");
                    }
                } else {
                    System.out.println("Ya no te quedan más vidas. Fin del juego.");
                }
            }
        }
    }
}