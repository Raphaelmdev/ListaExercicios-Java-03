//5) Desenvolver um programa que apresente os resultados de uma tabela de um número qualquer. Ela deve ser
        //impressa no seguinte formato:
        //Considerando como exemplo o fornecimento do número 2
            //2 . 1 = 2
            //2 . 2 = 4
            //2 . 3 = 6
            //2 . 4 = 8
            //2 . 5 = 10
            //(...)
            //2 . 10 = 20

            int cont = 1, i = 0;


            while(cont <= 10){
                i = cont * 2;
                System.out.println("2 . " + cont + " = " + i );
                cont++;
            }
