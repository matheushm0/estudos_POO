class Geometria{
    double base, altura;
    double area(){
        return base*altura;
    }
}

class Triangulo extends Geometria{
    Triangulo(double b, double h){
        this.base = b;
        this.altura = h;
    }
    
    double area(){
        return (base*altura)/2;
    }
}

class Retangulo extends Geometria{
    Retangulo(double b, double h){
        this.base = b;
        this.altura = h;
    }
    
    double area(){
        return base*altura;
    }
}
public class CalculaArea {

    public static void main(String[] args) {
        Triangulo t = new Triangulo(5, 6);
        Retangulo r = new Retangulo(4, 8);
        
        System.out.println("Área do triangulo: "+t.area());
        System.out.println("Área do retangulo: "+r.area()); 
    }  
}