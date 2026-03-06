public class Ex12 {
    public static void main(String[] args) {
        //Agora faça uma alteração para que sejam apresentados somente os itens acima da diagonal principal da matriz
        //anterior. No lugar que não é para exibir a triangulação, deverá aparecer x-x. Deverá aparecer como resposta
        //algo assim na tela:

        for(int cont = 1; cont <= 10; cont++) {
            for (int cont2 = 1; cont2 <= 10; cont2++){
                
                System.out.print(cont + "-" + cont2 + "  ");
                if (cont >= cont2){
                    System.out.print("x-x ");

                } else {
                    System.out.print(cont + "-" + cont2 + " ");
                }
            }
            System.out.println();
    
        }
        
    }
}
