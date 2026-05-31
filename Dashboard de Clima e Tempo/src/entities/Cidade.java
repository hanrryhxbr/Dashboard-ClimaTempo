package entities;

import entities.enums.TipoDeClima;
import entities.interfaces.Previsao;

public abstract class Cidade implements Previsao {

    private String nome;
    private Tempo tempoAtual;
    private TipoDeClima clima;

    public Tempo[] previsao() {
        Tempo[] previsaoSemana = new Tempo[7];

        previsaoSemana[0] = tempoAtual;
        for (int i = 1; i < previsao().length; i++) {
            previsaoSemana[i] = RandomTempoFactory.createProximoTempo(clima, previsaoSemana[i-1]);
        }

        return previsaoSemana;
    }
}
