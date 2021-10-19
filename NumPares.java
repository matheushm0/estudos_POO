import java.util.ArrayList;
import java.util.Scanner;


public class NumPares {
    
  
    public static void main(String[] args) {
        ArrayList <Integer> numPares = new ArrayList();
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = ent.nextInt();
        
        if(num%2 == 0){
            numPares.add(num);
            System.out.println("Número adicionado!");
            System.out.println("Números pares: "+ numPares);
        }
        else{
            System.out.println("Número não adicionado");
            System.out.println("Números pares: "+ numPares);
        }
        
    }
    
}
