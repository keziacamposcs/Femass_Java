package br.edu.femass.model;

public class Ponto {
    private Double x;
    private Double y;

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public String getLocalizacao(){
        if (this.x > 0 && this.y > 0){
            return "Quadrante 1";
        } else if (this.x < 0 && this.y > 0){
            return "Quadrante 2";
        } else if (this.x < 0 && this.y < 0){
            return "Quadrante 3";
        } else if (this.x > 0 && this.y < 0){
            return "Quadrante 4";
        } else if (this.x == 0 && this.y == 0){
            return "Origem";
        } else if (this.x == 0 && this.y != 0){
            return "Eixo Y";
        } else if (this.x != 0 && this.y == 0){
            return "Eixo X";
        } else {
            return "Não foi possível determinar a localização";
        }
    }

    public Double getDistancia(Ponto p){
        return Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));
    }

    public Double getDistancia(Double x, Double y){
        return this.getDistancia(new Ponto(x, y));
    }
}
