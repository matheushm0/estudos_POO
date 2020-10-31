class Triangulo2{
    double catetoA, catetoB;
    
    Triangulo2(double a, double b){
       this.catetoA = a;
       this.catetoB = b;
    }
    double calculaHipotenusa(){
        return Math.sqrt(Math.pow(this.catetoA, 2)+Math.pow(this.catetoB, 2));
    }
}

public class Calculador {
    Triangulo2 t;
    Calculador(Triangulo2 t){
        this.t = t;
    }    
    public double calculaPerimetro(){
        return this.t.catetoA+this.t.catetoB+this.t.calculaHipotenusa();
    }
     public static void main(String[] args) {
        Triangulo2 t = new Triangulo2(3.0, 4.0);
        Calculador calc = new Calculador(t);
        System.out.println("[RESULTADOS]");
        System.out.println("Triângulo com catetos "+t.catetoA+" e "+t.catetoB);
        System.out.println("Hipotenusa: "+t.calculaHipotenusa());
        System.out.println("Perímetro: "+calc.calculaPerimetro());
    }
}
