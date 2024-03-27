public class Exercicio2 {
	
        public static void main(String args[]) {
            int numero_max = 100, contador; // Definindo variáveis
            
               System.out.println("Imprimindo todos os números primos entre 1 e " + numero_max + "\n");
            
            for(int numero = 2 ; numero < numero_max ; ++numero) { // Loop para 
                contador = 0; // Atribuindo 0 à variável contador
                
                   for (int divisor = 2; divisor <= numero / 2; divisor++) {
                       if (numero % divisor == 0) {
                           contador++; /* Variável contador muda de valor se o número atual for divisível por um
                                          diferente de 1 ou ele mesmo */
                           break;
                       }
                   }
                   
                   if (contador == 0) { /* Verifica se a variável contador mudou de valor. Se sim, não imprime nada,
                                              se o valor continuar 0, imprime um número primo*/
                       System.out.println(numero);
                   }
            }
            
        }
    }

