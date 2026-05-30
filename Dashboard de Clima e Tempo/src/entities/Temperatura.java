package entities;

public class Temperatura {

    Double tempMaxima;
    Double tempMinima;
    Double tempMedia;

    public Temperatura(double tempMaxima, double tempMinima) {
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.tempMedia = (tempMaxima + tempMinima) / 2;
    }

    public Double getTempMaxima() {
        return tempMaxima;
    }

    public Double getTempMinima() {
        return tempMinima;
    }

    public Double getTempMedia() {
        return tempMedia;
    }
}
