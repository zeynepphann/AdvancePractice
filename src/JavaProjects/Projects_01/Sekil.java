package JavaProjects.Projects_01;

public class Sekil {

    double yaricap;
    double uzunKenar;
    double kisaKenar;
    double pi = 3.14;
    int kenar;

    public Sekil() {

    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil(int kenar) {
        this.kenar = kenar;
    }

    public double cemberAlan() {
        return yaricap * yaricap * pi;
    }

    public double cemberCevre() {
        return 2 * pi * yaricap;
    }

    public double alanHesaplama() {
        return kisaKenar * uzunKenar;
    }

    public double dikdortgenCevreHesaplama() {
        return 2 * (kisaKenar + uzunKenar);
    }

    public int kareCevreHesaplama() {
        return 4 * kenar;
    }

    public int kareAlanHesaplama() {
        return 2 * kenar;
    }


}
