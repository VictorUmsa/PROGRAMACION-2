public class CriaturaMarina {
    public void metodo1() {
    }

    public void metodo2() {
        System.out.println("criatura 2");
    }

    public String toString() {
        return "habita en el oceano";
    }
}

class Mamifero extends CriaturaMarina {
    public void metodo1() {
        System.out.println("sangre caliente");
    }
}

class Delfin extends Mamifero {
    public void metodo1() {
        System.out.println("sopla burbujas");
    }

    public String toString() {
        return "delfin";
    }
}

class Calamar extends CriaturaMarina {
    public void metodo2() {
        System.out.println("tentáculos");
    }

    public String toString() {
        return "calamar";
    }
}

class Ballena extends Mamifero {
    public void metodo1() {
        System.out.println("canta canciones");
    }

    public String toString() {
        return "ballena";
    }

    public void nadar() {
        System.out.println("nada profundamente");
    }
}