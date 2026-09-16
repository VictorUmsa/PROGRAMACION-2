class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    public Vector3D sumar(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D restar(Vector3D v) {
        return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    public Vector3D multiplicar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double productoEscalar(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector3D productoVectorial(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

public class AlgebraVectorial {
    private Vector3D a;
    private Vector3D b;

    public AlgebraVectorial() {
        this.a = new Vector3D();
        this.b = new Vector3D();
    }

    public AlgebraVectorial(Vector3D a, Vector3D b) {
        this.a = a;
        this.b = b;
    }

    public boolean esPerpendicular(Vector3D a, Vector3D b) {
        return Math.abs(a.sumar(b).longitud() - a.restar(b).longitud()) < 1e-9;
    }

    public boolean esPerpendicular(Vector3D a, Vector3D b, String modo) {
        return Math.abs(a.restar(b).longitud() - b.restar(a).longitud()) < 1e-9;
    }

    public boolean esPerpendicular(Vector3D a, Vector3D b, double op) {
        return Math.abs(a.productoEscalar(b)) < 1e-9;
    }

    public boolean esPerpendicular(Vector3D a, Vector3D b, boolean pythagoras) {
        double izq = Math.pow(a.sumar(b).longitud(), 2);
        double der = Math.pow(a.longitud(), 2) + Math.pow(b.longitud(), 2);
        return Math.abs(izq - der) < 1e-9;
    }

    public boolean esParalela(Vector3D a, Vector3D b, double r) {
        Vector3D rb = b.multiplicar(r);
        return Math.abs(a.getX() - rb.getX()) < 1e-9 &&
               Math.abs(a.getY() - rb.getY()) < 1e-9 &&
               Math.abs(a.getZ() - rb.getZ()) < 1e-9;
    }

    public boolean esParalela(Vector3D a, Vector3D b) {
        return Math.abs(a.productoVectorial(b).longitud()) < 1e-9;
    }

    public Vector3D proyeccion_de_a_sobre_b(Vector3D a, Vector3D b) {
        double escalar = a.productoEscalar(b) / Math.pow(b.longitud(), 2);
        return b.multiplicar(escalar);
    }

    public double componente_de_a_en_b(Vector3D a, Vector3D b) {
        return a.productoEscalar(b) / b.longitud();
    }

    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(0, 1, 0);

        AlgebraVectorial av = new AlgebraVectorial(v1, v2);

        System.out.println("Es perpendicular (a . b = 0): " + av.esPerpendicular(v1, v2, 0.0));
        System.out.println("Es paralela (a x b = 0): " + av.esParalela(v1, v2));
        System.out.println("Proyeccion de a sobre b: " + av.proyeccion_de_a_sobre_b(v1, v2));
        System.out.println("Componente de a en b: " + av.componente_de_a_en_b(v1, v2));
    }
}