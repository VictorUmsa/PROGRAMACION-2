public class Aplicacion2 {
    public static void main(String[] args) {
        CriaturaMarina[] elementos = { 
            new Calamar(), 
            new Delfin(), 
            new Mamifero(), 
            new CriaturaMarina() 
        };
        
        for (int i = 0; i < elementos.length; i++) {
            elementos[i].metodo2();
            System.out.println(elementos[i]);
            elementos[i].metodo1();
            System.out.println();
        }
    }
}