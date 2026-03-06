
import util.Keyboard;

public class Ex09 {
    public static void main(String[] args) {
        //Desenvolver um programa que pergunte um número inteiro e exiba os números que são, ao mesmo tempo,
        //múltiplos de 3 e 5, na sequência de 1 até o número informado pelo usuário.

        int num, resto3, resto5;

        num = Keyboard.readInt("INSIRA UM NÚMERO: ");

        for(int cont = 1; cont <= num; cont++){
            resto3 = cont % 3;
            resto5 = cont % 5;
            if( ( resto3 == 0 ) && ( resto5 == 0 ) ) {
                            System.out.println(cont + " É multiplo de 3 e 5 ao mesmo tempo");
            }
        }


        }
        
    }
    

