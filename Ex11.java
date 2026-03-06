public class Ex11 {
    public static void main(String[] args) {
        //Desenvolver um programa que triangule uma matriz de ordem 10.
        //Deverá aparecer como resposta algo assim na tela:

        for(int cont = 1; cont <= 10; cont++) {
            for (int cont2 = 1; cont2 <= 10; cont2++){
                
                System.out.print(cont + "-" + cont2 + "  ");
                if (cont != 10){
                    System.out.print(cont + "-" + cont2 + "  ");

                } else {
                    System.out.print(cont + "-" + cont2 + " ");
                    
                }
            }
            System.out.println();
    
        }
        
    }
}