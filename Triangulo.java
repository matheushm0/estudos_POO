public class Triangulo {
    double catetoA, catetoB;
    
    Triangulo(double a, double b){
       this.catetoA = a;
       this.catetoB = b;
    }
    public double calculaHipotenusa(){
        return Math.sqrt(Math.pow(this.catetoA, 2)+Math.pow(this.catetoB, 2));
    }
    public double perimetro(){
        return this.catetoA + this.catetoB + this.calculaHipotenusa();
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo(3.0, 4.0);
        System.out.println("Triângulo com catetos "+t.catetoA+" e "+t.catetoB);
        System.out.println("Hipotenusa: "+t.calculaHipotenusa());
        System.out.println("Perímetro: "+t.perimetro());
    }  
}