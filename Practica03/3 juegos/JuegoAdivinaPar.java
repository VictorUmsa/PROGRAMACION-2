public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (super.validaNumero(numero)) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: El número debe ser par.");
                return false;
            }
        }
        return false;
    }
}