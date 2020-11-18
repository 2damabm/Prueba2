
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		try {
			p = rt.exec("firefox");
			InputStreamReader leer = new InputStreamReader(null);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
