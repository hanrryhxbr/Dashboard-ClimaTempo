package entities;

public class Tempo {

    Double tempMaxima;
    Double tempMinima;
    Double tempMedia;

    Double quantChuvaMaxima;
    Double quantChuvaMinima;
    Double probChuva;

    Double velocidadeDoVentoMaxima;
    Double velocidadeDoVentoMinima;
    Double velocidadeDoVentoMedia;

    public Tempo(Double tempMaxima, Double tempMinima, Double quantChuvaMaxima, Double quantChuvaMinima, Double probChuva, Double velocidadeDoVentoMaxima, Double velocidadeDoVentoMinima) {
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        this.tempMedia = (tempMaxima + tempMinima) / 2;
        this.quantChuvaMaxima = quantChuvaMaxima;
        this.quantChuvaMinima = quantChuvaMinima;
        this.probChuva = probChuva;
        this.velocidadeDoVentoMaxima = velocidadeDoVentoMaxima;
        this.velocidadeDoVentoMinima = velocidadeDoVentoMinima;
        this.velocidadeDoVentoMedia = (velocidadeDoVentoMaxima + velocidadeDoVentoMinima) / 2;
    }

    public Double getVelocidadedoVentoMaxima() {
        return velocidadeDoVentoMaxima;
    }

    public Double getVelocidadedoVentoMinima() {
        return velocidadeDoVentoMinima;
    }

    public Double getVelocidadedoVentoMedia() {
        return velocidadeDoVentoMedia;
    }

    public Double getQuantChuvaMaxima() {
        return quantChuvaMaxima;
    }

    public Double getQuantChuvaMinima() {
        return quantChuvaMinima;
    }

    public Double getProbChuva() {
        return probChuva;
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
