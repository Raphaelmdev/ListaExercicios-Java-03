public class Exercício15 {
    public static void main(String[] args) {

        // Desenvolver um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é 
        //formada pela sequência 1,1,2,3,5,8,13,21,34, ... etc. Ela se caracteriza pela soma de um termo posterior com seu 
        //anterior subsequente.


        int pos= 1, ant = 1, cont = 1, controle;

        while (cont <= 15) {
          
            System.out.print(ant + ",");
            
            controle = pos + ant;

            ant = pos;
            pos = controle;

            cont++;
            
        }
    }
}
