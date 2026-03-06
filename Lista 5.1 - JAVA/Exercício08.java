

public class Exercício08 {
    public static void main(String[] args) {

        // Desenvolver  um  programa  que  apresente  todos  os  valores  numéricos  inteiros  ímpares  situados  na  faixa  de  0  a 
        // 20.  Para  saber  se  o  número  é  ímpar,  será  necessário  verificar  essa  condição  com  o  comando  if.  Sendo  ímpar, 
       //  mostre-o; não sendo, passe para o próximo passo.


                 int contador = 0;

                 while (contador <= 20) {

                   if (contador % 2 == 1) {
                    System.out.println(contador);
                    
                   }
                   contador++;
                 }
        
    }
}
