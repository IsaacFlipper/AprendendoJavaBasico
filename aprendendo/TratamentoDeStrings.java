public class TratamentoDeStrings {
	public static void main(String[] args) {
		String texto = "meu nome é isaac";
		String texto1 = " e sou de mais";
		int contadorCaracter = texto.length();

		System.out.println("texto1: "+texto+"\ntexto2: "+texto1+"\n");
		System.out.println("texto: "+texto);
		System.out.println("quantas letras tem na variavel texto: "+contadorCaracter);
		System.out.println("maiuscula: "+texto.toUpperCase());
		System.out.println("minuscula: "+texto.toLowerCase());
		System.out.println("procura 'nome' no texto: "+texto.indexOf("nome"));
		System.out.println(texto+texto1);
	}
}
