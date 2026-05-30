package entities;

public class ProbabilidadeChuva {

    Double quantMaxima;
    Double quantMinima;
    Double probChuva;

    public ProbabilidadeChuva(double quantMaxima, double quantMinima, double probChuva) {
        this.quantMaxima = quantMaxima;
        this.quantMinima = quantMinima;
        this.probChuva = probChuva;
    }

    public Double getQuantMaxima() {
        return quantMaxima;
    }

    public Double getQuantMinima() {
        return quantMinima;
    }

    public Double getProbChuva() {
        return probChuva;
    }
}
