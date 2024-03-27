 public class Exercicio4 {
    static boolean numeroPerfeito(int num){
       int divisores = 1;
       int limite = (int) Math.sqrt(num) + 1;
       
       for (int i = 2; i < limite; i++){
           if (num % i == 0) {
               divisores += i;
               
               if (i != num/i) {
                   divisores += num/i;
                   
               }
           }
           
       }
       return divisores == num;
   }
    public static void main(String agrs[]) {
        int contador = 0;
        int candidato = 6;
        
        while (contador < 4){
            if (numeroPerfeito(candidato)) {
                System.out.println(candidato);
                contador++;
            }
            candidato++;
        }
        
    }

}