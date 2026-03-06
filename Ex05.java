public class Ex05 {
    public static void main(String[] args) {

        //5) Desenvolver um programa que apresente as potências de 2, variando de 0 a 10.

        int pot = 1;

        for(int cont = 1; cont <= 10; cont++){
            pot *= 2;
            System.out.println("2" + "^" + cont + " = " +pot);
        }
        
    }    
}
