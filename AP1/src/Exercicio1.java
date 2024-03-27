
    public class Exercicio1 {
		public static void main(String args[]){
			int n = 15;
			
			for(int i = 0; i < n; ++i) {
				System.out.println(fibonacci(i) + "");
			}
			
		}
		public static int fibonacci(int n) {
			if (n <= 1) {
				return n;
			}
			return fibonacci (n - 1) + fibonacci(n -2);
		}
}

    
