import util.Keyboard;

public class Exercício13 {
    public static void main(String[] args) {

        //13) Desenvolver um programa que imprima a tabuada de 3 a 6.

                    int a = 3, b = 0;
                    
                    while(a <= 6 ){

                            System.out.println("====================================");
                            System.out.println("----- CALCULADORA AUTOMÁTICA -----");
                            System.out.println("====================================");
                            
                            b = 0;
                        while (b <= 10) {

                            System.out.println(a + " x " + b + " = " + (a * b));

                            b++;

                        }
                        a++;
                    }
                    System.out.println("====================================");
                    System.out.println("====================================");
                }
            }
