
public class TestaExcecao {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			m1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problema!");
		}
		System.out.println("Fim main");
	}

	private static void m1() {
		System.out.println("Inicio m1");
		m2();
		// Ao inves de colocar o try exception no m2 pode-se colocar no metodo estatico
		// try {
		// m2();
		// }catch(ArrayIndexOutOfBoundsException e) {
		// Problema é pq i<6 ao inves de i<5
		// System.out.println("Problema!");
		// }
		System.out.println("Fim m1");
	}

	private static void m2() {
		System.out.println("Inicio m2");

		int[] nums = new int[5];
		// i<6 da erro
		for (int i = 0; i < 6; i++) {
			// Ao inves de colocar o try exception no m1 pode-se colocar no metodo estatico
			// try {
			nums[i] = i * 2;
			// System.out.println(nums[i]);
			// } catch(ArrayIndexOutOfBoundsException e) {
			// Problema é pq i<6 ao inves de i<5
			// System.out.println("Problema!");
			// }
		}

		System.out.println("Fim m2");
	}

}
