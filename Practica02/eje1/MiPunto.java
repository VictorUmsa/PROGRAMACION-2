public class MiPunto {
    private double x;
    private double y;

    public MiPunto() {
        this(0, 0);
    }

    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(MiPunto p) {
        return distancia(p.getX(), p.getY());
    }

    public double distancia(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public static void main(String[] args) {
        MiPunto p1 = new MiPunto();
        MiPunto p2 = new MiPunto(10, 30.5);

        System.out.println("Distancia: " + p1.distancia(p2));
    }
}