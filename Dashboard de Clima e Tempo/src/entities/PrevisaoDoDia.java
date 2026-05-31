package entities;

import entities.enums.TipoDeTempo;

public class PrevisaoDoDia {

    private final TipoDeTempo tipoDeTempo;
    private final Integer quantMaxima;
    private final Integer quantMinima;
    private final Integer probabilidadeDaPrevisao;

    public PrevisaoDoDia(TipoDeTempo tipoDeTempo, Integer quantMaxima, Integer quantMinima, Integer probabilidadeDaPrevisao) {
        this.tipoDeTempo = tipoDeTempo;
        this.quantMaxima = quantMaxima;
        this.quantMinima = quantMinima;
        this.probabilidadeDaPrevisao = probabilidadeDaPrevisao;
    }

    public TipoDeTempo getTipoDeTempo() {
        return tipoDeTempo;
    }

    public Integer getQuantMaxima() {
        return quantMaxima;
    }

    public Integer getQuantMinima() {
        return quantMinima;
    }

    public Integer getProbabilidadeDaPrevisao() {
        return probabilidadeDaPrevisao;
    }
}
