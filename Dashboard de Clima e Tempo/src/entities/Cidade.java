package entities;

import entities.enums.TipoDeClima;

import java.util.ArrayList;

public abstract class Cidade {

    private String nome;
    private Tempo tempoAtual;
    private TipoDeClima clima;

    public ArrayList<Tempo> previsao() {
        return null;
    }
}
