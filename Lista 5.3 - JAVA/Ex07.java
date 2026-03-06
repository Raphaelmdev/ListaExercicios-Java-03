public class Ex07 {
    public static void main(String[] args) {
        //7) Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa de 3 até 21.

        int soma = 0;
        

        for(int cont = 3 ; cont <= 21; cont++ ){
            
            if (cont % 2 == 0){
                soma += cont;
            }        
        
    }
    System.out.println(soma);
    
    
}
}