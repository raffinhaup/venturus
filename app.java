import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		int lucro = 0;
		int pago = 0;
		boolean compra = true;

		List<Integer> listaDoce = new ArrayList<Integer>();

		/**
		 * Resultado 7
		 */

		// listaDoce.add(7);
		// listaDoce.add(1);
		// listaDoce.add(5);
		// listaDoce.add(3);
		// listaDoce.add(6);
		// listaDoce.add(4);

		/**
		 * Resultado 22
		 */

		// listaDoce.add(3);
		// listaDoce.add(2);
		// listaDoce.add(7);
		// listaDoce.add(3);
		// listaDoce.add(5);
		// listaDoce.add(7);
		// listaDoce.add(10);
		// listaDoce.add(8);
		// listaDoce.add(6);
		// listaDoce.add(5);
		// listaDoce.add(15);
		// listaDoce.add(1);

		/**
		 * Resultado 0
		 */
		listaDoce.add(7);
		listaDoce.add(2);
		listaDoce.add(1);

		for (int i = 0; i < listaDoce.size(); i++) {

			if (compra) {
				if ((i == listaDoce.size() - 1) || listaDoce.get(i) < listaDoce.get(i + 1)) {
					compra = false;
					pago = listaDoce.get(i);
				}
			} else if ((i == listaDoce.size() - 1) || (listaDoce.get(i) > listaDoce.get(i + 1))) {
				compra = true;
				lucro += listaDoce.get(i) - pago;
			}
		}

		System.out.println(lucro);

	}

}