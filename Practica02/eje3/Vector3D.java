public class Vector3D {
    private double a1;
    private double a2;
    private double a3;

    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public double getA1() { return a1; }
    public double getA2() { return a2; }
    public double getA3() { return a3; }

    public Vector3D sumar(Vector3D b) {
        return new Vector3D(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
    }

    public Vector3D multiplicarPorEscalar(double r) {
        return new Vector3D(r * this.a1, r * this.a2, r * this.a3);
    }

    public double longitud() {
        return Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3);
    }

    public Vector3D normal() {
        double mod = longitud();
        if (mod == 0) return new Vector3D(0, 0, 0);
        return new Vector3D(a1 / mod, a2 / mod, a3 / mod);
    }

    public double productoEscalar(Vector3D b) {
        return this.a1 * b.a1 + this.a2 * b.a2 + this.a3 * b.a3;
    }

    public Vector3D productoVectorial(Vector3D b) {
        return new Vector3D(
            this.a2 * b.a3 - this.a3 * b.a2,
            this.a3 * b.a1 - this.a1 * b.a3,
            this.a1 * b.a2 - this.a2 * b.a1
        );
    }

    @Override
    public String toString() {
        return "(" + a1 + ", " + a2 + ", " + a3 + ")";
    }

    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 4, -1);
        Vector3D b = new Vector3D(1, 3, 5);

        System.out.println("a + b = " + a.sumar(b));
        System.out.println("3 * a = " + a.multiplicarPorEscalar(3));
        System.out.println("|a| = " + a.longitud());
        System.out.println("Normal de a = " + a.normal());
        System.out.println("a . b = " + a.productoEscalar(b));
        System.out.println("a x b = " + a.productoVectorial(b));
    }
}