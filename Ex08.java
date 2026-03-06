import util.Keyboard;

public class Ex08 {
    public static void main(String[] args) {

        //Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa, sexo e idade, e exiba o nome
        //inteiro das pessoas que são do sexo masculino e possuem 21 anos ou mais.

        int idade;
        String nome, sexo;
        

        

        for(int cont = 1; cont <= 20; cont++){

            nome = Keyboard.readText("INSIRA A SEU NOME: ");
            idade = Keyboard.readInt("INSIRA A SUA IDADE: ");
            sexo = Keyboard.readText("INSIRA O SEU SEXO (M/F): ");

            if (idade >= 21 && (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino"))){
                System.out.println("========================================");
                System.out.println("Candidato SELECIONADO: " + nome);
                System.out.println("========================================");


            }
           
        }
    

    }
}
