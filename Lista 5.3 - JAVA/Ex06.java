import util.Keyboard;

public class Ex06 {
    public static void main(String[] args) {

        //Desenvolver um programa que apresente o valor de uma potência de uma base qualquer elevada a um expoente
        //qualquer, ou seja, de b e, onde os valores de b e e são fornecidos pelo usuário, sem utilizar Math.pow().

       int bas;
       int exp;

       bas = Keyboard.readInt("INSIRA O VALOR DA POTÊNCIA: ");
       exp = Keyboard.readInt("INSIRA O VALOR DO EXPOENTE: ");

       for(int cont = 1; cont <= bas; cont++){
       }
            System.out.println((bas + "^" + exp + " = " + (bas * exp)));
        
    }
    
    
}
