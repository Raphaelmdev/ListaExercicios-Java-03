import util.Keyboard;

public class Ex03 {
    public static void main(String[] args) {
        //Desenvolver um programa que apresente os resultados de uma tabuada de um número qualquer informado
       //pelo usuário.

        int n,r;



        n = Keyboard.readInt("INSIRA UM NÚMERO PARA GERAR A TABUADA: ");

        for(int mul = 1; mul <= 10; mul++){

            r = n * mul;
            
            System.out.println(n + " . " + mul  + " = " + r);

        }
        
    }
}
