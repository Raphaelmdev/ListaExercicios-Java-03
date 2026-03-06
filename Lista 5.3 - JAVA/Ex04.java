public class Ex04 {
    public static void main(String[] args) {

        //4) Desenvolver um programa que apresente todos os números divisíveis por 5 que sejam menores que 50.

            for(int cont = 50; cont >= 5; cont--){
                if( cont % 5 == 0){
                    System.out.println(cont);
                }
            }
        
    }
}
