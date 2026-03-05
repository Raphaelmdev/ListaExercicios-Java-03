import util.Keyboard;

public class Exercício11 {
    public static void main(String[] args) {


        // Elaborar um programa que apresente o valor de uma potência de uma base qualquer (Variável  b) elevada a um 
        //  expoente qualquer (Variável e), ou seja, de b^e. (Sem usar Math.pow();)

            double pot = 1;
            double b, e;
            int cont = 1;

             b = Keyboard.readInt("INSIRA A BASE B: ");
             e = Keyboard.readInt("INSIRA A BASE E: ");

            while (cont <= e) {

                pot = pot * b;
                
                cont++;
                
            }

            System.out.println(pot);
    }
    
}
