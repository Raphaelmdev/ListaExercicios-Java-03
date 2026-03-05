public class Exercício04 {

    public static void main(String[] args) {
        
            //4) Desenvolver um programa que apresente o valor da soma dos cem primeiros números inteiros (1 + 2 + 3 + 4 + ... 
            //+ 97 + 98 + 99 + 100)

            int x = 0;

            while(x <= 100){
                int s = x + x;
                System.out.println(s);
                x++;
            }

    }
}