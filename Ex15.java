import util.Keyboard;

public class Ex15 {
    public static void main(String[] args) {

        //Desenvolver um programa que pergunte o nome e o salário bruto de 10 pessoas, e exiba nome, valor da alíquota
        //do imposto de renda, e o salário já com o desconto realizado, sabendo-se que:

        String nome;
        double sal, imposto, salarioliquido ;

        for(double cont = 1; cont <= 10; cont++) {

            nome = Keyboard.readText("INFORME  O SEU NOME: ");
            sal = Keyboard.readDouble("INFORME O SEU SALÁRIO: ");

            if(sal < 600.00){
                imposto = 0;
                System.out.println("INSENTO");

            }else if (sal >= 600.00 && sal <= 1499.99 ) {
                imposto = sal * 0.10;

                } else {
                    imposto = sal * 0.15;  
                } 

                salarioliquido = sal - imposto;

                   System.out.println("Nome: " + nome);
                    System.out.println("Imposto: R$ " + imposto);
                    System.out.println("Salário líquido: R$ " + salarioliquido);
                    System.out.println("---------------------------");
                }
                
            }
    }
   


