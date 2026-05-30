package entities;

public class VelocidadeVento {

    Double velMaxima;
    Double velMinima;
    Double velMedia;

    public VelocidadeVento(double velMaxima, double velMinima) {
        this.velMaxima = velMaxima;
        this.velMinima = velMinima;
        this.velMedia = (velMaxima + velMinima) / 2;
    }

    public Double getVelMaxima() {
        return velMaxima;
    }

    public Double getVelMinima() {
        return velMinima;
    }

    public Double getVelMedia() {
        return velMedia;
    }
}
