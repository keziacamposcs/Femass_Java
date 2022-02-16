package projeto;

public class ponto {
    private Double x;
    private Double y;

    public Double getX(){
        return this.x;
    }

    public Double setX(Double x){
        this.x = x;
    }

    public Double getY(){
        return this.y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getLocalizacao(){
        if (this.x>0 && this.y>0) return "1o Quadrante";
        if (this.x<0 && this.y>0) return "2o Quadrante";
        if (this.x<0 && this.y<0) return "3o Quadrante";
        if (this.x>0 && this.y<0) return "4o Quadrante";
        if (this.x!=0 && this.y==0) return "Eixo de X";
        if (this.x==0 && this.y!=0) return "Eixo de Y";
        return "Origem";
    }
}
