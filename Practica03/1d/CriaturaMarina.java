public class CriaturaMarina {
    protected String nombre;

    public CriaturaMarina(String nombre) {
        this.nombre = nombre;
    }

    public void metodo1() {
    }

    public void metodo2() {
        System.out.println("criatura 2");
    }

    public String toString() {
        return "habita en el oceano: " + nombre;
    }
}

class Mamifero extends CriaturaMarina {
    public Mamifero(String nombre) {
        super(nombre);
    }

    public void metodo1() {
        System.out.println("sangre caliente");
    }
}

class Delfin extends Mamifero {
    public Delfin(String nombre) {
        super(nombre);
    }

    public void metodo1() {
        System.out.println("sopla burbujas");
        super.metodo1();
    }

    public String toString() {
        return "delfin: " + nombre;
    }
}

class Calamar extends CriaturaMarina {
    public Calamar(String nombre) {
        super(nombre);
    }

    public void metodo2() {
        System.out.println("tentáculos");
    }

    public String toString() {
        return "calamar: " + nombre;
    }
}

class Ballena extends Mamifero {
    public Ballena(String nombre) {
        super(nombre);
    }

    public void metodo1() {
        System.out.println("canta canciones");
    }

    public String toString() {
        return "ballena: " + nombre;
    }

    public void nadar() {
        System.out.println("nada profundamente");
    }
}