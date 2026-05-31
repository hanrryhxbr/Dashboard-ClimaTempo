package entities;

public class VelocidadeVento {

    Integer velMaxima;
    Integer velMinima;
    Integer velMedia;

    public VelocidadeVento(Integer velMaxima, Integer velMinima) {
        this.velMaxima = velMaxima;
        this.velMinima = velMinima;
        this.velMedia = (velMaxima + velMinima) / 2;
    }

    public Integer getVelMaxima() {
        return velMaxima;
    }

    public Integer getVelMinima() {
        return velMinima;
    }

    public Integer getVelMedia() {
        return velMedia;
    }
}
