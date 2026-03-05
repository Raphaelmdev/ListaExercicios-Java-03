import util.Keyboard;

public class Exercício12 {
    public static void main(String[] args) {



        //12) Desenvolver um programa que peça ao usuário para digitar diversos números reais, e ao final, exibir o maior e o 
        //menor número que foram digitados, além da média entre TODOS os números digitados pelo usuário. A inserção 
        //de números deve parar quando o usuário digitar o número  -1, e este número -1 não deve ser considerado nem 
        //como maior, nem como menor, e nem na contagem da média.
        double num , menor, maior, cont = 1, soma = 0, media ;
        

        num = Keyboard.readInt("INSIRA UM NÚMERO PARA INICIAR (-1 PARA O PROGRAMA): ");

        menor = num;
        maior = num;

        while (num != -1) {
            
        num = Keyboard.readInt("INSIRA UM NÚMERO PARA INICIAR (-1 PARA O PROGRAMA): ");
            
                if (cont > num){
                menor = num;
                if (cont < num )
                    menor = num;
            }  

            soma = soma + soma;

            num = Keyboard.readInt("INSIRA UM NÚMERO PARA INICIAR (-1 PARA O PROGRAMA): ");
            cont ++;
        }

        media = soma / (cont - 1);

        if (menor == -1){
            System.out.println("Você respondeu -1 na primeira pergunta");
        } else {
            System.out.println("O menor valor inserido foi :" + menor);
            System.out.println("O maior valor inserido foi :" + maior);
            System.out.println("O maior valor inserido foi :" + media);
        }
        
        System.out.println("FIM DO PROGRAMA");


    }
}
