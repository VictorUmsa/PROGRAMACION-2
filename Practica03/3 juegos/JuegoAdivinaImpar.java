public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (super.validaNumero(numero)) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: El número debe ser impar.");
                return false;
            }
        }
        return false;
    }
}