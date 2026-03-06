import util.Keyboard;

public class Ex02 {
    public static void main(String[] args) {

        //Desenvolver um programa que apresente o total da soma de n números inteiros do número 1 até n, onde n é um
        //valor informado pelo usuário.

        int n;
        int soma = 0;

        n = Keyboard.readInt("INSIRA UM NÚMERO: ");

        for(int i = 1; i <= n; i++ ){
            soma += i; // soma = soma + i;
            
        }
        System.out.println("A soma de 1 até " + n + " é: " + soma );
    }
    
}
