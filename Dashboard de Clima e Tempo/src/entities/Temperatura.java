package entities;

public class Temperatura {

    Integer tempMaxima;
    Integer tempMinima;
    Integer tempMedia;

    public Temperatura(Integer tempMaxima, Integer tempMinima) {
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.tempMedia = (tempMaxima + tempMinima) / 2;
    }

    public Integer getTempMaxima() {
        return tempMaxima;
    }

    public Integer getTempMinima() {
        return tempMinima;
    }

    public Integer getTempMedia() {
        return tempMedia;
    }
}
