package Figurki;

public class Kvadrat {
    private double storonaKvadrat1;
    private double storonaKvadrat2;
    private double sKvadrat;
    private double pKvadrat;

    public Kvadrat(double){
        this.storonaKvadrat1;
        this.storonaKvadrat2;
        this.sKvadrat;
        this.pKvadrat;
        sKvadrat = storonaKvadrat1 * storonaKvadrat2;
        pKvadrat =2*(storonaKvadrat1 + storonaKvadrat2);
    }

    public double getsKvadrat() {
        return sKvadrat;
    }

    public void setsKvadrat(double sKvadrat) {
        this.sKvadrat = sKvadrat;
    }

    public double getpKvadrat() {
        return pKvadrat;
    }

    public void setpKvadrat(double pKvadrat) {
        this.pKvadrat = pKvadrat;
    }

    public double getStoronaKvadrat1() {
        return storonaKvadrat1;
    }

    public void setStoronaKvadrat1(double storonaKvadrat1) {
        this.storonaKvadrat1 = storonaKvadrat1;
    }

    public double getStoronaKvadrat2() {
        return storonaKvadrat2;
    }

    public void setStoronaKvadrat2(double storonaKvadrat2) {
        this.storonaKvadrat2 = storonaKvadrat2;
    }
}
