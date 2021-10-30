package clases;

public class Hexagono extends Poligono{

    int lado;


    public Hexagono(int lado) {

        super(6);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public float getApotema(){
        int ladoC= lado*lado;
        return  (float) Math.sqrt(ladoC-(ladoC/4));
    }
    
    @Override
    public float getArea() {
        return getApotema()*getPerimetro()/2;
    }
    @Override
    public float getPerimetro() {
       return getnLados()*lado;
    }
    
