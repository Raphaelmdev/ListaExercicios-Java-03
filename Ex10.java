import util.Keyboard;
public class Ex10 {
    public static void main(String[] args) {
        
        int num;
        int fatorial = 1;

            num = Keyboard.readInt("INFORME UM NÚMERO: ");

            for(int cont = 1; cont <= num; cont++) {
                fatorial *= cont;
            }
            System.out.println("A fatorial de " + num + " é " + fatorial);

    }
}
