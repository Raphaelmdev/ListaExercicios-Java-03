import util.Keyboard;

public class Ex14 {
    public static void main(String[] args) {


        //14) Desenvolver um programa que pergunte nome, nota1 e nota2 de cada um dos 15 alunos de uma turma. E exiba
        //a listagem contendo nome, nota1, nota2, média e apresente “APROVADO” se a média for maior ou igual a 5, e
        //“REPROVADO” se a média for menor que 5. Ao final, exibir também a média da turma.

     
        Double nota1, nota2, media;
        double media2 = 1;

        for(double cont = 1; cont <= 15; cont++) {

            String nome = Keyboard.readText("INFORME SEU NOME: ");
            nota1 = Keyboard.readDouble("INFORME SUAS NOTAS (NOTA1)");
            nota2 = Keyboard.readDouble("INFORME SUAS NOTAS (NOTA2)");

            media = (nota1 + nota2) / 2;
            
            
            if(media >= 5) {
                System.out.println("APROVADO");
            }else if (media <= 5){
                System.out.println("REPROVADO");
            }
            System.out.println("--------------------------");
            media2 += media;
            
        } 

        System.out.println("A média total da turma: " + media2);
        System.out.println("--------------------------");
    }

    
}
