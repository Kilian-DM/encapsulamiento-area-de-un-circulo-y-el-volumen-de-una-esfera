package ejercicio2;

//@author Kilian Diaz
public class Ejercicio2 {

    private float numero;
    private float areacirculo;
    private float volumenesfera;

    public Ejercicio2(float a, float v) {

        this.areacirculo = a;
        this.volumenesfera = v;
    }

    public static void main(String[] args) {

        Ejercicio2 ps = new Ejercicio2((float) ((float) (2 * 2) * 3.1416), (float) (4 * 3.1416) * (2 * 2 * 2) / 3);
        ps.calcular();

    }

    public void calcular() {
        System.out.println("El area del circulo y el volumen de la esfera de 2 metros son:");

        setnumero(getareacirculo());
        System.out.println("El area del ciruclo:  " + getnumero());

        setnumero(getvolumenesfera());
        System.out.println("El volumen de la esfera:  " + getnumero());

    }

    public float getnumero() {
        return numero;
    }

    public void setnumero(float numero) {
        this.numero = numero;
    }

    public float getareacirculo() {
        return areacirculo;
    }

    public void setareacirculo(float areacirculo) {
        this.areacirculo = areacirculo;
    }

    public float getvolumenesfera() {
        return volumenesfera;
    }

    public void setvolumenesfera(float volumenesfera) {
        this.volumenesfera = volumenesfera;
    }
}
