public class Variaveis {
	public static void main(String[] args) {
		final int idadeMinima = 18; /* final não é uma variavel pois variaveis são multaveis 
		e final é uma constante por isso idadeMinima for executada no programa ela não pode ser mudada enquanto o programa estiver rodando*/

		byte numerosAte127 = 20; // numeros byte so recebem numeros inteiros com o tamanho maximo de 0 a 127;
		int inteiro = 120; // numeros inteiros não recebem numeros flutuantes 
		long numeroMuitoAlto = 1000000; // numeros long so recebem numeros inteiros
		float flutuantes1 = 10.3f; // numeros flutuantes não recebem numeros inteiros
		double flutuantes2 = 10.3f; // numeros flutuantes não recebem numeros inteiros
		char letraOuCaractere = 'A'; // char so recebe um caractere que esteja e aspas simples
		String palavras = "meu nome é isaac"; // strings recebem qualquer conjunto de caractere com tanto que esteja em aspas duplas
	}
}