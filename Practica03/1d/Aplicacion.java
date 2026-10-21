public class Aplicacion {
    public static void main(String[] args) {
        CriaturaMarina[] elementos = { 
            new Calamar("Calamarín"), 
            new Delfin("Flipper"), 
            new Mamifero("Oso Marino"), 
            new CriaturaMarina("Genérica"), 
            new Ballena("Willy") 
        };
        
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
            elementos[i].metodo1();
            elementos[i].metodo2();
            System.out.println();
        }
    }
}