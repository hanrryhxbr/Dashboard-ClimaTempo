package entities;

import entities.enums.TipoDeTempo;

import java.time.LocalDate;

public class Tempo {

    private final LocalDate data;
    private final Temperatura temperatura;
    private final VelocidadeVento velocidadeVento;
    private final TipoDeTempo tipoDeTempo;
    private final PrevisaoDoDia previsaoDoDia;

    public Tempo(LocalDate data, Temperatura temperatura, VelocidadeVento velocidadeVento, TipoDeTempo tipoDeTempo, PrevisaoDoDia previsaoDoDia) {
        this.data = data;
        this.temperatura = temperatura;
        this.velocidadeVento = velocidadeVento;
        this.tipoDeTempo = tipoDeTempo;
        this.previsaoDoDia = previsaoDoDia;
    }

    public LocalDate getData() {
        return data;
    }

    public int getDiaDaSemana() {
        return switch (data.getDayOfWeek()) {
            case SUNDAY -> 0;
            case MONDAY -> 1;
            case THURSDAY -> 2;
            case WEDNESDAY -> 3;
            case TUESDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
        };
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public VelocidadeVento getVelocidadeVento() {
        return velocidadeVento;
    }

    public TipoDeTempo getTipoDeTempo() {
        return tipoDeTempo;
    }

    public PrevisaoDoDia getProbabilidadeTempo() {
        return previsaoDoDia;
    }
}
