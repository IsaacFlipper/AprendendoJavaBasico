public class OperadoresLogico{
	public static void main(String[] args) {
		int x = 10, y = 5;
		float z = x * y / 2;
		boolean teste0 = (x / y) > 0.5f;
		boolean teste1 = (x * y) >= z;
		boolean teste2 = (x * y / 2) < z;
		boolean teste3 = (x / 2) + y <= z;
		boolean teste4 = (y / 2 * x) == z;
		boolean teste5 = z == y*5;
		boolean teste6 = z != x;
		boolean teste7 = (x < z) && (x > y);
		boolean teste8 = (x < z)||(x == y);

		System.out.println("x:"+x+"\ny:"+y+"\nz:"+z+"\n");
		System.out.println("x/y > 0.5 = "+teste0);
		System.out.println("x*y >= z="+teste1);
		System.out.println("x*y/2 < z="+teste2);
		System.out.println("(x/2)+y <= z="+teste3);
		System.out.println("(y/2*x == z="+teste4);
		System.out.println("x+z == y*5="+teste5);
		System.out.println("z != x="+teste6);
		System.out.println("(z < z) && (x > y)="+teste7);
		System.out.println("(x < z) || (x == y)="+teste8);
	}
}