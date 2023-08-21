package Figurki;

public class Krug {
    private double S;
    private double P;
    private double r;
    private final double pi = 3.14;

    public Krug(double r) {
        this.r = r;
        this.Perimetr();
        this.Ploshad();
    }



    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getPloshad() {
        return S;
    }

    public void setPloshad(double s) {
        S = s;
    }

    public double getPerimetr() {
        return P;
    }

    public void setPerimetr(double p) {
        P = p;
    }

    private void Ploshad() {
        S = pi * r * r;
    }

    private void Perimetr() {
        P = 2 * pi * r;
    }
}
