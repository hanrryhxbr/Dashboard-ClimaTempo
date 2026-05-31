package entities;

import entities.enums.TipoDeClima;
import entities.interfaces.Previsao;

public abstract class Cidade implements Previsao {

    private final String nome;
    private final Tempo tempoAtual;
    private final TipoDeClima clima;

    public Cidade(String nome, TipoDeClima clima) {
        this.nome = nome;
        this.tempoAtual = TempoFactory.createTempoRapido(clima);
        this.clima = clima;
    }

    @Override
    public Tempo[] previsao() {
        Tempo[] previsaoSemana = new Tempo[7];

        previsaoSemana[0] = tempoAtual;
        for (int i = 1; i < previsaoSemana.length; i++) {
            previsaoSemana[i] = TempoFactory.createProximoTempo(clima, previsaoSemana[i-1]);
        }

        return previsaoSemana;
    }

    public String getNome() {
        return nome;
    }

    public Tempo getTempoAtual() {
        return tempoAtual;
    }

    public TipoDeClima getClima() {
        return clima;
    }
}
