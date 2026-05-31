package entities;

import entities.enums.TipoDeClima;
import entities.enums.TipoDeTempo;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.Random;

public class RandomTempoFactory {
    public static Tempo createProximoTempo(TipoDeClima clima, Tempo tempoAnterior) {
        //data do novo tempo
        LocalDate data = tempoAnterior.getData().plusDays(1);

        //temperatura do novo tempo
        Integer tempMaxima;
        Integer tempMinima;

        //velocidade do vento do novo tempo
        Integer velMaxima;
        Integer velMinima;

        //previsão diária do novo tempo
        TipoDeTempo tipoDeTempo;
        Integer quantMaxima = null;
        Integer quantMinima = null;
        Integer probabilidadeDaPrevisao;

        //gerador de numeros randomicos
        Random random = new Random();

        switch (clima) {
            case TROPICAL -> {
                tempMaxima = random.nextInt(28, 35) + 1;
                tempMinima = random.nextInt(18, 25) + 1;
                velMaxima = random.nextInt(21, 40) + 1;
                velMinima = random.nextInt(5, 20) + 1;

                int numeroAleatorio = random.nextInt(1, 100) + 1;
                if (numeroAleatorio <= 35) {
                    tipoDeTempo = TipoDeTempo.ENSOLARADO;

                } else if (numeroAleatorio <= 65) {
                    tipoDeTempo = TipoDeTempo.PARCIALMENTE_NUBLADO;

                    
                } else if (numeroAleatorio <= 80) {
                    tipoDeTempo = TipoDeTempo.NUBLADO;
                    
                } else if (numeroAleatorio <= 92) {
                    tipoDeTempo = TipoDeTempo.CHUVOSO;
                    quantMaxima = random.nextInt(40, 50) + 1;
                    quantMinima = random.nextInt(5, 10) + 1;

                } else if (numeroAleatorio <= 95) {
                    tipoDeTempo = TipoDeTempo.TEMPESTADE;
                    quantMaxima = random.nextInt(80, 100) + 1;
                    quantMinima = random.nextInt(20, 40) + 1;

                } else if (numeroAleatorio == 96) {
                    tipoDeTempo = TipoDeTempo.GRANIZO;
                    quantMaxima = random.nextInt(20, 30) + 1;
                    quantMinima = random.nextInt(5, 10) + 1;

                } else if (numeroAleatorio <= 98) {
                    tipoDeTempo = TipoDeTempo.NEVOEIRO;

                } else {
                    tipoDeTempo = TipoDeTempo.VENTOSO;

                }

                probabilidadeDaPrevisao = random.nextInt(65, 95) + 1;

                Temperatura novaTemperatura = new Temperatura(tempMaxima, tempMinima);
                VelocidadeVento novaVelocidadeVento = new VelocidadeVento(velMaxima, velMinima);
                PrevisaoDoDia novaPrevisaoDoDia = new PrevisaoDoDia(tipoDeTempo, quantMaxima, quantMinima, probabilidadeDaPrevisao);

                return new Tempo(data, novaTemperatura, novaVelocidadeVento, tipoDeTempo, novaPrevisaoDoDia);
            }
            case ARIDO -> {
                tempMaxima = random.nextInt(26, 50) + 1;
                tempMinima = random.nextInt(5, 25) + 1;
                velMaxima = random.nextInt(51, 80) + 1;
                velMinima = random.nextInt(0, 50) + 1;

                int numeroAleatorio = random.nextInt(1, 100) + 1;
                if (numeroAleatorio <= 60) {
                    tipoDeTempo = TipoDeTempo.ENSOLARADO;

                } else if (numeroAleatorio <= 80) {
                    tipoDeTempo = TipoDeTempo.PARCIALMENTE_NUBLADO;


                } else if (numeroAleatorio <= 90) {
                    tipoDeTempo = TipoDeTempo.NUBLADO;

                } else if (numeroAleatorio <= 96) {
                    tipoDeTempo = TipoDeTempo.VENTOSO;

                } else if (numeroAleatorio <= 99) {
                    tipoDeTempo = TipoDeTempo.CHUVOSO;
                    quantMaxima = random.nextInt(10, 15) + 1;
                    quantMinima = random.nextInt(1, 3) + 1;

                } else {
                    tipoDeTempo = TipoDeTempo.TEMPESTADE;
                    quantMaxima = random.nextInt(30, 40) + 1;
                    quantMinima = random.nextInt(5, 10) + 1;

                }

                probabilidadeDaPrevisao = random.nextInt(80, 99) + 1;

                Temperatura novaTemperatura = new Temperatura(tempMaxima, tempMinima);
                VelocidadeVento novaVelocidadeVento = new VelocidadeVento(velMaxima, velMinima);
                PrevisaoDoDia novaPrevisaoDoDia = new PrevisaoDoDia(tipoDeTempo, quantMaxima, quantMinima, probabilidadeDaPrevisao);

                return new Tempo(data, novaTemperatura, novaVelocidadeVento, tipoDeTempo, novaPrevisaoDoDia);
            }
            case TEMPERADO -> {
                tempMaxima = random.nextInt(16, 30) + 1;
                tempMinima = random.nextInt(-5, 15) + 1;
                velMaxima = random.nextInt(41, 70) + 1;
                velMinima = random.nextInt(20, 40) + 1;

                int numeroAleatorio = random.nextInt(1, 100) + 1;
                if (numeroAleatorio <= 25) {
                    tipoDeTempo = TipoDeTempo.ENSOLARADO;

                } else if (numeroAleatorio <= 50) {
                    tipoDeTempo = TipoDeTempo.PARCIALMENTE_NUBLADO;


                } else if (numeroAleatorio <= 70) {
                    tipoDeTempo = TipoDeTempo.NUBLADO;

                } else if (numeroAleatorio <= 85) {
                    tipoDeTempo = TipoDeTempo.CHUVOSO;
                    quantMaxima = random.nextInt(25, 30) + 1;
                    quantMinima = random.nextInt(5, 10) + 1;

                } else if (numeroAleatorio <= 88) {
                    tipoDeTempo = TipoDeTempo.VENTOSO;
                    quantMaxima = random.nextInt(80, 100) + 1;
                    quantMinima = random.nextInt(20, 40) + 1;

                } else if (numeroAleatorio <= 93) {
                    tipoDeTempo = TipoDeTempo.TEMPESTADE;
                    quantMaxima = random.nextInt(60, 80) + 1;
                    quantMinima = random.nextInt(15, 30) + 1;

                } else if (numeroAleatorio <= 96) {
                    tipoDeTempo = TipoDeTempo.NEVOEIRO;

                } else if (numeroAleatorio == 97) {
                    tipoDeTempo = TipoDeTempo.GRANIZO;
                    quantMaxima = random.nextInt(15, 20) + 1;
                    quantMinima = random.nextInt(2, 5) + 1;

                }  else if (numeroAleatorio == 99) {
                    tipoDeTempo = TipoDeTempo.NEVE;
                    quantMaxima = random.nextInt(20, 30) + 1;
                    quantMinima = random.nextInt(1, 5) + 1;

                } else {
                    tipoDeTempo = TipoDeTempo.NEVASCA;
                    quantMaxima = random.nextInt(80, 100) + 1;
                    quantMinima = random.nextInt(20, 40) + 1;

                }

                probabilidadeDaPrevisao = random.nextInt(55, 90) + 1;

                Temperatura novaTemperatura = new Temperatura(tempMaxima, tempMinima);
                VelocidadeVento novaVelocidadeVento = new VelocidadeVento(velMaxima, velMinima);
                PrevisaoDoDia novaPrevisaoDoDia = new PrevisaoDoDia(tipoDeTempo, quantMaxima, quantMinima, probabilidadeDaPrevisao);

                return new Tempo(data, novaTemperatura, novaVelocidadeVento, tipoDeTempo, novaPrevisaoDoDia);

            }
            case CONTINENTAL -> {
                tempMaxima = random.nextInt(11, 35) + 1;
                tempMinima = random.nextInt(-30, 10) + 1;
                velMaxima = random.nextInt(46, 90) + 1;
                velMinima = random.nextInt(0, 45) + 1;

                int numeroAleatorio = random.nextInt(1, 100) + 1;
                if (numeroAleatorio <= 20) {
                    tipoDeTempo = TipoDeTempo.ENSOLARADO;

                } else if (numeroAleatorio <= 40) {
                    tipoDeTempo = TipoDeTempo.PARCIALMENTE_NUBLADO;


                } else if (numeroAleatorio <= 60) {
                    tipoDeTempo = TipoDeTempo.NUBLADO;

                } else if (numeroAleatorio <= 75) {
                    tipoDeTempo = TipoDeTempo.CHUVOSO;
                    quantMaxima = random.nextInt(30, 40) + 1;
                    quantMinima = random.nextInt(5, 15) + 1;

                } else if (numeroAleatorio <= 82) {
                    tipoDeTempo = TipoDeTempo.VENTOSO;

                } else if (numeroAleatorio == 88) {
                    tipoDeTempo = TipoDeTempo.TEMPESTADE;
                    quantMaxima = random.nextInt(80, 100) + 1;
                    quantMinima = random.nextInt(20, 40) + 1;

                } else if (numeroAleatorio <= 91) {
                    tipoDeTempo = TipoDeTempo.NEVOEIRO;

                } else if (numeroAleatorio <= 94) {
                    tipoDeTempo = TipoDeTempo.GRANIZO;
                    quantMaxima = random.nextInt(20, 25) + 1;
                    quantMinima = random.nextInt(2, 8) + 1;

                } else if (numeroAleatorio <= 99) {
                    tipoDeTempo = TipoDeTempo.NEVE;
                    quantMaxima = random.nextInt(40, 50) + 1;
                    quantMinima = random.nextInt(5, 15) + 1;

                } else {
                    tipoDeTempo = TipoDeTempo.NEVASCA;
                    quantMaxima = random.nextInt(120, 150) + 1;
                    quantMinima = random.nextInt(30, 60) + 1;

                }

                probabilidadeDaPrevisao = random.nextInt(50, 85) + 1;

                Temperatura novaTemperatura = new Temperatura(tempMaxima, tempMinima);
                VelocidadeVento novaVelocidadeVento = new VelocidadeVento(velMaxima, velMinima);
                PrevisaoDoDia novaPrevisaoDoDia = new PrevisaoDoDia(tipoDeTempo, quantMaxima, quantMinima, probabilidadeDaPrevisao);

                return new Tempo(data, novaTemperatura, novaVelocidadeVento, tipoDeTempo, novaPrevisaoDoDia);

            }
            case POLAR -> {
                tempMaxima = random.nextInt(-21, -10) + 1;
                tempMinima = random.nextInt(-60, -20) + 1;
                velMaxima = random.nextInt(61, 120) + 1;
                velMinima = random.nextInt(5, 60) + 1;

                int numeroAleatorio = random.nextInt(1, 100) + 1;
                if (numeroAleatorio <= 5) {
                    tipoDeTempo = TipoDeTempo.ENSOLARADO;

                } else if (numeroAleatorio <= 20) {
                    tipoDeTempo = TipoDeTempo.PARCIALMENTE_NUBLADO;


                } else if (numeroAleatorio <= 40) {
                    tipoDeTempo = TipoDeTempo.NUBLADO;

                } else if (numeroAleatorio <= 50) {
                    tipoDeTempo = TipoDeTempo.CHUVOSO;
                    quantMaxima = random.nextInt(15, 20) + 1;
                    quantMinima = random.nextInt(1, 5) + 1;

                } else if (numeroAleatorio <= 65) {
                    tipoDeTempo = TipoDeTempo.VENTOSO;

                } else if (numeroAleatorio == 70) {
                    tipoDeTempo = TipoDeTempo.TEMPESTADE;
                    quantMaxima = random.nextInt(40, 50) + 1;
                    quantMinima = random.nextInt(5, 15) + 1;

                } else if (numeroAleatorio <= 75) {
                    tipoDeTempo = TipoDeTempo.NEVOEIRO;

                } else if (numeroAleatorio == 76) {
                    tipoDeTempo = TipoDeTempo.GRANIZO;
                    quantMaxima = random.nextInt(10, 15) + 1;
                    quantMinima = random.nextInt(1, 5) + 1;

                } else if (numeroAleatorio <= 95) {
                    tipoDeTempo = TipoDeTempo.NEVE;
                    quantMaxima = random.nextInt(40, 60) + 1;
                    quantMinima = random.nextInt(5, 20) + 1;

                } else {
                    tipoDeTempo = TipoDeTempo.NEVASCA;
                    quantMaxima = random.nextInt(150, 200) + 1;
                    quantMinima = random.nextInt(30, 80) + 1;

                }

                probabilidadeDaPrevisao = random.nextInt(60, 90) + 1;

                Temperatura novaTemperatura = new Temperatura(tempMaxima, tempMinima);
                VelocidadeVento novaVelocidadeVento = new VelocidadeVento(velMaxima, velMinima);
                PrevisaoDoDia novaPrevisaoDoDia = new PrevisaoDoDia(tipoDeTempo, quantMaxima, quantMinima, probabilidadeDaPrevisao);

                return new Tempo(data, novaTemperatura, novaVelocidadeVento, tipoDeTempo, novaPrevisaoDoDia);

            }

            case null, default -> throw new InvalidParameterException("Tipo de tempo inválido");
        }
    }
}
