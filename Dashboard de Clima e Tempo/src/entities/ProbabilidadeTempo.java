package entities;

import entities.enums.TipoDeTempo;

public class ProbabilidadeTempo {

    TipoDeTempo tipoDeTempo;
    Double quantMaxima;
    Double quantMinima;
    Double probabilidade;

    public ProbabilidadeTempo(TipoDeTempo tipoDeTempo, Double quantMaxima, Double quantMinima, Double probabilidade) {
        this.tipoDeTempo = tipoDeTempo;
        this.quantMaxima = quantMaxima;
        this.quantMinima = quantMinima;
        this.probabilidade = probabilidade;
    }

    public TipoDeTempo getTipoDeTempo() {
        return tipoDeTempo;
    }

    public Double getQuantMaxima() {
        return quantMaxima;
    }

    public Double getQuantMinima() {
        return quantMinima;
    }

    public Double getProbabilidade() {
        return probabilidade;
    }
}
