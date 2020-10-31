class Circulo{
    public double AreaCirculo(double raio){
        return Math.PI*Math.pow(raio, 2);
    }
}

public class CoroaCircular extends Circulo{
    public double raioMaior, raioMenor;
    
    public CoroaCircular(double r1, double r2){
        this.raioMaior = r1;
        this.raioMenor = r2;
}
   public double AreaCororaCircular(){
       return super.AreaCirculo(this.raioMaior) - super.AreaCirculo(this.raioMenor);
   }
    public static void main(String[] args) {
        CoroaCircular c = new CoroaCircular(10, 4);
        System.out.println("Area da Coroa Circular:\n" + c.AreaCororaCircular());
    }   
}
