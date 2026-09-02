public class cronometro{
    private long inicia;
    private long finalizar;
    public cronometro(){
        inicia = System.currentTimeMillis();
    }
    public long getinicia(){
        return inicia;
    }
    public long getfinalizar(){
        return finalizar;
    }
    public void inicia(){
        inicia = System.currentTimeMillis();
    }
    public void finalizar(){
        finalizar = System.currentTimeMillis();
    }
    public long lapsodetiempo(){
        return finalizar - inicia;
    }
    public static void main(String[] args) {
        int[] numeros = new int[100000];

        for (int i = 0; i < 100000; i++) {
            numeros[i] = 100000 - i;
        }

        cronometro reloj = new cronometro();

        for (int i = 0; i < 99999; i++) {

            int menor = i;

            for (int j = i + 1; j < 100000; j++) {

                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }

            int temporal = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = temporal;
        }

        reloj.finalizar();

        System.out.println("Tiempo de ejecucion: "
                + reloj.lapsodetiempo()
                + " milisegundos");
    }
}
