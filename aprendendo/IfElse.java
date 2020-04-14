public class IfElse {
	public static void main(String[] args) {
		/* int numero0 = 50;
		int numero1 = 20;
		String saida;
		if (numero0 > numero1) {
			saida = "numero0 é maior que numero1!";
		}
		else {
			saida = "numero0 não é maior que numero1";
		}*/
		int idade;
		boolean rg;
		String saida;
		idade = 18;
		rg = true;
		if ((idade >= 18)&&(rg)) {
			saida = "essa pessoa ta apta a entra no clube!";
		}
		else if ((idade >= 18)&&!(rg)) {
			saida = "essa pessoa sem rg não pode entra no clube!";
		}
		else if((idade < 18)&&(rg)){
			saida = "essa pessoa é de menor não pode entra no clube!";
		}
		else{
			saida = "essa pessoa não esta apta a entra no clube!";
		}
		System.out.println(saida);
	}
}
