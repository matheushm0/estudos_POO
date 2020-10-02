import java.util.Scanner;

public class FuncLamp {
    public static void main(String[] args) {

        Lamp l = new Lamp();

        l.verifica();

        System.out.println("Para ligar a lâmpada digite true e para desligar digite false.");

        Scanner sc = new Scanner(System.in);

        boolean n = sc.nextBoolean();

        l.setStatus(n);

        l.verifica();

    }

}
