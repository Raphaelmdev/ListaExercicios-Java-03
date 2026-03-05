public class Exercício03 {
    public static void main(String[] args) {
        
        //3) Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200.

        int i = 15;
        
        while(200 >= i){
            double f = Math.pow(i,2);
            System.out.println(f);
            i++;
        }
    }
}
