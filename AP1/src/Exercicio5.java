public class Exercicio5 {
    public static void main(String[] args) {
		String frase = "Os nomes das classes em java precisam começar com uma letra e depois destas quaisquer combinações de letras e dígitos. Como padrão, os nomes são substantivos que iniciam com uma letra maiúscula. Para as constantes é costume utilizar sempre letras maiúsculas nos nomes.";
		int contador = 0;
		char letra;
		
		for(int i = 0; i < frase.length() ; ++i) {
			
			letra = frase.charAt(i);
			if(letra == 'a' || letra == 'ã' || letra == 'à' || letra == 'á') {
				contador++;				
			}

		}
        System.out.println("A letra 'a' apparece " + contador + " vezes na frase.");
	}
  
}
