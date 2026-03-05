import util.Keyboard;

public class Exercício09 {
    public static void main(String[] args) {
        //9) Elaborar um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500. Utilize 
        //um laço que efetue a variação de 2 em 2.


                 int contador = 0;
                 int soma = 0;

                 while (contador <= 500) {
                    soma = contador + soma;

                   if (contador % 2 == 0) {
                    
                    
                    
                   }
                   contador = contador + 2;
                 }
                 System.out.println(soma);
    
}
}