package entities;

import entities.enums.TipoDeClima;
import entities.interfaces.Previsao;

public abstract class Cidade implements Previsao {

    private String nome;
    private Tempo tempoAtual;
    private TipoDeClima clima;

    public Tempo[] previsao() {
        Tempo[] previsaoSemana = new Tempo[7];

        for (int i = 0; i < previsao().length; i++) {
            if (i == tempoAtual.getDiaDaSemana()) {
                previsaoSemana[i] = tempoAtual;
            } else {

            }
        }

        return previsaoSemana;
    }
}
