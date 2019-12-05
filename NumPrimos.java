import java.util.ArrayList;

class NumPrimos {
    // Verificando se um número é primo
    boolean ePrimo (int num){
        if (num == 1) return false;
        
        else{
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
        }
    }  
    public static void main(String[] args) {
        ArrayList <Integer> Primos = new ArrayList();
        NumPrimos e = new NumPrimos();
        // Listando 50 primeiros números primos
        for (int i=1; i<50; i++){
            if(e.ePrimo(i)) Primos.add(i);
        }
        System.out.println("Lista de números primos: "+Primos);
    }  
}