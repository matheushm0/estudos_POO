class Racional {
    int num, den;
    
    Racional(int n, int d){
        this.num = n;
        this.den = d;
    }
    
    @Override
    public String toString(){
    /*    if (this.den==1){
            return this.num;
        }
    */
            return this.num+"/"+this.den;
        }
}

public class NumRacional{
    Racional a, b;
    
    public static Racional add(Racional a, Racional b){
        int num = (a.num*b.den)+(b.num*a.den);
        int den = a.den*b.den;
        return new Racional(num, den);
    }
    
    public static Racional subt (Racional a, Racional b){
        int num = (a.num*b.den)-(b.num*a.den);
        int den = a.den*b.den;
        return new Racional(num, den); 
    }
    public static Racional mult (Racional a, Racional b){
        int num = a.num * b.num;
        int den = a.den * b.den;
        return new Racional(num, den);    
    }
    
    public static Racional div (Racional a, Racional b){
        int num = a.num * b.den;
        int den = a.den * b.num;
        return new Racional(num, den);    
    }    
    
    public static void main(String[] args) {
        Racional a = new Racional (3, 2);
        Racional b = new Racional (5, 7);
        System.out.println(a);
        System.out.println(b);
        Racional soma = NumRacional.add(a, b);
        System.out.println(soma);
        Racional subtrai = NumRacional.subt(a, b);
        System.out.println(subtrai);
        Racional multiplica = NumRacional.mult(a, b);
        System.out.println(multiplica);
        Racional divide = NumRacional.div(a, b);
        System.out.println(divide);
        
    }
}