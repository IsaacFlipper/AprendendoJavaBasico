public class JavaArray {
	public static void main(String[] args) {
		String[] itens = {"nome", "isaac", "tudo bem?", "12"};
		// System.out.println(itens);
		// System.out.println(itens.length);
		for (int i = 0; i < itens.length;i++){
			System.out.println(itens[i]);
		}
		for (int i = 0;i < itens.length;i++){
			System.out.println("Numero aleatorio entre 1 a 10: "+(int)(Math.random()*100));
			System.out.println("itens do array: "+itens[i]);
		}
		for (String i: itens) {
			System.out.println(i);
		}
	}
}